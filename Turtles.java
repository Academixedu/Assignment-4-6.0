public class Turtles implements Swimmable, Flyable, Walkable {

    @Override
    public void fly() {
       System.out.println("Turtles cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("Turtles can swim");
    }

    @Override
    public void walk() {
        System.out.println("Turtles can walk");
    }    

    @Override
    public void name(String name) {
        System.out.println("Turtles name is " + name);
    }
// implement desired interface and make implementations to it
}
