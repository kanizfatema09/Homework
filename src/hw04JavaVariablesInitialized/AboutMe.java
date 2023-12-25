package hw04JavaVariablesInitialized;

public class AboutMe {
	// Variable is initialized.
	public String myName = "Kaniz Fatema"; 
	public byte myAge = 35;
	public short myHouseMortgage= 3783;
	public int myYearlySalary = 157600;
	public long myBankBalance= 650789783l;
	public float  myHeight= 6.74585f; 
	public double myGrade = 3.9876543;
	public char myGender  = 'F';
	public boolean usCitizen = true; 
	

	public AboutMe() { // Constructor is declared.
		System.out.println(":------------ This is all about Myself ------------:");

	}
	public void aboutMe() { // Method implemented

		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy House Mortgage: " + myHouseMortgage
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);		
	
	}

}
