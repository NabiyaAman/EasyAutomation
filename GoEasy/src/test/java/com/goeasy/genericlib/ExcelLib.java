package com.goeasy.genericlib;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.google.common.collect.Table.Cell;



public class ExcelLib {	
	
	//String filePath = System.getProperty("user.dir")+"/requiredSource/TestData.xlsx";	
	String filePath="D:\\easyAutomation2017\\GoEasy\\requiredSource\\TestData1.xlsx";
//	
//	public int rowcount(String xlpath,String sheetname)
//	{
//		try
//		{
//		FileInputStream filein = new FileInputStream(xlpath);
//		Workbook wb = WorkbookFactory.create(filein);
//		Sheet s1=wb.getSheet(sheetname);
//		int rowcount = s1.getLastRowNum(); 
//		
//		return rowcount;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return 0;
//		}
//	}
//	
	
	public String getExcelData(String sheetName , int rowNum, int colNum) throws EncryptedDocumentException, IOException, InvalidFormatException{
		
		File src=new File(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		
		//Workbook wb = WorkbookFactory.create(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		XSSFRow row = sh.getRow(rowNum);
		XSSFCell cel = row.getCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		String data = cel.getStringCellValue();
		
		System.out.println(data);
		return data;
	}
	
	public void refreshExcelData() throws IOException
	{
		
		Runtime.getRuntime().exec(new String[]{"C:\\Windows\\System32\\wscript.exe", "D:\\myVBS.vbs"});
	          }  
		 
		//HSSFFormulaEvaluator.evaluateAllFormulaCells(filePath);
		
		
		
		    /**
		     * @param args
		     */
		    
		                 
		         
		 
		    }
	
	
//	public int getRowCount(String sheetName) throws EncryptedDocumentException,IOException, InvalidFormatException{
//		FileInputStream fis = new FileInputStream(filePath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		int rowCount = sh.getLastRowNum();
//		return rowCount;
//	}
	
//	public void setExcelData(String sheetName , int rowNum,int colNum, String data) throws EncryptedDocumentException,IOException, InvalidFormatException{
//		FileInputStream fis = new FileInputStream(filePath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		Row row = sh.getRow(rowNum);
//		Cell cel = (Cell) row.createCell(colNum);
//		cel.setCellType(cel.);
//		FileOutputStream fos = new FileOutputStream(filePath);
//		cel.setCellValue(data);
//		wb.write(fos);
//	
//	}
	
	
	
	
	
	
	
	
	


