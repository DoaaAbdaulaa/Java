/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserServices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aya
 */
public class Client {
     Connection conn = null;
     Statement stmt = null;
     String sql;
     ResultSet rs=null;
   // boolean b;
    
 /////////////////////////PUBLIC insert Data of new user in DataBase///////////
     public ResultSet Sign_Up(String fn,String ln,String birth,String ge, String email, String pass,String count,String pic, int nu, String stat )  {
        try {
            connectionDB con=new connectionDB();
            conn= con.Connect("jdbc:mysql://localhost:3306/JavaDB", "root", "aya");
            
            
           // System.out.println("Inserting records into the table...");
            stmt=(Statement) conn.createStatement();
            
            sql = "insert into user (first_name,last_name,birth_date,gender,email,password,country,picture,phone_number,status)"+"values('"+fn+"','"+ln+"','"+birth+"','"+ge+"','"+email+"','"+pass+"','"+count+"','"+pic+"','"+nu+"','"+stat+"')";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    
}

    public void Sign_Up(String text, String string, String text0, String string0, String text1, String string1, String text2, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ////////////////////////////////////////////Sign in
    public ResultSet signin(String email,String pass){
    
    try {
            connectionDB con=new connectionDB();
            conn= con.Connect("jdbc:mysql://localhost:3306/JavaDB", "root", "aya");
            stmt=(Statement) conn.createStatement();
            sql = "select *  from user where email='"+email+"' and password ='"+pass+"'";
            rs=stmt.executeQuery(sql);
          //  return rs;
            } catch (SQLException ex) {
                  Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                 // System.out.println(rs);  
                 
              }
     return rs;
    
    }
    
}
