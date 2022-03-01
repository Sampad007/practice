package Selenium;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String[] args) {
		String filePath="D:\\Selenium Workspace\\Practice\\src\\test\\src\\data\\DataSheet.xls";
		
		try {
			Workbook wb= Workbook.getWorkbook(new File(filePath));
			Sheet sh = wb.getSheet("credentials");
			
			for(int i=1; i<sh.getRows(); i++) {
				for(int j=0; j<sh.getColumns(); j++) {
					System.out.println(sh.getCell(j, i).getContents());
				}
				
			}
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
		

	}

}
