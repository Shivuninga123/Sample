package colection;

import java.util.ArrayList;
import java.util.Iterator;

public class Colex {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> ob=new ArrayList<>();
    //  ob.add(1);
ob.add(3);
ob.add(4);
ob.add(5);
ob.add(1,2);
System.out.println(ob);
Iterator<Integer> obj=ob.iterator();
while(obj.hasNext()) {
	System.out.println(obj.next());
}
//for(Integer c:ob) {
//	System.out.println(c);
//}
	for(int i=0;i<ob.size();i++) {
		System.out.println(ob.get(i));
	}//*
	ArrayList<Integer> cc=new ArrayList<>();
	System.out.println(cc.isEmpty());
	cc.add(1);
	cc.add(4);
	cc.add(6);
	cc.add(8);
	
	System.out.println(cc.size());
	System.out.println(cc);
	System.out.println(cc.remove(2));
	System.out.println(cc);
	System.out.println(cc.size());
	Iterator<Integer> dd=cc.iterator();
	
	while(dd.hasNext()) {
		System.out.println(dd.next());
	}
	ArrayList<Integer> kk=new ArrayList<>();
	kk.add(2);
	kk.add(3);
	kk.addAll(cc);
	kk.add(6);
	System.out.println(kk);
	
	
	System.out.println(kk.contains(15));
	kk.removeAll(cc);
	System.out.println(kk);
	
	
	
	}
}


 