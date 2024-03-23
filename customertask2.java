package colection;

import java.util.ArrayList;

public class customertask2 {
	String name;
	int id;
	long mobilenum;
	int quantity;
	String productname;
	int price;
	customertask2(String name,int id,long mobilenum ){
		this.name=name;
		this.id=id;
		this.mobilenum=mobilenum;
	}
	
customertask2(int id,int quantity,String productname,int price){
	this.id=id;
	this.quantity=quantity;
this. productname=productname;
this.price=price;
	
}
 public String toString() {
	 return "\nname:" +name+"id:"+id+"mobilenum:"+mobilenum;
 }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<customertask2> ob=new ArrayList<>();
		ob.add(new customertask2("ramu",123,9345445389l));
		ob.add(new customertask2("ramga",124,9345897583l));
		ob.add(new customertask2("rangi",125,9345445389l));
		System.out.println(ob);
		ArrayList<customertask2> ob1=new ArrayList<>();
		ob1.add(new customertask2 (123,2,"redmi",700));
		ob1.add(new customertask2 (124,2,"tshirt",200));
		ob1.add(new customertask2 (125,3,"pant",300));
		
		
		
	}

}
