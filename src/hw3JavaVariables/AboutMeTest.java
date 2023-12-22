package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor initialized here.
		System.out.println("My House Name: " + aboutMe.nameOfHouse + "\nMy House Age: " + aboutMe.houseAge
				+ "\nMy House Number: " + aboutMe.houseNumber + "\nMy House Mortgage: " + aboutMe.mortgage
				+ "\nMy Loan Amount: " + aboutMe.loanAmount + "\nMy Living Room Height:" + aboutMe.livingroomHeight
				+ "\nMy Entire House Height: " + aboutMe.entireHouseHeight + "\nMy Apartment Number:"
				+ aboutMe.apartmentNumber + "\nMy Brand New House:" + aboutMe.brandNewHouse);

	}

}
