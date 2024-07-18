public class Swan implements Walkable, Flyable {
    @Override
    public void name(String name) {
        System.out.println(name);
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
    // Implement desired interfaces and write necessary implementations
}
