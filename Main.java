public class main{
  public static void main(String []args){
      Swan s= new Swan();
      s.swim();
      s.fly();
      s.name("Swan");
      s.walk();
      s.canSwim();


      Turtles t= new Turtles();
      System.err.println("turtles output");
      t.walk();
      t.swim();
      t.name("Turtles");
      t.canSwim();

  }
}