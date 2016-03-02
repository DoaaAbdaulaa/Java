/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAction;
import UserServices.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aya
 */
public class Signin {
    String getDate;
    ResultSet st;
    boolean checked;
    
    public boolean check(String date){
    getDate=date;
        System.out.println(getDate);
    String[] parts = getDate.split(",");
    Client c=new Client();
      System.out.println("****"+parts[1]);
      st=c.signin(parts[1], parts[2]);
        
    
        try {
            if(st.next()==true){
           // return st.next();
           checked=true;
            }
            else{
                checked=false;
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return checked;
    
    
    
    
    }
}
    

