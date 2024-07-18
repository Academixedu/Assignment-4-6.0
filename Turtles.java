public class Turtles implements Swimmable, Walkable {
// implement desired interface and make implementations to it
@Override
public void swim() {
   System.out.println("Turtles can swim");
}
@Override
public void name(String name) {
   System.out.println("Turtles name is "+name);
}
@Override
public void walk() {
  System.out.println("Turtles can walk");
}
}