package qedge.nov22;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot {

	public static void main(String[] args) throws Throwable {
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://facebook.com");
				driver.manage().window().maximize();
			//take screen shot and store
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screnn shot into local system
		FileUtils.copyFile(screen, new File("D://TESTING//screens//homepage.png"));
		driver.close();

			}

		}


	


