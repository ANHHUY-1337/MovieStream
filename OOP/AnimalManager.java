import java.util.ArrayList;
import java.util.List;


class AnimalManager {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(String name) {
        animals.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
    }

    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void displayAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the system.");
            return;
        }
        animals.forEach(System.out::println);
    }
}
