public class Turtles implements Flyable,Swimmable,Walkable{

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("turtles can walk");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("turtles can swim");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
       System.out.println("turtles can't fly");
    }

    @Override
    public void name(String name) {
        // TODO Auto-generated method stub
        System.out.println("turtles are related to amphibian family. "+(name));
    }
// implement desired interface and make implementations to it
}
