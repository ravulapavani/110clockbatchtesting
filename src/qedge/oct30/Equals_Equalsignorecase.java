package qedge.oct30;

public class Equals_Equalsignorecase {

	public static void main(String[] args) {
		String Str1="i love my india";
		String Str2="I love my india";
		String Str3="I LOVE MY INDIA";
		String Str4="I love my india";
		System.out.println(Str1.equals(Str2));
		System.out.println(Str2.equals(Str4));
		System.out.println(Str3.equalsIgnoreCase(Str4));

	}

}
