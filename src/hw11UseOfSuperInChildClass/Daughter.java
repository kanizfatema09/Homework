package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Mohammed Khan", 70, 'M', true);

		System.out.println("Default constructor of Daughter class.");
	}

	public Daughter(String name, int age, char sex, boolean usCitizen, String birthMonth, int ageDaughter) {
		super.father();
		super.fatherInfo("December", 63, 'F', true);
		super.fatherInfo("June", 29, 'M', false);
		System.out.println("Parameterized constructor of Daughter class.");

		super.familyName = "";

		System.out.println("Our family name is Khan");

		System.out.println("This Default Constructor is from Daughter Class");
	}

	public Daughter(String birthMonth, int age) {

		super("October", 25, 'M', true);

		super.father();
		super.fatherInfo("Rana", 34, 'M', true);

		super.familyName = "Hassan";
		System.out.println("Rana's family name is Hassan");

		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("Birth Month :" + birthMonth + ", Age:" + age);
	}

	public void daughter() {
		System.out.println(" This method is from Daughter Class");
	}

	public void daugherInfo(String birthMonth, int age) {

		System.out.println("Birth Month :" + birthMonth + ", Age:" + age);

	}
}
