package hw5Q1Constructor;

public class Computer { // Variable is declared.
	public String compBrand;
	public String compModel;
	public String compOperatingSystem;
	public int compPrice;
	public char compGrade;
	public boolean madeInUSA;
	
	// Default Constructor declared.
	public Computer() {
		System.out.println("-----This is from the default Constructor of Computer class------");
	}
	// Parameterized Constructor declared.
	public Computer(String compBrand, String compModel, String compOperatingSystem, int compPrice, char compGrade,
			boolean madeInUSA) {
		super();
		this.compBrand = compBrand;
		this.compModel = compModel;
		this.compOperatingSystem = compOperatingSystem;
		this.compPrice = compPrice;
		this.compGrade = compGrade;
		this.madeInUSA = madeInUSA;

		System.out.println("Computer Brand:" + compBrand + ", Computer Model:" + compModel
				+ ", Computer Operating System:" + compOperatingSystem + ", Computer Price:" + "$" + compPrice
				+ ", ComputerGrade:" + compGrade + ", Made In USA:" + madeInUSA);

	}	

	
	}


