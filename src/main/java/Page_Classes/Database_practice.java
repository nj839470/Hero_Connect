package Page_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database_practice {
	static String name ="" ,des ="";
	static int age =0 , rollnum =0 ,salary =0;
	 ResultSet result;
	public ResultSet readdata(String query)
	{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nk","root","Sql@12345");
			PreparedStatement statement = con.prepareStatement(query);
			 result = statement.executeQuery();
			} catch (Exception e) {
			System.out.println("Problem in Read data from database " +e);
		}
	return result;
	}
	public static void main(String[] args) throws SQLException {
		Database_practice ob = new Database_practice();
		ResultSet res = ob.readdata("delete employee");
		while(res.next())
		{
			int i=1;
			 name= res.getString(i);
//			 i++;
//			 age = res.getInt(i);
//			 i++;
//			 rollnum = res.getInt(i);
//			 i++;
//			 salary = res.getInt(i);
//			 i++;
//			 des = res.getString(i);
//			 System.out.println(rollnum + "   " + name+ "   " + age +"   "+ salary+ "   " +des +"\n");
			 System.out.println(name);
		}
		
	}
}
