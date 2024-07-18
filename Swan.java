public class Swan implements Flyable,Walkable,Swimmable{
// Implement desired interfaces and write necessary implementations

    @Override
    public void fly() {
        System.out.println("Swan is flying");

    }
    @Override
    public void name(String name) {
    System.out.println("name of the anaimal is "+name);
         
    }

    
    public void name() {
        System.out.println("Swan");

    }

    @Override
    public void swim() {  
        System.out.println("Swan is swimming");  

    }

    @Override
    public void walk() {
        System.out.println("Swan is walking");

    }
    @Override
    public void speed() {
        System.out.println("Swan is flying at 10km/hr");
    }
    @Override
    public void eat() {
        System.out.println("Swan is eats insects");
    }
    
}