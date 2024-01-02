package hw06Methods;

public class FullName {
    
    public String fullName(String fName, String lName) {	
    	System.out.println("Family Member: " + fName + " " + lName);
    	return fName;
    }
    	
    	 public static void main(String[] args) {
    		 FullName fullName = new FullName();
    		 String familyNameString1 = fullName.fullName("Tasnim", "Tasawal");
    		 String familyNameString2 = fullName.fullName("Sahir", "Subhi");
    		 String familyNameString3 = fullName.fullName("Ahil", "Reehum");
    	 }
    	
    }
   
    

	

     
        

	
		
	
