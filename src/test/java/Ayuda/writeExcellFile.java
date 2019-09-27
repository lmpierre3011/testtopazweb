package Ayuda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcellFile {

	private XSSFWorkbook newWorkBook;
	private XSSFWorkbook newWorkBook2;

	public void writeExcell(String filexpath, String sheetfile, String[] dataToWrite) throws IOException {
		File file = new File(filexpath);
		FileInputStream entradanueva = new FileInputStream(file);
		newWorkBook2 = new XSSFWorkbook(entradanueva);
		XSSFSheet newSheet = newWorkBook2.getSheet(sheetfile);
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		XSSFRow row = newSheet.getRow(0);
		XSSFRow newrow = newSheet.createRow(rowCount + 1);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell newcell = newrow.createCell(i);
			newcell.setCellValue(dataToWrite[i]);
		}
		entradanueva.close();
		FileOutputStream fileoutputStream = new FileOutputStream(file);
		newWorkBook2.write(fileoutputStream);
		fileoutputStream.close();
	}

	public void writeCellValue(String filexpath, String sheetfile, int rowNumber, int cellNumber, String resultText)
			throws IOException {
		File file = new File(filexpath);
		FileInputStream entradanueva = new FileInputStream(file);
		newWorkBook = new XSSFWorkbook(entradanueva);
		XSSFSheet newSheet = newWorkBook.getSheet(sheetfile);
		XSSFRow row = newSheet.getRow(rowNumber);
		XSSFCell firstcell = row.getCell(cellNumber - 1);
		System.out.println("El primer valor de la celda es" + firstcell.getStringCellValue());
		XSSFCell nextstcell = row.createCell(cellNumber);
		nextstcell.setCellValue(resultText);
		System.out.println("El segundo valor de la celda es" + nextstcell.getStringCellValue());
		entradanueva.close();
		FileOutputStream fileoutputStream = new FileOutputStream(file);
		newWorkBook.write(fileoutputStream);
		fileoutputStream.close();
	}
}
