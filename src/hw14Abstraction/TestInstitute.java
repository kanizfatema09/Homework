package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		MedicalSchool medicalSchool = new MedicalSchool() {
			
			@Override
			public void lawSchoolInfo() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void hygiene() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void anatomyLab() {
				// TODO Auto-generated method stub
				
			}
		};
		medicalSchool.anatomyLab();
        medicalSchool.biochemistryLab();
        
}
	}


