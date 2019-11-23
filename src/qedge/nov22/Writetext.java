package qedge.nov22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Writetext {

	public static void main(String[] args)throws IOException {
		//create file
	File f=new File("D://selenium.txt");
	f.createNewFile();
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("iam so lazy");
	bw.newLine();
	bw.write("iam so lazy to sleep");
	bw.newLine();
	bw.write("iam so lazy to attend class");
	bw.flush();
	bw.close();
		

	}

}
