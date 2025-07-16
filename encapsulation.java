// Encapsulation in Java means hiding the internal details of a class and only showing the necessary parts through methods.

class Human
{
    private int age ; // using private keyword we only can access the variables inside the class not outside it 
    private String name ; 
     // to access and initialize value to the variables getter and setter methods are used 

      public void setage(int a) // setter method to store vale 
      {
        age= a;
      }

       public int getage() // getter method to display the the value 
       {
        return age;
       }

       public void setname(String n)
      {
        name= n;
      }

       public String getname()
       {
        return name;
       }

}


public class encapsulation 
{

  public static void main(String args[])
  {
    Human obj= new Human();
    obj.setage(21);
    obj.setname("Anusua");
    System.out.println(obj.getage() + " "  + obj.getname());

  }
    
}
