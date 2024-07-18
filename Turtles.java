public class Turtles implements Swimmable, Walkable, Flyable{
// implement desired interface and make implementations to it
public void walk()
{
  System.out.println("Turtle can Walk");
}
public void swim()
{
  System.out.println("Turtle can Swim");
}
public void fly()
{
    System.out.println("Turtle can't Fly");
}
public void name(String name)
{
    System.out.println("Turtle name is "+name);
}
}
