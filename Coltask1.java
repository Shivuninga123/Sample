package colection;

import java.util.ArrayList;

public class Coltask1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList<Integer> a2=new ArrayList<>(a1);
		a2.add(5);
		a2.add(7);
		//for(Integer ss:a1) {
		//a2.add(ss);
	//}
		System.out.println(a2);

	}
}

