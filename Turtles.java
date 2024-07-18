public class Turtles implements Flyable, Swimmable, Walkable{

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Turtles can Walk");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("Turtles can Swim");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Turtles can't 'Fly'. ");
    }

    @Override
    public void name(String name) {
        // TODO Auto-generated method stub
        System.out.println("Turtule are related to Amphibian family in animal Kingdom. " +"The relative name is "+name);
    }

// implement desired interface and make implementations to it



}
