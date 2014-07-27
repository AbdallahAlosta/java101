/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql;
import java.sql.*;


public class Test {

public static void main(String [] args) {

       Connection conn = null;

        System.out.println("MYSQL Test");

        try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/example","root","");

        }
        catch (Exception e) {
                System.out.println(e);
                System.exit(0);
                }

        System.out.println("Connection established");

        try {
                Statement s = conn.createStatement();
               ResultSet r = s.executeQuery
                ("SELECT studentName, subject FROM student");
                while(r.next()) {
                        System.out.println ("Student name is "+
                                r.getString("studentName") + " and the Subject is " +
                                r.getString("subject") );
                        }
        }
        catch (Exception e) {
           e.printStackTrace();
                }
        }
}  