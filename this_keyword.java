
class Human
{
     private int age;  // age & name are instance variable 
     private String name;

       public void setage(int a)  // a is the local variable can be accesible only by the method setage
      {
        age= a;
      }

       public int getage() 
       {
        return age;
       }

       public void setname(String name)
      {
        this.name= name;       // this is a keyword which represent the current object --> is used to differentiate the local variable and instance variable 
      }

       public String getname()
       {
        return name;
       }
}





public class this_keyword 
{
      public static void main(String args [] )
      {
          Human obj= new Human();
    obj.setage(22);
    obj.setname("Mousumi");
    System.out.println(obj.getage() + " "  + obj.getname());

      }

}
    

