/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerConnection;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aya
 */
public class serverConnect {
        ServerSocket myServerSocket;
        Socket s;
        DataInputStream dis ;
        PrintStream ps;
        ////////////////////////////// Function to connect server/////////////////
        public ServerSocket connect(){
        
            try {
                 myServerSocket = new ServerSocket(5005);
                
                 System.out.println("connected");
                 return myServerSocket;
                  // dis = new DataInputStream(s.getInputStream ());
                   //ps = new PrintStream(s.getOutputStream ());

                   //String msg = dis.readLine();
                  // System.out.println(msg);
                   //ps.println("Data Received");
            } catch (IOException ex) {
                Logger.getLogger(serverConnect.class.getName()).log(Level.SEVERE, null, ex);
            
                return myServerSocket;
            }
                   
        
        
        
        }
        //////////////////////////////////////Function to stop Server/////////////
        public void disconnect(){
        
            try {
                s.close();
                myServerSocket.close();
                System.out.println("close");
            } catch (IOException ex) {
                Logger.getLogger(serverConnect.class.getName()).log(Level.SEVERE, null, ex);
            }

        
        
        }

    
}
