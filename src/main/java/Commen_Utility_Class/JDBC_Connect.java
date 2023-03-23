package Commen_Utility_Class;

import java.sql.ResultSet;

public interface JDBC_Connect {
	
	public ResultSet read_Data_From_Database(String query);
	
	}
