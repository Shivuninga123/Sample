package colection;

public class Ninga { 
	int a=15;
public void finalize() {
		System.out.println("collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninga aa=new Ninga();
	aa=null;
	
	new Ninga();
	Ninga bb=new Ninga();
	Ninga cc=new Ninga();
	cc=bb;
	

System.gc();
	}

}
