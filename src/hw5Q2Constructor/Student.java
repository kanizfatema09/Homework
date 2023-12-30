package hw5Q2Constructor;

public class Student { // Variables are declared.
	public String studentName;
	public int stId;
	public char stGender;
	public boolean stProgrammer;
	public float stGrade;

	public Student() { // Default Constructor declared.
		System.out.println("--------This is from the default Constructor of the Student Class------");

	}

	// Parameterized Constructor declared.
	public Student(String studentName, int stId, char stGender, boolean stProgrammer, float stGrade) {
		this.studentName = studentName;
		this.stId = stId;
		this.stGender = stGender;
		this.stProgrammer = stProgrammer;
		this.stGrade = stGrade;
		System.out.println("Student Name:" + studentName + ", Student Id:" + stId + ", Student Gender:" + stGender
				+ ", Student Program:" + stProgrammer + ", Student Grade:" + stGrade);

		{
			
		}
		
	}

		
			
			
		
	}
	
	
	
	


