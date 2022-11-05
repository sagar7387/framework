package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelDataProvider {
	XSSFWorkbook wb;
	
	public ExelDataProvider() throws Exception {
		
		
    String filepath="C:\\Users\\admin\\eclipse-workspace\\Framework Design\\TestData\\excel.xlsx";	
	FileInputStream fis=new FileInputStream(filepath);
           wb= new XSSFWorkbook(fis);
		
	}
	
	public String getstringDataReader(String Sheetname,int row, int cell) {
		
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
		
		
	}
	
    public String  getnumericDataReader(String Sheetname,int row, int cell) {
		
	double data= wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
	String data_String=String.valueOf(data);
	return data_String.replace(".", "").replace("E7", "");
		
}
	
	

}
