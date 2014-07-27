/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
     public  Connection getConnection()
    {
        Connection conn =null;
     try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           
           String username = "root";
           String password = "";
           String dbURL = "jdbc:mysql://localhost:3306/example";
            conn = DriverManager.getConnection(dbURL , username,password);
           System.out.println("the connection set");
     } catch (Exception e) {
         System.out.println( e.getMessage() );
        }
     return conn;
    }
    
}
