public class Swan implements Swimmable, Walkable, Flyable {

    @Override
    public void fly() {
      System.out.println("Swan can fly");
    }

    @Override
    public void swim() {
      System.out.println("Swan can swim");
    }
    @Override
    public void walk() {
      System.out.println("Swan can walk");
    }

    @Override
    public void name(String name) {
      System.out.println("Swan name is " + name);
    }



// Implement desired interfaces and write necessary implementations
}
