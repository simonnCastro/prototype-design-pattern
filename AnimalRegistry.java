public class AnimalRegistry{
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;
    
    public Animal createSheep(){
        Sheep sheep = (Sheep) sheepPrototype.clone();
        return sheep;
    }
    public Animal createCow(){
        Cow cow = cowPrototype.clone();
        return cow;
    }   
    public Animal createHorse(){

    }   
}