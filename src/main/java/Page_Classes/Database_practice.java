package Page_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Database_practice {
	static String name ="" ,des ="",dob="" ;
	static int age =0 , rollnum =0 ,salary =0;
	 ResultSet result;
	 
	public ResultSet readdata(String query)
	{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Sql@12345");
			PreparedStatement statement = con.prepareStatement(query);
			 result = statement.executeQuery();
			} catch (Exception e) {
			System.out.println("Problem in Read data from database " +e);
		}
	return result;
	}
	public static void main(String[] args) throws SQLException {
	
		Database_practice ob = new Database_practice();
		ResultSet res = ob.readdata("select * from student");
		while(res.next())
		{
			int i=1;
			 age = res.getInt(i);
			 i++;
			 name= res.getString(i);
			 i++;
			 rollnum = res.getInt(i);
			 i++;
			 des = res.getString(i);
			 i++;
			dob= res.getString(i);
			 System.out.println(age + "   " + name+ "   " + rollnum +"   "+ des+ "   " +dob +" " +"\n");
			// System.out.println(name);
		}
		
	}
}
