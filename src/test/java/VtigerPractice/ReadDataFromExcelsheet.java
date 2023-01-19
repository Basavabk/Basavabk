package VtigerPractice;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcelsheet {

	
	public static void main(String[]args) throws IOException  {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	
	Sheet sh =wb.getSheet("Organisation");
	
	Row rw  =sh.getRow(7);	
	
    Cell ce =rw.getCell(3);
    
    String value=ce.getStringCellValue();
    
    System.out.println(value);
	
	
	
		
		
		
	}
	
	
}
