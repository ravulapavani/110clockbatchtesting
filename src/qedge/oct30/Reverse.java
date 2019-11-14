package qedge.oct30;

public class Reverse {

	public static void main(String[] args) {
		String str="please practice java";
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
