package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Indira Paul");
		employee.setEmpAge(27);
		employee.setEmpSex('F');
		employee.setEmpCitizen(true);

		System.out.println("Employee Name: " + employee.getEmpName() + "\nEmployee Age: " + employee.getEmpAge()
				+ "\nGender: " + employee.getEmpSex() + "\nEmployee US Citizen: " + employee.isEmpCitizen());

	}

}
