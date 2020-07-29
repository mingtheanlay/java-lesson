package AddUserToDatabase;


import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thean
 */
public class DB {
    public static Connection getConnection() {
        Connection con = null;
         try {
            String url = "jdbc:sqlserver://localhost:1433; DatabaseName=users;"
                    + "user=sa; password=mcuser@3012";
            con = DriverManager.getConnection(url);
      
            System.out.println("Connected"); 
        }
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Cannot Connect to Database ");
        }
         
        return con;
    }
}   
