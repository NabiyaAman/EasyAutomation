package com.goeasy.genericlib;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;



public class ExcelLib {	
	
	String filePath = System.getProperty("user.dir")+"/requiredSource/TestData.xlsx";	
	public String getExcelData(String sheetName , int rowNum, int colNum) throws EncryptedDocumentException, IOException, InvalidFormatException{
		
		File src=new File(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		
		//Workbook wb = WorkbookFactory.create(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		XSSFRow row = sh.getRow(rowNum);
		XSSFCell cel = row.getCell(colNum);
		String data = cel.getStringCellValue();
		System.out.println(data);
		return data;
	}
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException,IOException, InvalidFormatException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		return rowCount;
	}
	
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
	
	
	
	
	
	
	
	
	

}
