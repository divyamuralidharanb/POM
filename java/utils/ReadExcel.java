package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readExcelData(String ws) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./src/main/resources/data/LeafTapsData.xlsx");
		XSSFSheet sheet = wb.getSheet(ws);
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("CreateLead : "+rowCount+" : "+colCount);
		
		String[][] dataSet = new String[rowCount][colCount];
		for(int i=1; i<=rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				dataSet[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		wb.close();
		return dataSet;	
	}	
}
