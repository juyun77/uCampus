package has;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;


public class hasDAO {
	
	private Connection conn; /*데이터베이스에 접근하게 해주는 객체래*/
	private PreparedStatement pstmt;
	private ResultSet rs; /*어떠한 정보를 담을 수 있는 객체*/
	
	public hasDAO() {
	      try {
				String dbURL="jdbc:mysql://localhost:3306/bbs";
		         String dbID="root";
		         String dbPassword="0000";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn=DriverManager.getConnection(dbURL,dbID,dbPassword);
	               
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
	
	
	
	
	   public int deleteSec(String secName,String userID) {
		   String SQL="DELETE from Section_Has_Student WHERE shsSecName=? AND shsUserID=? ";
		   try {
			   PreparedStatement pstmt=conn.prepareStatement(SQL);
			   pstmt.setString(1,secName);
			   pstmt.setString(2,userID);
			  
			   return pstmt.executeUpdate();
		   }catch(Exception e){
			   e.printStackTrace();
		   }
		   return -1;//데이터베이스 오류인경우
	   }
	   
	   public int insertSec(String secName,String userID) {
		   String SQL="INSERT INTO Section_Has_Student VALUES(?,?) ";
		   try {
			   PreparedStatement pstmt=conn.prepareStatement(SQL);
			   pstmt.setString(1,secName);
			   pstmt.setString(2,userID);
			  
			   return pstmt.executeUpdate();
		   }catch(Exception e){
			   e.printStackTrace();
		   }
		   return -1;//데이터베이스 오류인경우
	   }
	
	   
	

}
