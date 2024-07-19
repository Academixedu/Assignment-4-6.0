public class Turtles{

    // implement desired interface and make implementations to it
    public class TurtlesImplementation implements Walkable, Flyable, Swimmable {
        public void swim() {
            System.out.println("Turtle can swim");
        }
    
        public void fly() {
            System.out.println("Turtle can fly");
        }
    
        public void walk() {
            System.out.println("Turtle can walk");
        }
    
        public void name(String name) {
            System.out.println("Turtle name is: " + name);
        }
    }
    }