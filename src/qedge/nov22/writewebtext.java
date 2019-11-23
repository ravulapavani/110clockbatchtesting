package qedge.nov22;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writewebtext {

	public static void main(String[] args)throws Throwable {
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://selenium.dev/");
				driver.manage().window().maximize();
				File f=new File("d://selenium.txt");
				FileWriter fw=new FileWriter(f);
				BufferedWriter bw=new BufferedWriter(fw);
		String para1=driver.findElement(By.xpath("//div[1]/div[1]/p[1]")).getText();
		String para2=driver.findElement(By.xpath("//div[1]/div[2]/p[1]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.close();

			}

		}


	


