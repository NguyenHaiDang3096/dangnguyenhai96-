package lab5;
import java.util.Scanner;
//import lab5.Employee;
public class Main {
	public int i;
	static Employee[] employee= new Employee[10];
	public static boolean isEndProgram = false;
	public static Scanner scannerInput = new Scanner(System.in);
	public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	
	public static void showMenu() {
		
		System.out.println(" 1. Create Employee");
		System.out.println(" 2. Show the existing emloyee");
		System.out.println(" 3. Exit" );
		int inputNumber=0;
		do {
		
		System.out.print(" Please input a number : " );
		inputNumber = scannerInput.nextInt();
		  switch (inputNumber) {
		case 1:
			System.out.println("  Create Employee");
			addEmloyee();
			askContinue();
            break ;
        case 2:
	    System.out.println("  Show the existing emloyee");
	    showEmloyee();
			break;
        default:
		
			break;
		}
		}while(inputNumber!=3);
		 System.out.println("  Exit" );
	}
	private static void showEmloyee() {
		   for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].id + " " + employee[i].name + " " +  employee[i].Salary+" " + employee[i].job);
			//System.out.println(employee[i].name  );
			//System.out.println(employee[i].Salary );
			//System.out.println(employee[i].job );
			
		}
	   }   
	private static void askContinue() {
		// TODO Auto-generated method stub
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		Scanner scanner = null;
		int inputNo = scanner.nextInt();
		scanner = null;
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		
	}}
	private static void addEmloyee() {
	    Scanner input = new Scanner(System.in);
	    System.out.println("  Nhap vao so Employee:   ");
	    int n= input.nextByte();
	    employee= new Employee[n];
	    for (int i = 0; i < employee.length; i++) {
		System.out.println("  id   ");
		int id= input.nextInt();
		System.out.println("  Name   " );
	    String name= input.next();
        System.out.println("   Salary" );
		int Salary= input.nextInt();
		System.out.println(" Job" );
		String job= input.next();
		Employee employee1 = new Employee(id,name,Salary,job);
		employee[0]=employee1;
		System.out.print(" |" + id );
		System.out.print(" |" + name );
		System.out.print(" |" + Salary );
		System.out.println("|" + job );
	    }
	   
	 }
	}


