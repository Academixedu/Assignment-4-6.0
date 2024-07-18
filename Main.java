public class Main{
  public static void main(String []args){
    // All Objects Creations and Method Callings Should do here
    Swan s1 = new Swan();
    s1.fly();
    s1.swim();
    s1.walk();
    s1.name("Donald");

    System.out.println("Now we are printing for the Turtule");

    Turtles t1 = new Turtles();
    t1.fly();
    t1.swim();
    t1.walk();
    t1.name("Robin hood");



  }
}
