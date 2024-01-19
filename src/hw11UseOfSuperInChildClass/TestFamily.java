package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println("\n---------- default constructor initialized from The Father Class -----------");
		Father father1 = new Father();

		System.out.println("\n---------- parametrized constructor initialized from The Father Class -----------");
		Father father2 = new Father("Kibria", 70, 'M', false);

		System.out.println("\n---------- void type method initialized from The Father Class  -----------");
		father2.father();

		System.out.println("\n---------- parameterized method initialized from The Father Class  -----------");
		father2.fatherInfo("Mofiz", 50, 'M', true);

		System.out.println("\n---------- default constructor initialized from The Daughter Class -----------");
		Daughter daughter1 = new Daughter();

		System.out.println("\n---------- parametrized constructor initialized from The Daughter Class -----------");
		Daughter daughter2 = new Daughter("July", 11);

		System.out.println("\n---------- void type method initialized from The Daughter Class  -----------");
		daughter1.daughter();

		System.out.println("\n---------- parameterized method initialized from The Daughter Class  -----------");
		daughter1.daugherInfo("May", 5);
	}
}
