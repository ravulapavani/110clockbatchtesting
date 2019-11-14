 package qedge.nov12;
 import java.util.ArrayList;
	import java.util.Iterator;
public class Demoarraylist {

	public static void main(String[] args) {
	ArrayList<String>str=new ArrayList<String>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		str.add("sun");
		System.out.println(str.get(6));

		Iterator<String>x=str.iterator();
		while(x.hasNext())
		{
		System.out.println(x.next());
		}
		}
		
}















	


