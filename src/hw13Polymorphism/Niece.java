package hw13Polymorphism;

/*
 * Method overriding occurs when a subclass provides a specific implementation
 * for a method that is already defined in its superclass.
 * The overridden method must have the same name, return type, and parameters.
 */

public class Niece extends Sister {
    // Overriding method with void type
   
	@Override
    public void sister(int age1 + age2) {
        // New logic for Niece
    }

    // Overriding method with parameterized type
    @Override
    public void sister(int age2, int age3) {
        // New logic for Niece
    }

    // Overriding method with return type
    @Override
    public String sister(String age4) {
        // New logic for Niece
        return age4 + " (modified)";
    }
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



