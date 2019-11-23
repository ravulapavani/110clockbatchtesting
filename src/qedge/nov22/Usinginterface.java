package qedge.nov22;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Usinginterface {

	public static void main(String[] args) {
	FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
	Workbook wb=WorkbookFactory.create(fi);
	Sheet ws=wb.getSheetAt(0);
Row r=ws.getRow(0);
int cc=r.getLastCellNum();
int rc=ws.getLastRowNum();
System.out.println("no of rows are::"+rc+" "+"no of columns are::"+cc);
for(int i=1;i<=rc;i++)
{
String username=ws.getRow(i).getCell(0).getStringCellValue();
if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC);
{
//convert celldat integer column into string
String password=String.valueOf("cell data");
System.out.println(username+" "+password);
ws.getRow(i).createCell(2).setCellValue("pass");
}

}
FileOutputStream fo=new FileOutputStream("D://mrngbatch.xlsx");
wb.write(fo);
fo.close();
wb.close();
	

	}

}
