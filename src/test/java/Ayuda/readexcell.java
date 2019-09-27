package Ayuda;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcell {

	private XSSFWorkbook newWorkBook;
	private XSSFWorkbook newWorkBook2;

	public void readexcellfile(String filexpath, String sheetfile) throws IOException {
		File file = new File(filexpath);
		FileInputStream entradanueva = new FileInputStream(file);
		newWorkBook2 = new XSSFWorkbook(entradanueva);
		XSSFSheet newSheet = newWorkBook2.getSheet(sheetfile);
		int rowCount = newSheet.getLastRowNum() + newSheet.getFirstRowNum();
		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = newSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.println(row.getCell(j).getStringCellValue() + "||");
			}
		}
	}

	public String getCellValue(String filexpath, String sheetfile, int rowNumber, int cellNumber) throws IOException {
		File file = new File(filexpath);
		FileInputStream entradanueva = new FileInputStream(file);
		newWorkBook = new XSSFWorkbook(entradanueva);
		XSSFSheet newSheet = newWorkBook.getSheet(sheetfile);
		XSSFRow row = newSheet.getRow(rowNumber);
		XSSFCell cell = row.getCell(cellNumber);
		return cell.getStringCellValue();
	}
}
