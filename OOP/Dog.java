class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}