class Swan implements Flyable, Walkable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Swan is able to fly");
    }

    @Override
    public void walk() {
        System.out.println("Swan is able to walk");
    }

    @Override
    public void swim() {
        System.out.println("Swan is able to swim");
    }

    public void run() {
        System.out.println("Swan is able to run");
    }

    public void eat() {
        System.out.println("Swan is able to eat");
    }

    @Override
    public void name(String name) {
        System.out.println("The name of the Swan is " + name);
    }
}
