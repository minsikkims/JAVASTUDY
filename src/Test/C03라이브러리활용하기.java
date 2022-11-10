package Test;

import java.sql.Connection;import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03라이브러리활용하기 {

   public static void main(String[] args) {
      String driver = "com.mysql.cj.jdbc.Driver";
      String id = "root"; 
      String pw = "1234"; 
      String url = "jdbc:mysql://localhost:3306/tempdb"; 
           
      Connection conn = null;            
      PreparedStatement pstmt = null;     
      ResultSet rs = null;            
      
      try {
         Class.forName(driver); 
         System.out.println("Driver Loading Success!!");
         conn = DriverManager.getConnection(url, id, pw); 
         System.out.println("DB Connected...");
         
         pstmt = conn.prepareStatement("SELECT * from student_tbl");
         pstmt.executeQuery(); 
         
         rs = pstmt.executeQuery(); 
         
         if(rs != null) {
            while(rs.next()) { 
               System.out.print(rs.getString("id") + " ");
               System.out.print(rs.getString("name") + " ");
               System.out.print(rs.getInt("age") + " ");
               System.out.print(rs.getString("addr") + " ");
               System.out.println();
            
               
            }
         }
         
         
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {rs.close();}catch(Exception e) {e.printStackTrace();}
         try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
         try {conn.close();}catch(Exception e) {e.printStackTrace();} 
      }
      
      
      
   }

}