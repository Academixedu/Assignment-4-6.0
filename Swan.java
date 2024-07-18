public class Swan implements Walkable, Flyable, Swimmable {

    @Override
    public void swim() {
        System.out.println("Swan can Swim");
    }

    @Override
    public void fly() {
        System.out.println("Swan can Fly");
    }
public void walk(){
    System.out.println("Swan can Walk");
}
    @Override
    public void name(String name) {
        System.out.println("Swan name is:" +name);
        
    }
// Implement desired interfaces and write necessary implementations

  
}
