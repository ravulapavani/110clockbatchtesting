package qedge.nov21;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args)throws Throwable {
	//read excel path
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		//get workbook from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws=wb.getSheet("Login");
		//get first row from sheet
		XSSFRow r=ws.getRow(0);
		//count no of rows in sheet
		int rc=ws.getLastRowNum();
		//count no of coloumns from row
		int cc=r.getLastCellNum();
	System.out.println("no of rows are::"+rc+" "+"no of coloumns are::"+cc);
	//print first column second row data
	String username=ws.getRow(1).getCell(1).getStringCellValue();
	//print second column second row data
	String password=ws.getRow(1).getCell(1).getStringCellValue();
	System.out.println(username+" "+password);
	fi.close();
	wb.close();

	}

}
