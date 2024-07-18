public class Turtles implements Swimmable,Walkable{
    public void swim(){
        System.out.println("Turtles swim under water");
    }
    public void walk(){
        System.out.println("Turtles walks on surface land");

    }
    public void name(String name){
        System.out.println(name+" has shell on it");

    }
    public void slow(){
        System.out.println("Turtles walks slowly");
    }
// implement desired interface and make implementations to it
}
