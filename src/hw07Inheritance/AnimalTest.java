package hw07Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();

		Dog dog = new Dog();
		dog.dogInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();

		Snake snake = new Snake();
		snake.snakeInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();

		Birds birds = new Birds();
		birds.birdsInfo();

		Robin robin = new Robin();
		robin.robinInfo();

		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		robin.birdsInfo();
		robin.animalInfo();
	}

}
