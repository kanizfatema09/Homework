package hw04JavaVariablesDeclaired;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor initialized here.
		aboutMe.myName = "Kaniz Fatema"; // Variables initialized
		aboutMe.myAge = 35;
		aboutMe.myHouseMortgage= 3783;
		aboutMe.myYearlySalary = 157600;
		aboutMe.myBankBalance= 650789783l;
		aboutMe.myHeight= 6.74585f; 
		aboutMe.myGrade = 3.9876543;
		aboutMe.myGender  = 'F';
		aboutMe.usCitizen = true; 
		aboutMe.aboutMe(); // Method initialized
		
		
		System.out.println("This is all about Alex");
		AboutMe alex = new AboutMe(); // Constructor initialized here.
		alex.myName = "Alex"; // Variables initialized
		alex.myAge = 20;
		alex.myHouseMortgage= 2550;
		alex.myYearlySalary = 67000;
		alex.myBankBalance= 1458765498l;
		alex.myHeight= 5.4873f; 
		alex.myGrade = 3.45297;
		alex.myGender  = 'M';
		alex.usCitizen = false; 
		alex.aboutMe(); // Method initialized
		
		
		
	}

}
