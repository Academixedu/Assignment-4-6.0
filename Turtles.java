public class Turtles implements Walkable,Flyable,Swimmable{
    
   public  String method1 (String name)
    {
          System.out.println("this is the initial name "+ name);
        String ss=" ";
         for(int i=name.length()-1;i>=0;i--)
         {
             ss+=name.charAt(i);
        }
        return ss;
    }
    public void fly()
    {
        System.out.println("open your wings and fly");
    }
    public void name(String name){
        System.out.println("printing the string "+name);
    }
    public int prime(int n){
        int count,v=0;
        int arr[] =new int[n];
        for(int i=1;i<n;i++){
            count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==0)
            {
                arr[v]=i;
                v++;
            }
        }
        for(int g=0;g<arr.length;g++)
        {
            if(arr[g]!=0)
        System.out.print(arr[g]+ " ");}
        return 999;
    }
    public void swim()
    {
        System.out.println("swim bro ");
    }
   
    public char gender(String name)
    {
        if(name.charAt(name.length()-1)=='a' || name.charAt(name.length()-1)=='i')
        return 'F';
        else 
        return 'M';
    }
}
