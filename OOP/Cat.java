class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}