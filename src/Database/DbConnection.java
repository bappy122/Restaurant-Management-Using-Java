/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author BAPPY
 */
public class DbConnection {
    
    Connection con = null;
    
    public static Connection dbConnector()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:G:\\NetBeans\\Restaurant Management\\database.sqlite");
            //JOptionPane.showMessageDialog(null,"Connection Successful");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
