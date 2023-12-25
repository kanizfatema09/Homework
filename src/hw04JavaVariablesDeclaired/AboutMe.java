package hw04JavaVariablesDeclaired;

public class AboutMe {
	// Variable is declared.
	public String myName;
	public byte myAge;
	public short myHouseMortgage;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;

	public AboutMe() { // Constructor is declared.
		System.out.println(":------------ This is all about Myself ------------:");
	}

	public void aboutMe() { // Method implemented
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy House Mortgage: " + myHouseMortgage
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);

	}

}
