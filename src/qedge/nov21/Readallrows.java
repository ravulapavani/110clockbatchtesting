package qedge.nov21;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readallrows {

	public static void main(String[] args)throws Throwable {
		//read excel path
				FileInputStream fi=new FileInputStream("D:\TESTING\Dummy.Xlsx.xlsx");
				//get workbook from file
				XSSFWorkbook wb=new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws=wb.getSheetAt(0);
				int rc=ws.getLastRowNum();
				System.out.println("no of rows are::"+rc);
				for(int i=1;i<=rc;i++)
				{
					String username=ws.getRow(i).getCell(0).getStringCellValue();
					
					String password=ws.getRow(i).getCell(1).getStringCellValue();
					System.out.println(username+" "+password);
					
				}
	fi.close();
	wb.close();

	}

}
