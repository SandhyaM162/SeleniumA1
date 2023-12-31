package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		
		// Step 2: open Workbook
		// workbookFactory.create(fis) --> throws EncryptedDocumentException and 
	 	Workbook wb = WorkbookFactory.create(fis);
		
//		// Step 3: Get control over sheet
		Sheet sh = wb.getSheet("Sheet1");
//		
//		// Step 4: Get control over row
		Row r = sh.getRow(3);
		Row r1 = sh.getRow(1);
//		
//		// Step 5: Get control over cell
		Cell c = r.getCell(1);
		Cell c1 = r1.getCell(1);
//		
//		// Step 6: Read data
		System.out.println(c.getStringCellValue());
		System.out.println(c1.getNumericCellValue());
		
	//	String data = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		
	//	System.out.println(data);
		
		// Step 7: close workbook
		wb.close();
		
	}

}
