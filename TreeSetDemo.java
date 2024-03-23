package colection;
import java.util.TreeSet;

public class TreeSetDemo 
{
	
		
	

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		
		Book b1 = new Book(200,"JavaBook",10);
		Book b2 = new Book(300,"PythonBook",15);
		Book b3 = new Book(400,"C#Book",20);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		for(Object d:ts) 
		{
			System.out.println(d);
			
		}

	}

}

class Book implements Comparable
{

	public int price;
	public String name;
	public int quantity;



	public Book(int price , String name , int quantity) 
	{
		this.price =price;
		this.name = name;
		this.quantity = quantity;
		
	}
		
	
	
	@Override
	public int compareTo(Object obj) 
	{
		if(obj.equals(obj))
			return -1;
		if(obj.equals(obj))
			return -1;
		else
			return 0;

}
}