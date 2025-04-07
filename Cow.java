public class Cow implements Animal{
    private int legs;
    private String sound;
    private String food;
    

    public Animal clone() {
        Cow cow = new Cow();
        return cow;
    }
    public void makeSound() {
        System.out.println("Cow makes sound: " + sound);
    }
    public String getType() {
        return "Cow";
    }
}