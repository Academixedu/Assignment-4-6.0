public class Main {
    public static void main(String[] args) {
        Swan s = new Swan();
        s.swim();
        s.fly();
        s.walk();
        s.name("Bittu");

        Turtles t = new Turtles();
        t.swim();
        t.fly();
        t.walk();
        t.name("Diehard");

    }

    static class Swan {
        public void swim() {
            System.out.println("Swan is dancing.");
        }

        public void fly() {
            System.out.println("Swan is jumping.");
        }

        public void walk() {
            System.out.println("Swan is walking.");
        }

        public void name(String name) {
            System.out.println("Swan's name is: " + name);   
        }
    }

    static class Turtles {
    public void swim() {
        System.out.println("Turtle can sleep");
    }

    public void fly() {
        System.out.println("Turtle can shout");
    }

    public void walk() {
        System.out.println("Turtle can walk");
    }

    public void name(String name) {
        System.out.println("Turtle name is: " + name);
    }

}
}