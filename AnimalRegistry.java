public class AnimalRegistry{
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;
    
    public Animal createSheep(){
        Sheep sheep = sheepPrototype.clone();
        return sheep;
    }
    public Animal createCow(){
        Cow cow = (Cow) cowPrototype.clone();
        return cow;
    }   
    public Animal createHorse(){
        Horse horse = (Horse) horsePrototype.clone();
        return horse;
    }   
}