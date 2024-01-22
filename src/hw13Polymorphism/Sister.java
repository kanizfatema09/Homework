package hw13Polymorphism;

/*
 * Method overloading allows a class to have multiple methods with the same name
 * but different parameters (types, number, or both).
 * The compiler determines which method to invoke based on the method signature.
 * Overloaded methods provide flexibility and clarity to the code.
 */

public class Sister {
	public void sister() {
		System.out.println("This is from void type method from Sister");
	}
	
	public void sister1(int age1, int age2) {
		int totalAge1 = 1 + 2;
        System.out.println("Sister's age are: " + totalAge1);
    }

	public int sister(int age1, int age2, int age3) {
		int totalAge2 = 1 + 2 + 3;
		System.out.println("Total area from Sister: " + totalAge2);
		return totalAge2;
	}

	public int sister(String age4, int age5, int age6) {
		int totalAge3 = age5 + Integer.parseInt(age4) + age6; 
		System.out.println("Total area from Sister: " + totalAge3);
		return totalAge3;
	}
    
	public final int sister (int age1, int age2, int age3, int age4) {
		int totalAge5 = 1+2+3+4; 
		System.out.println("Total area from Sister: " + totalAge5);
		return totalAge5;
	}

	public static void sister (int age1, int age2, int age3, int age4, int age5) {
		int totalAge7 = 1+2+3+4+5; 
		System.out.println("Total area from Sister: " + totalAge7);
	}

	public void sister(int age1) {
		// TODO Auto-generated method stub
		
	}

	public void sister(int age2, int age3) {
		// TODO Auto-generated method stub
		
	}

	
	}
	
	
    

	


