package colection;

import java.util.ArrayList;

public class Employee {
	String name;
	int empid;
	int age;
	int salary;
	long mobileno;
	
	Employee(String name,int empid,int age,int salary,long mobileno){
		this.name=name;
		this.empid=empid;
		this.age=age;
		this.salary=salary;
	this.mobileno=mobileno;
	}
	public String  toString() {
		return "\nemployyname:"+name+" "+"emplyoeeid:"+empid+" "+"employyeage:"+age+" "+"employeesalary:"+salary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> mm=new ArrayList<>();
		Employee dd=new Employee("Ninga",100,25,10000,9345445389l);
		
		mm.add(dd);
		mm.add(new Employee("ramu",101,26,15000));
		mm.add(new Employee("ramu",103,28,16000));
		
		System.out.println(mm);
		for(Employee kk:mm) {
			System.out.println(kk);
		}

	}

}
