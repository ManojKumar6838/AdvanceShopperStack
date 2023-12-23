package shopperstack.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
//import org.testng.reporters.jq.Main;

public class ReadExcel {

	Workbook wb;
	FileInputStream fis;
	
	public String getSingleData(String sheetName, int rowNum, int cellNum) {
		
		try {
			fis = new FileInputStream("./src/test/resources/GoIbiboTC.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Reporter.log("Path of the Excel Sheet is Wrong", true);
		}
		try {
			wb = WorkbookFactory.create(fis); 
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			Reporter.log("Excel Sheet is Wrong", true);
		} 
		
		Sheet sheet=wb.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String data=cell.getStringCellValue();
		return data;
	}
	
	public Object[][] getMultipleData(String sheetName) {
		try {
			fis = new FileInputStream("./src/test/resources/GoIbiboTC.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Reporter.log("Path of the Excel Sheet is Wrong", true);
		}
		
		try {
			wb = WorkbookFactory.create(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Reporter.log("Path of the Excel Sheet is Wrong", true);
		}
		Sheet sheet=wb.getSheet(sheetName);
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
}
