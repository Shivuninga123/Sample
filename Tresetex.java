package colection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Tresetex 
{
	public static void main(String []args) {
		
		TreeSet<Integer> cc=new TreeSet<>();
		
		cc.add(10);
		cc.add(25);
		cc.add(10);
		cc.add(2);
		cc.add(3);
		System.out.println(cc);
		LinkedList<Integer> dd=new LinkedList<>((cc));//linked ash set
		System.out.println(dd);
		HashSet<String> kk=new HashSet<>();//hashset
		kk.add("ninga");
		kk.add("raju");
		kk.add("ramu");
		kk.add("ninga");
		kk.add(null);
		kk.add(null);
		System.out.println(kk);
		LinkedHashSet jj=new LinkedHashSet<>(kk);
		jj.add("ran");
		System.out.println(jj);
		TreeSet mm=new TreeSet<>();//tree
		mm.add("a");
		mm.add("A");
		mm.add("b");
		mm.add("c");
		mm.add("d");
		System.out.println(mm);
		System.out.println(mm.higher("b"));//higher
		System.out.println(mm.pollFirst());
		System.out.println(mm.pollLast());
		System.out.println(mm);
		System.out.println(mm.size());
		mm.add("e");
		mm.add("f");
		mm.add("g");
		System.out.println(mm);
		System.out.println(mm.headSet("e"));
		System.out.println(mm.tailSet("e"));
		
	}
	}


