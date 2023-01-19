package VtigerPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;




public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		//step1: create an instance for Driver
		//Driver Should be imported from com.cj.jdbc.Driver
		//new Driver()throws SQLException
		Driver dbdriver = new Driver();
		
		
		//Step2: Register to the dbDriver
		//DriverManager is in java.sql package
		DriverManager.registerDriver(dbdriver);
		
		//Step3: Establish database connection
		//Connection should be imported from java.sql package
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lathbrok","root","root");
		
		
		//Step4:Create statement
		//Statement should be imported from java.sql package
		Statement statement = connect.createStatement();
		  
		//Step5: Execute query to fetch data
        ResultSet result	=statement.executeQuery("select*from students;");
   
   while(result.next()) {
	   System.out.println(result.getInt(1)+"+\t"+result.getString(2));
   }
        //Step6: close database
       connect.close();
		
		
	}

}
