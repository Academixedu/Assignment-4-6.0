public class Turtles implements Walkable, Swimmable {

    @Override
    public void name(String name) {
        System.out.println(name);
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
    // implement desired interface and make implementations to it

    public int fast() {
        return 0;
    }

    @Override
    public int fast(int x) {
        return x;
    }
}
