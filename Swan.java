public class Swan implements Flyable,Swimmable,Walkable{

    // Implement desired interfaces and write necessary implementations

    @Override
    public void swim() {
        System.out.println("Swan is swimmable");
    }

    @Override
    public void fly() {
        System.out.println("Swan is flyabble");
    }

    @Override
    public void name(String name) {
        System.out.println("The name is:"+name);  
    }

    @Override
    public void walk() {
        System.out.println("swan can walk");
        
    }

    @Override
    public void colours() {
        System.out.println("The swan can have different colours");
       
    }

    @Override
    public void colour(String colour) {
        System.out.println("The swan is in the white colour");
       
    }
}
