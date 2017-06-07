package com.goeasy.genericlib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	
	public static int rowcount(String xlpath,String sheetname)
	{
		try
		{
		FileInputStream filein = new FileInputStream(xlpath);
		Workbook wb = WorkbookFactory.create(filein);
		Sheet s1=wb.getSheet(sheetname);
		int rowcount = s1.getLastRowNum(); 
		
		return rowcount;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}
	
	public static String celldata(String xlpath,String sheetname,int row ,int cell)
	{
		try
		{
	/*	
	 * his way....
	 * FileInputStream filein = new FileInputStream(xlpath);
		Workbook wb = WorkbookFactory.create(filein);
		Sheet s1=wb.getSheet(sheetname);
		String rowcount = s1.getRow(row).getCell(cell).toString();
		

		
		return rowcount;*/
		
		
		File file=new File(xlpath);
		 FileInputStream fis=new FileInputStream(file);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		 XSSFSheet sheet=wb.getSheet(sheetname);
		
		 DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
			
		 Cell cell1 = sheet.getRow(row).getCell(cell);
		 String data = formatter.formatCellValue(cell1);
		 return data;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
}