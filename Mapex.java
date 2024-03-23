package colection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap nm=new HashMap();
		nm.put("dooosai", 20);
		nm.put("idli", 25);
		nm.put("porata", 50);
		System.out.println(nm);
		Set s=nm.keySet();//returns set
		System.out.println(s); 
Collection c=nm.values();
System.out.println(c);
Set s1=nm.entrySet();
System.out.println(s1);
Iterator j=s1.iterator();
while(j.hasNext()) {
	Map.Entry bb=(Map.Entry)j.next();
	//System.out.println(j.next());
	if(bb.getKey().equals("idli")) {
		bb.setValue(80);
		
	}
System.out.println(bb.getKey());
System.out.println(bb.getValue());
}

	}

}
