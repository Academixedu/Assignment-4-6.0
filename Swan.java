public class Swan implements Flyable, Walkable, Swimmable{

    @Override
    public void swim() {
        System.out.println("A Swan can swim");
    }

    @Override
    public void walk() {
        System.out.println("A Swan might or might not walk");
    }

    @Override
    public void fly() {
        System.out.println("A Swan can Fly");
    }

    @Override
    public void name(String name) {
        System.out.println("This animal's name is Swan"  + name);
    }

}
