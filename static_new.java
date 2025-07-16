 
// static variables are the variables which is shareable by all the objects 
// static is a keyword 
class mobile
{
    String brand; // brand price are the instance variable 
    int price;
     static String name; // name is the static varibale which is shareable by all the objects 
    public void display()
    {
     System.out.println(brand + " " + price + " " + name );
    }
}



public class static_new {

     public static void main(String args[])
     {
        mobile obj1= new mobile();
        obj1.brand= "Vivo";
        obj1.price= 4500;
        obj1.name= "Smart phone";
        
       mobile obj2= new mobile();
       obj2.brand= "Apple";
        obj2.price= 5000;
        obj2.name= "Iphone";  // as the name changes of obj2 automatically the name of obj1 changes as the name is static variable and shareable by all the variables 
         obj1.display();
         obj2.display ();
     }
    
}
