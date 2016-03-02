/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection_client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author dnegm
 */

public class connectionClient {
    Socket mySocket;
    DataInputStream dis ;
    PrintStream ps;
   
    
    public Socket connectionClient(){
      try{
            mySocket = new Socket("127.0.0.1", 5005);
           
          //  dis = new DataInputStream(mySocket.getInputStream ());
          //  ps = new PrintStream(mySocket.getOutputStream ());
           // ps.println("Test Test");
           // String replyMsg = dis.readLine();

            //System.out.println(replyMsg);
            
            }
            catch(IOException ex)
            {
            ex.printStackTrace();
            }
      return mySocket;
      
    }
   }
