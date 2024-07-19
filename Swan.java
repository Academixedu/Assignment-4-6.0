public class Swan {

    // Implement desired interfaces and write necessary implementations
    class SwanImplementation implements Walkable, Flyable, Swimmable {
        public void swim() {
            System.out.println("Swan can swim");
        }

        public void fly() {
            System.out.println("Swan can fly");
        }

        public void walk() {
            System.out.println("Swan can walk");
        }

        public void name(String name) {
            System.out.println("Swan name is: " + name);
        }
    }
}