package hw03JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor initialized here.
		System.out.println("My Name: " +aboutMe.myName + "\nMy Age: " +aboutMe.myAge + "\nMy House Mortgage: "
				+aboutMe.myHouseMortgage + "\nYearly Salary: " +aboutMe.myYearlySalary + "\nMy Bank Balance: "
				+aboutMe.myBankBalance + "\nSex: " +aboutMe.myGender + "\nMy Height: " +aboutMe.myHeight + "\nMy Grade: "
				+aboutMe.myGrade + "\nAm I US Citizen? Ans: " +aboutMe.usCitizen);

	}

}
