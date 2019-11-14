package qedge.oct30;

public class Split_single {

	public static void main(String[] args) {
		String company="HCL@DELOITE@INFOSYS@GOOGLE@AMAZON@TCS@IBM";
		String str[]=company.split("@");
		for(String x:str)
		{
			System.out.println(x);
		}
		

	}

}
