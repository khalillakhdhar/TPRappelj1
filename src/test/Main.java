package test;

import users.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("test", "test", 20,"aucune", "88877766", "dev", 4500);
		Employee e2=new Employee("test2", "test2", 22,"404 not found", "88877760", "tech", 2500);
//		System.out.println(e1.toString());
	//	System.out.println(e2.toString());
		Employee.employees.add(e1);
		Employee.employees.add(e2);
for(Employee em: Employee.employees)
{
	System.out.println(em.toString());

}
		
	}

}
