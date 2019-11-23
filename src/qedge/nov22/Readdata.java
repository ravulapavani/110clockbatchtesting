package qedge.nov22;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readdata {

	public static void main(String[] args) throws Throwable {
		
				FileReader fr=new FileReader("e://selenium.txt");
				BufferedReader br=new BufferedReader(fr);
				String str="";
				while((str=br.readLine())!=null)
				{
					System.out.println(str);
				}

			}

		}


	


