public class Swan implements Swimmable,Flyable{
    @Override
    public void swim() {
        System.out.println("swan can Swim");     
    }   
    @Override           
    public void fly() { 
        System.out.println("swan can Fly");
    }
      public void name(String name) {
        System.out.println(name);
    }
      public void walk(){
        System.out.println("swan can Walk");
     }
     public void canSwim(){
        System.out.println("Swimming");
     }
}