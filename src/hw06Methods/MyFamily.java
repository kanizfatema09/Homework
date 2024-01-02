package hw06Methods;

public class MyFamily {

	public int child1Age = 19;
	public int child2Age = 16;
	public int child3Age = 6;

	public int myFamily() {
		 int sum = child1Age + child2Age + child3Age;
		 System.out.println("The sum of my children age is: " + sum);
		  return sum;
	}
		  
		  public static void main(String[] args) {
			  MyFamily myFamily = new MyFamily();
			  myFamily.myFamily();
			  
		  
	}
      
    }
    