package hw11UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This Default constructor is from Father Class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Name:" + name + ", Age:" + age + ",Sex:" + sex + " and Us Citizen? : " + usCitizen);
	}

	public void father() {
		System.out.println("This method is from Father Class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {

		System.out.println("Name:" + name + ", Age:" + age + ",Sex:" + sex + " and Us Citizen? : " + usCitizen);
	}

}