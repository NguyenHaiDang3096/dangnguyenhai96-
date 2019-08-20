package Lab2;

import Lab1.Student;

public class Adog {
	public Adog(String name, String color, int age, String propertites) {
		System.out.print("Dog Name is :" + name  );
		System.out.print("," );
		System.out.println("Passed  is  propertites :" + propertites );
		
	}
	public static void behaviors(String Behaviors) {
		System.out.println(" Behaviors is :" + Behaviors  );
	}
	public static void main(String[] args) {
		Adog myAdog1 = new Adog("Zone", "vang", 2,"khoe") ;
		behaviors("wagging the taill");
		Adog myAdog2 = new Adog("Vang", "vang", 3, "om") ;
		behaviors("barking");
		Adog myAdog3 = new Adog("Muc", "den", 2, "khoe") ;
		behaviors(" eating");
		}
}
