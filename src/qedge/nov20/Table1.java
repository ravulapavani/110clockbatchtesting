package qedge.nov20;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table1 {

	public static void main(String[] args) {
		
				WebDriver driver=new ChromeDriver();
				driver.get("file:///C:/Users/sai/Downloads/qedgetable.html");
				driver.manage().window().maximize();
				//get specific data from table
		String tabaletext=driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
		System.out.println(tabaletext);
		//store table into webelement
		WebElement table=driver.findElement(By.name("qedgetech"));
		//count no of rows in a tbale
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
		//get collection of column in each row
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<cols.size();j++)
		{
		}
		System.out.println("Row No::"+i+"   "+"column No::"+cols.size());
		}
		driver.close();
		}
		}
















	


