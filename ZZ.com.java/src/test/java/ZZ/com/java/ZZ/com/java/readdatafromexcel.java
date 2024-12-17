package ZZ.com.java.ZZ.com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readdatafromexcel {

	public static void main(String[] args) throws IOException {
		
		 File file = new File("/Users/lakshtisharma/eclipse-workspace/ZZ.com.java/sample.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
				HSSFWorkbook workbook = new HSSFWorkbook(inputStream);	
				HSSFSheet sheet = workbook.getSheet("Compdetails");
				
				HSSFRow row = sheet.getRow(1);
				HSSFCell cell = row.getCell(1);
				String value = cell.getStringCellValue();
				System.out.println(value);		
 
	}

}
