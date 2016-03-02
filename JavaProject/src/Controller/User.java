/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aya
 */
public class User {
   Connection conn = null;
   Statement stmt = null;
   String sql;
   ResultSet rs=null;
   connectionDB con=new connectionDB();
   boolean checkmail;
   boolean checkpass;
   private String fristName;
   private String lastName;
   private Date birthday;
   private String gender;
   private String email;
   private String password;
   private String country;
   private String pic;
   private String phone;
   private String status;
   
   public User() {
    
}
   public User(String fristName,String lastName,Date birthday,String gender,String email,String password,String country,String pic,String phone) {
          this.fristName=fristName;
          this.lastName=lastName;
          this.birthday=birthday;
          this.gender=gender;
          this.email=email;
          this.password=password;
          this.country=country;
          this.pic=pic;
          this.phone=phone;
         // this.status=status;
          
}
   //////////////// get and set frist name ////////////////
   public void setFristName(String fristName){
       this.fristName=fristName;
   }
    public String getFristName(){
       return fristName;
   }
    ///////////////// get and set last name ////////////////
    public void setLastName(String lasName){
       this.lastName=lasName;
   }
     public String getLastName(){
       return lastName;
   }
   //////////////// get and set email////////////////
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    //////////////// get and set birthDay ////////////////
    public void setBirthDay(Date birthday){
        this.birthday=birthday;
    }
    public Date getBirthDay(){
        return birthday;
    }
    //////////////// get and set Gender ////////////////
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    //////////////// get and set password ////////////////
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    //////////////// get and set Country ////////////////
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
    //////////////// get and set pic ////////////////
   public void setPic(String pic){
       this.pic=pic;
   }
   public String getPic(){
       return pic;
   }
   //////////////// get and set phone ////////////////
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String  getPhone(){
        return phone;
    }
    //////////////// get and set status ////////////////
    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return status;
    }
    
    
   ///////////////////////////Validation Function ////////////////////////////////////// 
    public boolean validation(){
        
    checkmail=validEmail(email);
    checkpass=validpassword(password);
    if(fristName.equals("")&&lastName.equals("")&&birthday.equals("")&&gender.equals("")&&checkmail&&checkpass && country.equals("")&&phone.equals("") ){
    return false;
    
  }
    else{
    
    return true;  
    
    }    
 
    
    
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
 
    public boolean validEmail(String Email){
       String pattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
       if(Email.equals("")){
           JOptionPane.showMessageDialog(null,"You must enter email ");
           return false;
       }
       else{
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(Email);
             if (m.find()){
                 JOptionPane.showMessageDialog(null,"valied Email ");
                 System.out.println("pattern matched");
                 return true;
             }
             else{
                 JOptionPane.showMessageDialog(null,"invalid Email");
                 System.out.println("pattern not match");
                 return false;
             }
          
       }
       
   }
   
   public boolean validpassword(String password){
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,10}";
        if(password.equals("")){
            JOptionPane.showMessageDialog(null,"you Must Enter The Password ");
         return false;
        }
        else{
            if(password.matches(pattern)){
                JOptionPane.showMessageDialog(null,"password valied");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null,"password invalied");
                return false;
            }
        }
   }
    
    
    
 /////////////////////////PUBLIC insert Data of new user in DataBase///////////
    /* public void Sign_Up(String fn,String ln,String birth,String ge, String email, String pass,String count,String pic, int nu, String stat )  {
        try {
            
            conn= con.Connect("jdbc:mysql://localhost:3306/JavaDB", "root", ""); 
           // System.out.println("Inserting records into the table...");
            stmt=(Statement) conn.createStatement();
            
            sql = "insert into user (first_name,last_name,birth_date,gender,email,password,country,picture,phone_number,status)"+"values('"+fn+"','"+ln+"','"+birth+"','"+ge+"','"+email+"','"+pass+"','"+count+"','"+pic+"','"+nu+"','"+stat+"')";
            stmt.executeUpdate(sql);
          
          
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}

     public void addFrindToClient(){
         try{
          
        conn= con.Connect("jdbc:mysql://localhost/JavaDB", "root", ""); 
        stmt=conn.createStatement();

         System.out.println("Add new user ");
         JFrame frame = new JFrame();
         String name = JOptionPane.showInputDialog(frame, "Enter your friend Name  :) ");
         String sql1=new String("select * from user where first_name='"+name+"'");
         rs = stmt.executeQuery(sql1); 
         while(rs.next()){
            System.out.println(rs.getString(5));
            String friendEmail=rs.getString(5);
            if(friendEmail==""){
                
            
            }
            

            }

         }
         catch(SQLException ex){
             Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
   // public void Sign_Up(String text, String string, String text0, String string0, String text1, String string1, String text2, String string2) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    ////////////////////////////////////////////Sign in
    public ResultSet signin(String email,String pass){
    
    try {
            connectionDB con=new connectionDB();
            conn= con.Connect("jdbc:mysql://localhost:3306/JavaDB", "root", "");
            
            
           // System.out.println("Inserting records into the table...");
            stmt=(Statement) conn.createStatement();
            
            sql = "select *  from user where email='"+email+"' and password ='"+pass+"'";
            rs=stmt.executeQuery(sql);
               return rs;
          
          
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
               return rs;
        }
          
    }*/
}
