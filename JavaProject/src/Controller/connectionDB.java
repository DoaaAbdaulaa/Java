/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aya
 */
public class connectionDB {
    Connection connection=null;
    public  Connection Connect(String url, String username,String password){
    System.out.println("Connecting database...");

        try {
             connection = DriverManager.getConnection(url, username, password);
             System.out.println("Done Connect");
        } catch (SQLException ex) {
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    return connection;
    }
}

 
    
    

