package colection;

import java.util.ArrayList;

public class Stringtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> kk=new ArrayList<>();
																																									
	kk.add("apple");
	kk.add("orange");
	kk.add("graphes");
	ArrayList<String>jj=new ArrayList<>();
	jj.add("mosambi");
	jj.add("orange");
	jj.add("graphes");
	ArrayList<String> cc=new ArrayList<>();
for(Integer i=0;i<kk.size();i++) {
	String a=kk.get(i);
	String b=jj.get(i);
	if(a==b) {
		cc.add("true");
	}
	else {
		cc.add("false");
	}
}
System.out.println(cc);
	

}

	