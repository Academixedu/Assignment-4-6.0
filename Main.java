public class Main {
  public static void main(String[] args) {
    Turtles t = new Turtles();
    t.name("Turtle");
    t.walk();
    t.swim();
    System.out.println(t.fast(5));

    Swan s = new Swan();
    s.name("Swan");
    s.walk();
    s.fly();
    System.out.println(t.fast());

  }
}
