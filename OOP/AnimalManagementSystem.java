import java.util.Scanner;

public class AnimalManagementSystem {
    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nAnimal Management System Menu:");
            System.out.println("1. Add Animal");
            System.out.println("2. Remove Animal");
            System.out.println("3. Find Animal");
            System.out.println("4. Display All Animals");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter animal age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter species (Dog, Cat, Lion, Elephant, etc.): ");
                    String species = scanner.nextLine();

                    Animal animal = createAnimal(species, name, age);
                    if (animal != null) {
                        manager.addAnimal(animal);
                        System.out.println("Animal added successfully.");
                    } else {
                        System.out.println("Invalid species. Animal not added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the name of the animal to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeAnimal(nameToRemove);
                    System.out.println("Animal removed if it existed.");
                    break;

                case 3:
                    System.out.print("Enter the name of the animal to find: ");
                    String nameToFind = scanner.nextLine();
                    Animal foundAnimal = manager.findAnimal(nameToFind);
                    if (foundAnimal != null) {
                        System.out.println("Animal found: " + foundAnimal);
                        System.out.println("Sound: " + foundAnimal.makeSound());
                    } else {
                        System.out.println("Animal not found.");
                    }
                    break;

                case 4:
                    manager.displayAllAnimals();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    public static Animal createAnimal(String species, String name, int age) {
        return switch (species.toLowerCase()) {
            case "dog" -> new Dog(name, age);
            case "cat" -> new Cat(name, age);
            case "lion" -> new Lion(name, age);
            case "elephant" -> new Elephant(name, age);
            // Add cases for other species as necessary
            default -> null;
        };
    }
}
