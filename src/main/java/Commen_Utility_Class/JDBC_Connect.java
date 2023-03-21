package Commen_Utility_Class;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBC_Connect {
	public static void main(String[] args) throws SQLException {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nk","root","Sql@12345");
			PreparedStatement statement = con.prepareStatement("select * from employee");
			ResultSet result = statement.executeQuery();
			while(result.next())
			{
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
