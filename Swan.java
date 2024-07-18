public class Swan implements Flyable, Swimmable, Walkable {

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("Swan can Swim");
        
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Swan can fly");
        
    }

    @Override
    public void name(String name) {
        // TODO Auto-generated method stub
        System.out.println("Swan are related to the Avian family: "+(name));
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Swan can't walk.");
    }
   
    
    
     
}
