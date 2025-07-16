
class computer
{
    public void music()
    {
        System.out.println("Music is playing .....");
    }

     public String pen(int cost)
     {
        if(cost>=15)
        {
            return "Got the pen !! ";
        }
        else
        {
            return "Noting";
        }
     }
}

public class methods {
      public static void main(String arr[])
      {

         int value=5;
         computer obj= new computer() ;
         obj.music();
         String str = obj.pen(value);
         System.out.println(str);
      } 
}
