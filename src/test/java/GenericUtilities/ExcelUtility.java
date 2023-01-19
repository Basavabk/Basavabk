package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
	private Workbook workbook;
	private DataFormatter df;
	private Sheet sheet;
	/**
	 * This method initialize excel workbook
	 * @param path
	 */
	
	public void excelInitialization(String path) {
		FileInputStream fis = null;
		try {
			fis= new FileInputStream(path);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			workbook=WorkbookFactory.create(fis);
		}catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method id used to fetch single data from excel
	 * @param sheetName
	 * @param rownum
	 * @param cellNum
	 * @return
	 */
	
	public String readDataFromExcel (String sheetName, int rownum,int cellNum) {
		df= new DataFormatter();
		sheet = workbook.getSheet(sheetName);
		return df.formatCellValue(sheet.getRow(rownum).getCell(cellNum));
	}
		
		/**
		 * This method is used to write data in to excel
		 * @param data
		 * @param cellNum
		 * @param rownum
		 * @param path
		 */
	
	
	public void setDataToExcel(String data, int cellNum,int rownum, String path) {
		Cell cell = sheet.getRow(rownum).createCell(cellNum);
		cell.setCellValue(data);

		FileOutputStream fos=null;
          try {
        	  fos = new FileOutputStream(path);
          }catch(FileNotFoundException e) {
        	  e.printStackTrace();
        	  
          }
          try {
        	  workbook.write(fos);
          }catch(IOException e) {
        	  e.printStackTrace();
          }
          try {
        	  fos.flush();
          }catch(IOException e) {
        	  e.printStackTrace();
          }
		}
	
	/**
	 * This method used to close excel workbook
	 */
	public void closeWorkbook() {
		try {
			workbook.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
