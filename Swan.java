class Swan implements Walkable, Flyable, Swimmable {
    @Override
    public void walk() {
        System.out.println("Swans can walk");
    }
    public void fly() {
        System.out.println("Swans can fly");
    }
    public void swim() {
        System.out.println("Swans can swim");
    }
    @Override
    public void name(String name) {
        System.out.println("Swans name is: "+name);
    }
}
// Implement desired interfaces and write necessary implementations

