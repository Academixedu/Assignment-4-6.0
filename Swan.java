public class Swan implements Swimmable, Flyable, Walkable{

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Swam cannot Walk");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Swans can Fly");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("Swans can Swim");
    }

    @Override
    public void name(String name) {
        // TODO Auto-generated method stub
        System.out.println("Swan species is realated Avian family of animal kingdom. " +"The relative name is "+name);
    }
// Implement desired interfaces and write necessary implementations
}
