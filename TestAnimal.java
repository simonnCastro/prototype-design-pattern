public class TestAnimal {
    public static void main(String[] args) {
        
        AnimalRegistry registry = new AnimalRegistry();
        Animal sheep = registry.createSheep("Dolly");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        System.out.println("Sheep name: " + sheep.getType());
        System.out.println("Cow name: " + cow.getType());
        System.out.println("Horse name: " + horse.getType());

        sheep.makeSound();
        cow.makeSound();
        horse.makeSound();
    }
}