
public class Main{
    public static void public static void main(String[] args) {
        
        AnimalBox<Dog> dogBox = new AnimalBox<>();
        dogBox.setAnimal(new Dog());
        dogBox.makeSound();

        AnimalBox<Cat> catBox = new AnimalBox<>();
        catBox.setAnimal(new Cat());
        catBox.makeSound(); 

    }
}