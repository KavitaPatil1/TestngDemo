package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class provider {
@DataProvider(name="values")
	public Object[][] testdata() throws IOException {

		Object[][] data = null;
	FileInputStream file=new FileInputStream("C:\\Users\\bhagy\\Documents\\DataDrivernTestingDemoFile.xlsx");
	
	XSSFWorkbook bok=new XSSFWorkbook(file);
	XSSFSheet sheet=bok.getSheetAt(0);
	XSSFRow row;
	XSSFCell cell;
	data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()-1]  ;                   //sheet=4 
	for (int i = 1; i <=sheet.getLastRowNum(); i++) {
		row=sheet.getRow(i);
		for (int j = 1; j < row.getLastCellNum(); j++) {
			cell=row.getCell(j);
		data[i-1][j-1]=	(int)cell.getNumericCellValue();    //1-1=0   1-1=0
			
		}
		
	}
	
//	XSSFRow row=sheet.getRow(1);
//	XSSFCell cell=row.getCell(1);
//	int num1=(int) cell.getNumericCellValue();
//	cell=row.getCell(2);
//	int num2=(int) cell.getNumericCellValue();
//	data=new Object[1][2];
//	data[0][0]=num1;
//	data[0][1]=num2;
//	System.out.println("num1 is : " +"and" +"num2 is :"+num2);
	
	
	

		return data;

	}

}

