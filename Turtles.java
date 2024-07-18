public class Turtles implements Flyable,Swimmable,Walkable{
// implement desired interface and make implementations to it

    @Override
    public void fly() {
        System.out.println("turtles cannot fly");
   }   

    @Override
    public void swim() {
        System.out.println("turtles can swim");
   }

    @Override
    public void walk() {
        System.out.println("turtles cannot walk");

   }    
   @Override
   public void name(String name) {
    System.out.println("name of the anaimal is "+name);
       
   }   
   

    @Override
    public void name( ) {
        
    }

    @Override
    public void speed() {
        System.out.println("speed of the anaimal is 5km/h");
    }

    @Override
    public void eat() {
        System.out.println("turtles eat vegatables");
    }

    
    

}
