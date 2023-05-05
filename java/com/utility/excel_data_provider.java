
package com.utility;

public interface excel_data_provider {
	
	public String excel_getdata(int sheetno, int rowmo, int colno);
	public int getRowCount(int sheetno);
	public int getColCount(int sheetno);
		
}

