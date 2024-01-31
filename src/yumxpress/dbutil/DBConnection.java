/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class DBConnection {
    private static Connection conn;
    static{
        try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-4K7C51L/xe", "yumxpress", "foodie");
            JOptionPane.showMessageDialog(null, "Connection Opened");
               }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null,"Cannot Open the Connection");
                   ex.printStackTrace();
            }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Cannot close the connection!");
            ex.printStackTrace();
        }
    }
}
