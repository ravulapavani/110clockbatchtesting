package qedge.nov22;
import java.io.BufferedReader;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orange {

	public static void main(String[] args)throws Throwable  {
		
				FileReader fr=new FileReader("d://login.txt");
				BufferedReader br=new BufferedReader(fr);
				String str="";
				while((str=br.readLine())!=null)
				{
					WebDriver driver=new ChromeDriver();
					driver.get("http://orangehrm.qedgetech.com/");
					driver.manage().window().maximize();	
					String login[]=str.split(";");
					driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
					driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
					driver.findElement(By.name("Submit")).click();
					Thread.sleep(5000);
					if(driver.getCurrentUrl().contains("dash"))
					{
						System.out.println("Login success");
					}
					else
					{
						System.out.println("Login Fail");
					}
					driver.close();
				}
			
	


















	}

}
