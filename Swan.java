public class Swan implements Swimmable, Flyable {

    @Override
    public void swim() {
        System.out.println("Swimming");     
    }   
    @Override           
    public void fly() { 
        System.out.println("Flying");
    }
      public void name(String name) {
        System.out.println(name);
    }
      public void walk(){
        System.out.println("Walking");
     }
     public void canSwim(){
        System.out.println("Swimming");
     }
}
