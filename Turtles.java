public class Turtles implements Walkable,Swimmable{

    // implement desired interface and make implementations to it

    @Override
    public void swim() {
        System.out.println("Turtles can be swim");
        
    }

    @Override
    public void walk() {
        System.out.println("Turtles can be walk");
    }

    @Override
    public void name(String name) {
        System.out.println("The name is:"+name);
       
    }

}
