package qedge.nov20;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Javascript1 {

	public static void main(String[] args) {
		
				WebDriver driver=new ChromeDriver();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//launch url 
				js.executeScript("document.location='https://flipkart.com'");
				driver.manage().window().maximize();
				Actions ac=new Actions(driver);
				ac.sendKeys(Keys.ESCAPE).perform();
				//print title of the page and length of the title
			String pagetitle=js.executeScript("return document.title").toString();
			System.out.println("page title::"+pagetitle);
			System.out.println("page title length is::"+pagetitle.length());
			//print url of the page and length of the url
			String strurl=js.executeScript("return document.URL").toString();
			System.out.println("url is::"+strurl);
			System.out.println("url lenght is::"+strurl.length());
			//print domain name lenght of domain
			String strdomain=js.executeScript("return document.domain").toString();
			System.out.println("domain name::"+strdomain);
			System.out.println("domain lenght::"+strdomain.length());
		driver.close();

			}

		}
















	


