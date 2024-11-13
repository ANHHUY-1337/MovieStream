abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getSpecies();
    public abstract String makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Species: " + getSpecies();
    }
}