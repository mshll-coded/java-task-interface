import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Collections.addAll(animals, new Cat(), new Dog());

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            animal.sleep();
            System.out.println("---");
        }
    }
}
