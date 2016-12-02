package Frames;


import Database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAPPY
 */
public class SignUp extends javax.swing.JFrame {
    PreparedStatement pst = null;
    Connection con2 = null;
    ResultSet rs = null;
    
    
    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
         setTitle("Sign Up");
        this.setLocationRelativeTo(null);
        con2 = DbConnection.dbConnector();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textRepeatPassword = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboAccountType = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("User Name");
        jPanel2.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 191, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 235, -1, -1));

        textUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(textUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 188, 280, -1));
        jPanel2.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 235, 280, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 38, 288, 42));

        confirmButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        confirmButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmButtonKeyPressed(evt);
            }
        });
        jPanel2.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 355, 93, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repeat Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 282, -1, -1));

        textRepeatPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRepeatPasswordActionPerformed(evt);
            }
        });
        textRepeatPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textRepeatPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(textRepeatPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 279, 280, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        backButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backButtonKeyPressed(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 355, 85, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 139, -1, -1));

        comboAccountType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        comboAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAccountTypeActionPerformed(evt);
            }
        });
        jPanel2.add(comboAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 136, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/signupBackground.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 770, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserNameActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Features f = new Features();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        
        String userName = textUserName.getText();
        String password = String.valueOf(textPassword.getPassword());
        String password2 = String.valueOf(textRepeatPassword.getPassword());
        if(textUserName.getText().equals("") || String.valueOf(textRepeatPassword.getPassword()).equals("") || String.valueOf(textRepeatPassword.getPassword()).equals("") )
        {
            JOptionPane.showMessageDialog(null, "You Must fill all three Boxes");
        }
        else
        {
            if(!password.equals(password2))
            {
                JOptionPane.showMessageDialog(null, "Passwords Didn't match!\n\nPlease enter again");
                
            }
            else
            {
                try
                {
                   String type = (String)comboAccountType.getSelectedItem();
                   if(type.equals("Admin"))
                   {
                       pst = con2.prepareStatement("Insert into admin values (?,?)");
                   }
                   else
                   {
                       pst = con2.prepareStatement("Insert into user values (?,?)");
                   }
 
                     pst.setString(1, userName);
                     pst.setString(2, password);
                     int i = pst.executeUpdate();
                     
                     if(i>0)
                     {
                        
                        JOptionPane.showMessageDialog(null, "Account Successfully Created!");
                        pst.close();
                        this.refresh();
                     }
                     else
                     {
                         pst.close();
                         JOptionPane.showMessageDialog(null, "Failed to Create Account");
                     }
                     
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed
    
    private void refresh()
    {
        textUserName.setText("");
        textPassword.setText("");
        textRepeatPassword.setText("");
        
    }
    private void comboAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAccountTypeActionPerformed
        // TODO add your handling code here:
         comboAccountType.getSelectedItem();
    }//GEN-LAST:event_comboAccountTypeActionPerformed

    private void textRepeatPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRepeatPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRepeatPasswordActionPerformed

    private void confirmButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmButtonKeyPressed
        // TODO add your handling code here:
        if((int)evt.getKeyChar()==10)
        {
            this.confirmButtonActionPerformed(null);
        }
    }//GEN-LAST:event_confirmButtonKeyPressed

    private void backButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backButtonKeyPressed
        // TODO add your handling code here:
         if((int)evt.getKeyChar()==10)
        {
            this.backButtonActionPerformed(null);
        }
    }//GEN-LAST:event_backButtonKeyPressed

    private void textRepeatPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRepeatPasswordKeyPressed
        // TODO add your handling code here:
          if((int)evt.getKeyChar()==10)
        {
            this.confirmButtonActionPerformed(null);
        }
    }//GEN-LAST:event_textRepeatPasswordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox comboAccountType;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JPasswordField textRepeatPassword;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
