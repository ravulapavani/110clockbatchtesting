package qedge.nov20;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args)throws Throwable {
		
				WebDriver driver=new ChromeDriver();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//launch url 
				js.executeScript("document.location='http://orangehrm.qedgetech.com/'");
				driver.manage().window().maximize();	
		js.executeScript("document.querySelector('#txtUsername').value='test'");
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(5000);
		String url=js.executeScript("return document.URL").toString();
		if(url.contains("dash"))
		{
			System.out.println("Login Success");
		}
		else{
		String message=js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();	
			System.out.println(message+"   "+"Login Fail");
		}
		Thread.sleep(5000);
		driver.close();
			}

		}





























	


