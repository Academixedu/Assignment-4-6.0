public class Turtles implements Swimmable, Walkable, Flyable{

    @Override
    public void name(String name) {
        System.out.println("This animal is a Turtle" + (name));
        
    }

    @Override
    public void swim() {
        System.out.println("A Turtle can Swim.");
        
    }

    @Override
    public void walk() {
        System.out.println("A Turtle can walk, basically crawl.");
        
    }

    @Override
    public void fly() {
        System.out.println("A Turtle cannot fly.");
        
    }
    
}
