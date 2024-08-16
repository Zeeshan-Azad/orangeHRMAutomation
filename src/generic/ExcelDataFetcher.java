package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataFetcher {
	
	public String getStringValue(String filePath, String sheetName, int rowNum, int cellNum) throws IOException{
		//String path = "/Users/mohammadZeeshan/downloads/testPage";
		FileInputStream fis = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet(sheetName);
		HSSFRow rowNumber = sheet.getRow(rowNum);
		HSSFCell cellNumber = rowNumber.getCell(cellNum);
		String value = cellNumber.getStringCellValue();
		
		workbook.close();
		return value;
	}
	
	public double getNumericValue(String filePath, String sheetName, int rowNum, int cellNum) throws IOException{
		//String path = "/Users/mohammadZeeshan/downloads/testPage";
		FileInputStream fis = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet(sheetName);
		HSSFRow rowNumber = sheet.getRow(rowNum);
		HSSFCell cellNumber = rowNumber.getCell(cellNum);
		double value = cellNumber.getNumericCellValue();
		
		workbook.close();
		return value;
	}
	
	public String getStringValue(String filePath, int sheetNumber, int rowNum, int cellNum) throws IOException{
		//String path = "/Users/mohammadZeeshan/downloads/testPage";
		FileInputStream fis = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(sheetNumber);
		HSSFRow rowNumber = sheet.getRow(rowNum);
		HSSFCell cellNumber = rowNumber.getCell(cellNum);
		String value = cellNumber.getStringCellValue();
		
		workbook.close();
		return value;
	}
	
	public double getNumericValue(String filePath, int sheetNumber, int rowNum, int cellNum) throws IOException{
		//String path = "/Users/mohammadZeeshan/downloads/testPage";
		FileInputStream fis = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(sheetNumber);
		HSSFRow rowNumber = sheet.getRow(rowNum);
		HSSFCell cellNumber = rowNumber.getCell(cellNum);
		double value = cellNumber.getNumericCellValue();
		
		workbook.close();
		return value;
	}
	
	
}
