
package mysql;
import java.sql.*;

public class DDL{
       Connect connect = new Connect();
 public  void showData()
   {
       try {
           Connection conn = connect.getConnection();
          
       Statement stat = conn.createStatement();
       String setMyQuery = "Select * from example";
       ResultSet rs = stat.executeQuery(setMyQuery);
       System.out.println("the reslut as the follwoing : ");


      
       } catch (Exception e) {
            System.out.println( e.getMessage() );
       }
       
       
   }
   }