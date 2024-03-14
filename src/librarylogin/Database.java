/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarylogin;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
     public static Connection connection(){
    
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
            return con;
        
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
}

