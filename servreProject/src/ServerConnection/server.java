/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerConnection;

import UserAction.Signin;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Vector;

/**
 *
 * @author aya
 */
public class server extends Thread {

    DataInputStream dis;

    PrintStream ps;
    boolean checkdate;

    static Vector<server> clientsVector = new Vector<server>();

    public server(Socket cs) {
        try {
            System.out.print("jjjjjjjjjjjj");

            dis = new DataInputStream(cs.getInputStream());
            System.out.println(dis);
            System.out.print("jjjjjjjjjjjj111111");

            ps = new PrintStream(cs.getOutputStream());

            System.out.println(ps);
            clientsVector.add(this);

            start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void run() {

        while (true) {
            try {
               //  dis = new DataInputStream(s.getInputStream ());
                //ps = new PrintStream(s.getOutputStream ());
               // System.out.println(ps);
                  String msg = dis.readLine();
                  System.out.println(msg);
               
              //  String str = dis.readLine();

                if (msg.equals("$close$")) {
                    clientsVector.remove(this);
                    dis.close();
                    ps.close();

                } else {
                  
                String[] parts = msg.split(",");
                
                if(parts[0].equals("1")){
                    System.out.println("Sign In");
                    Signin sign=new Signin();
                    checkdate=sign.check(msg);
                    System.out.println(checkdate);
                    
                    ps.println(checkdate);
                    //sendMessageToAll(msg);
                }
                else if(parts[0].equals("2")){
                    
                
                
                
                }
            }} catch (IOException ex) {
                ex.printStackTrace();
            }

        

    
        }}
   /* void sendMessageToAll(String msg) {
        for (server ch : clientsVector) {
            ch.ps.println(msg);
        }
    }*/
    
}
