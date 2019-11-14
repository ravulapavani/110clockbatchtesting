package qedge.oct31;

public class Throw {

	public static void main(String[] args) {
		String str1="Sleep";
		String str2="sleep";
		if(str1.equals(str2))
		{
			System.out.println("strings are equal");
			}
		else
		{
			try{
				throw new Error("strings are not equal");
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());
			}
		}
	}

}
