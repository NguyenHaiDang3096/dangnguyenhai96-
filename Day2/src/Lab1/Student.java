package Lab1;

public class Student {
	public Student(String name, String gender, int age) {
		System.out.println("Passed Name is :" + name );
		System.out.println("Passed gender is :" + gender );
		System.out.println("Passed age is :" + age );
	}
	public static void main(String[] args) {
		Student myStudent1 = new Student( "Davy","boy",6 );
		Student myStudent2 = new Student( "Join","boy",7 );
		Student myStudent3 = new Student( "July","girl",6 );
		
	}
	}
