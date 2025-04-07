public class Horse implements Animal{
    private int legs;
    private String sound;
    private String food;
    private String name;
    
    public Horse clone() {
        Horse Horse = new Horse();
        Horse.legs = this.legs;
        Horse.sound = this.sound;
        Horse.food = this.food;
        Horse.name = this.name;
        return Horse;
    }
    public void makeSound() {
        System.out.println("Horse makes sound: " + sound);
    }
    public String getType() {
        return "Horse";
    }
}