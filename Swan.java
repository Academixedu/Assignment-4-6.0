public class Swan implements Flyable,Swimmable,Walkable{
    public void swim(){
        System.out.println("swan can swim in water!");
    }
    public void fly(){
        System.out.println("swan flys in air");
    }
    public void walk(){
        System.out.println("swan walks on surface land");
    }
    public void name(String name){
        System.out.println("the name of the bird is "+name);

    }
    public void color(){
        System.out.println("swan is white in color");
    }
// Implement desired interfaces and write necessary implementations
}
