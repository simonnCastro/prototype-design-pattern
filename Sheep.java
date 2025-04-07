public class Sheep implements Animal{
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
    }

    public Sheep(Sheep sheep) {
        this.legs = sheep.legs;
        this.sound = sheep.sound;
        this.food = sheep.food;
        this.name = sheep.name;
    }
    @Override
    public Animal clone() {
        return new Sheep(this);
    }
    @Override
    public void makeSound() {
        System.out.println("Sheep makes sound: " + sound);
    }
    @Override
    public String getType() {
        return "Sheep";
    }
}