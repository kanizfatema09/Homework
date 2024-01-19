package hw13Polymorphism;

/*
 * Method overriding occurs when a subclass provides a specific implementation
 * for a method that is already defined in its superclass.
 * The overriding method must have the same name, return type, and parameters.
 * Method overriding is a key feature of polymorphism.
 */


public class Niece extends Sister{
	
	@Override
	public void sister() {
		System.out.println("This is from void type method from Niece");
	}

	 @Override
	    public void sister(int age1, age2); 
	        System.out.println("Niece's age is: " + age);
	    

	    @Override
	    public void sister(int age1, int age2, int age3) {
	        System.out.println("Niece ages are: " + age1 + ", " + age2 + ", " + age3);
	    }

	    @Override
	    public void sister(String age4) {
	        System.out.println("Niece's age is: " + age4);
	    }
	    
	    /*
	     * Cannot override static method
	     *     // Because Static methods belong to the class, not to instances.
	     *     // Subclasses share the same static method as the superclass,
	     *     // so overriding is not applicable for static methods.
	     */
	 // @Override
	    // public static void sisterStatic() {...}
	    
	    /*
	     * Cannot override final method
	     *     // Because Final methods are meant to be unchangeable in subclasses.
	     *     // Overriding a final method is not allowed to maintain the integrity
	     *     // and intended behavior of the superclass.
	     */
	    // @Override
	    // public final void sisterFinal() {...}

}
