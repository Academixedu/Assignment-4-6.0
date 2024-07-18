public class Swan implements Flyable,Swimmable,Walkable{

    @Override
    public void swim() {
        System.out.println("Swan is Swimming"); 
    }

    @Override
    public void fly() {
      System.out.println("swan is Fly");
    }

    @Override
    public void name(String name) {
      System.out.println("My name is "+name);
    }
// Implement desired interfaces and write necessary implementations

    @Override
    public void walk() {
        System.out.println("swan is walking");

}

    @Override
    public void eat() {
      System.out.println("Swan is eating");
}

    @Override
    public void dance() {
    System.out.println("Swan is dancing");
    }
}
