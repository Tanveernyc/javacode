package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	public String path;
	public FileInputStream fis = null;

	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;

	// This function read the excel File....
	public Xls_Reader(String path) {
		this.path = path;
		
		//fis = new FileInputStream(path);
		//workbook = new XSSFWorkbook(fis);
		//sheet = workbook.getSheetAt(0);
		//fis.close();
		
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(0);
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	// Get all data from the excel file...
	public String GetCellData(String sheetName, String colName, int rowNum) {

		try {

			// for sheetName...
			int index = workbook.getSheetIndex(sheetName);
			int col_Num = 0;
			sheet = workbook.getSheetAt(index);

			// for rowNum... //using loop to get all info from the row.
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {

				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num = i;
			}

			// for colName....
			row = sheet.getRow(rowNum - 1);
			cell = row.getCell(col_Num);
			return cell.getStringCellValue();

		} catch (Exception e) {
			e.printStackTrace();
			return rowNum + colName;
		}

	}

}
