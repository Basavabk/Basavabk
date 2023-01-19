package VtigerPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1:convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData1.xlsx");
		
		//Step2:open the excel Workbook
		//Import WorkBook from org.apachi.poi.ss.usermodel
		//The below statement throws EncryptedDpcumentException and IoException
		
		Workbook wb =WorkbookFactory.create(fis);
		
		//Step3: Get control over particular sheet
		String data=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
	    System.out.println(data);
	     
	     //Step4:Close workbook
	     wb.close();

	}

}
