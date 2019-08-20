package lab3;

import lab1.Employee;

public class Company {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("  id   ");
		System.out.print("  Name   " );
		System.out.print("   Salary" );
		System.out.println(" Job" );
		Employee employee1 = new Employee(1,"Nguyen Van A",3000, "HR");
		Employee employee2 = new Employee(2,"Nguyen Van B",4000, "BA");
		Employee employee3 = new Employee(1,"Nguyen Van C",5000, "Tester");
		Employee employee4 = new Employee(2,"Nguyen Van D",6000, "Developer");
		Employee employee5 = new Employee(1,"Nguyen Van E",7000, "CEO");
		Employee[] employeeArray = new Employee[5];
		employeeArray[0]=employee1; 
		System.out.print(employeeArray[0].id +);
		
	}

}
