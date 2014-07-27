
package mysql;
import java.sql.*;

public class DDL1{
       Connect connect = new Connect();
 public  void showData()
   {
       try {
           Connection conn = connect.getConnection();
          
       Statement stat = conn.createStatement();
       ResultSet r = stat.executeQuery
                ("SELECT studentName, subject FROM student");
                while(r.next()) {
                        System.out.println ("Student name is "+
                                r.getString("studentName") + " and the Subject is " +
                                r.getString("subject") );
                        }
      
       } catch (Exception e) {
            System.out.println( e.getMessage() );
       }
       
       
   }
   }

        
      