/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.ftpclient;

import optimized.apache.ftp.FTPFile;
import optimized.apache.ftp.FTPClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rana
 */
public class FTPClient_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
//    FTP ftp=new FTP
            FTPClient fTPClient=new FTPClient();
            fTPClient.connect("ftp.hostexample.example");
            boolean conStatus=fTPClient.login("your_username", "your_password");
           
            
            
            FTPFile[] fi=fTPClient.listFiles("/htdocs/1");
            

            for (int i = 0; i < fi.length; i++) {
//                if(fi[i].isDirectory()){
                
                    System.out.println((fi[i].getSize()/1024+1)+" KB");
                
                    System.out.println(fi[i].getName());
                  
//                   fTPClient.re 
//                }else{
//                    System.out.println(fi[i].getName()+"-----Is File."+fTPClient.printWorkingDirectory());

//                }
                
            }
//            os.close();
         
        } catch (IOException ex) {
            Logger.getLogger(FTPClient_example.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
