// static method only can access static variables any other non static variables or instance variables are not accesible by static method 

class mobile
{
    String brand; // brand price name  are the instance variable 
    int price;
    String name; 
    public static void show(mobile obj) // static function or method 
    {
     System.out.println(obj.brand + " " + obj.price + " " + obj.name );  // which cannot access the instance variables but with the object referance it is possible 
    }
}

public class static_method {
    public static void main(String args[])
    {
     mobile obj1= new mobile();
        obj1.brand= "Vivo";
        obj1.price= 4500;
        obj1.name= "Smart phone";

         mobile obj2= new mobile();
       obj2.brand= "Apple";
        obj2.price= 5000;
        obj2.name= "Iphone";
          
         mobile.show(obj1);
    }
}
