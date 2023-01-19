package VtigerPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class WriteToDataBase {

	public static void main(String[] args) throws SQLException {
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connect=DriverManager.getConnection("\"jdbc:mysql://localhost:3306/Lathbrok\",\"root\",\"root\"");
		
   Statement statement=connect.createStatement();
   
   //Modifying Database
   
   int result = statement.executeUpdate("insert into students(id,name,address)values(102,'xyz','Hyd');");
    
   if(result==1)
	   System.out.println("DB Updated successfully");
   else
	   System.out.println("DB not Updated");

	}

}
