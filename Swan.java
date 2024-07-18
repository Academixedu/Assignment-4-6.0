 class Swan implements Walkable, Flyable, Swimmable {

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

    @Override
    public void run(){
        System.out.println("Swan is unable to run");
    }

    @Override
    public void eat(){
        System.out.println("Swan is unable to eat");
    }

    @Override
    public void name(String name) {
        System.out.println("The Name of the Swan is " + name);
}

}
