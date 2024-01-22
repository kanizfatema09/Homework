package hw15IfElseCondition;

public class Voter {

	public static void main(String[] args) {

		// initialize age variable
		int age = 18;

		// conditions and outcomes
		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {

			System.out.println("I am not a Voter");
		} else if (age > 18) {

			System.out.println("I am a Voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}

