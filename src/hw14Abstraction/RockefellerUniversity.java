package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{
	public void maths() {
		System.out.println("The Mathmatics class of Rockefeller University");
	}

	@Override
	public void mechanicalLab() {
		System.out.println("Mechanical Lab method from Engineering School Abstract");
	}


	@Override
	public void aeronauticalInfo() {
		System.out.println("Aeronautical Info method from Aeronautical School Interface");
	}
		
	
		
	}

