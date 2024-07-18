class Turtles implements Swimmable, Flyable{
  public void swim()
  {
    System.out.println("The turtle is able to swim");
  }
  public void fly()
  {
    System.out.println("The turtle is able to fly");
  }

  public void eat()
  {
    System.out.println("The turtle is able to eat");
  }

  public void run(){
    System.out.println("The turtle is unable to run");
  }
 

  public void name(String name)
  {
    System.out.println("The name of the turtle is "+name);

}
}
