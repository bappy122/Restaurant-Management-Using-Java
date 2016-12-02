package Frames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAPPY
 */

import Database.DbConnection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String user;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    

    public Login() {
        initComponents();
        setTitle("Login");
        this.setLocationRelativeTo(null);
        con = DbConnection.dbConnector();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        loginButon = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHelp = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("User Name");
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 128, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 178, -1, -1));

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 128, 235, -1));

        loginButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButon.setText("Login");
        loginButon.setActionCommand("");
        loginButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButonActionPerformed(evt);
            }
        });
        loginButon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButonKeyPressed(evt);
            }
        });
        jPanel1.add(loginButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 241, 80, -1));

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 178, 235, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 48, 135, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/background.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 370));

        jMenuHelp.setText("Help");
        jMenuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHelpMouseClicked(evt);
            }
        });
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuHelp);

        jMenuAbout.setText("About");
        jMenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButonActionPerformed
        // TODO add your handling code here:
        
        
          
          String sql = "select * from admin where Name=? and Password=?";
          String sql2 = "select * from user where Name=? and Password=?";
          
          try
          {
                if(jTextFieldUserName.getText().equals("") ||  String.valueOf(jPasswordField.getPassword()).equals(""))
                {
                    if(jTextFieldUserName.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "Please Enter Username to Login...!");
                    else
                        JOptionPane.showMessageDialog(null, "Please Enter Password to Login...!");
                }
                else
                {
                    int flag = 0;

                    pst = con.prepareStatement(sql);
                    pst.setString(1,jTextFieldUserName.getText());
                    pst.setString(2, String.valueOf(jPasswordField.getPassword()));
                    rs = pst.executeQuery();
            
                    if(rs.next())
                    {

                         JOptionPane.showMessageDialog(null, "You logged in as Admin");
                         flag = 1;
                         Bill b = new Bill(1);
                         b.userName = jTextFieldUserName.getText();  
                         
                         pst.close();
                         rs.close();
                         Features f = new Features();
                         f.setAccountType("Admin");
                         f.setVisible(true);
                         dispose();
                         
                    }
                 
                    if(flag != 1)
                    {
                        //checking for non admin users
                    
                          pst=con.prepareStatement(sql2);
                          pst.setString(1,jTextFieldUserName.getText());
                          pst.setString(2, String.valueOf(jPasswordField.getPassword()));
                          rs=pst.executeQuery();
                    
                          if(rs.next())
                            {
                                 JOptionPane.showMessageDialog(null, "You logged in as User");
                                 Bill b = new Bill(1);
                                 b.userName = jTextFieldUserName.getText();
                                // user = 
                                 pst.close();
                                 rs.close();
                         
                                 Features f = new Features();
                                 f.setAccountType("User");
                                 f.accountIdentifier();
                                 f.setVisible(true);
                                 dispose();
                            }
                          else
                            {
                                pst.close();
                                rs.close();
                                JOptionPane.showMessageDialog(null, "Username  and  Password  didn't  Match..!");
                            }
                        pst.close();
  
                    }
                    
                } 
            
          }
          catch(Exception e)
          {
                JOptionPane.showMessageDialog(null, e);
          }   
    }//GEN-LAST:event_loginButonActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
            // TODO add your handling code here:
    
    }//GEN-LAST:event_jMenuHelpActionPerformed

    private void jMenuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHelpMouseClicked
        // TODO add your handling code here:
             JOptionPane.showMessageDialog(null, "You need to enter the Username & Password.");
    }//GEN-LAST:event_jMenuHelpMouseClicked

    private void jMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutMouseClicked
        // TODO add your handling code here:
          About a = new About();
          a.setVisible(true);

    }//GEN-LAST:event_jMenuAboutMouseClicked

    private void loginButonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButonKeyPressed
        // TODO add your handling code here:  
        if((int)evt.getKeyChar()==10)
        {
            this.loginButonActionPerformed(null);
        }
    }//GEN-LAST:event_loginButonKeyPressed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        // TODO add your handling code here:
        if((int)evt.getKeyChar()==10)
        {
            this.loginButonActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JButton loginButon;
    // End of variables declaration//GEN-END:variables
}
