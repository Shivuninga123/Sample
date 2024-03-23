package colection;

import java.util.ArrayList;
import java.util.Iterator;

class Customer{
String name;
int id;
long phno;
Customer(String name,int id,long phno){
	this.name=name;
	this.id=id;
	this.phno=phno;
}
public String toString() {
	return"\nname"+name+"id"+id+"phonenumber"+phno;
}
}
public class Product  {
	String productname;
	int id;
	int price;
	int quantity;
	Product(String productname,int id,int price,int quantity){
	this.productname=productname;
	this.id=id;
	this.price=price;
	this.quantity=quantity;
	}
	public String toString() {
		return "\nproductname"+productname+"id"+id+"price"+price+"quantity"+quantity;
		
}
public static void main(String []args) {
	ArrayList<Customer> customerob=new ArrayList<>();
	customerob.add(new Customer("ninga",123,9345445389l));
	customerob.add(new Customer("ramu",124,9345445889l));
	ArrayList<Product> productob=new ArrayList<>();
	productob.add(new Product("product1",123,2000,2));
	productob.add(new Product("product2",124,3000,3));

	System.out.println(productob); 
	//Iterator<Product> op=productob.iterator();
	//while(op.hasNext());
	//System.out.println(op.next());
	
) {
	 
	System.out.println(kk.id+" "+kk.productname+" "+kk.quantity+" "+ kk.price );
	
}
}
}
