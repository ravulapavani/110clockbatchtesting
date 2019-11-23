package qedge.nov22;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readandwrite {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
		String username=ws.getRow(i).getCell(0).getStringCellValue();
		String password=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(username+" "+password);
		//write as pass into result column
		ws.getRow(i).createCell(2).setCellValue("iam so lazy");
		}
		
fi.close();
FileOutputStream fo=new FileOutputStream("D://11oclock.xlsx");
wb.write(fo);
fo.close();
wb.close();
	}

}
