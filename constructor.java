// constructor is a special type of method which don't have any retuen type and have the same name as the class name 
// every time when object of class created by default the constructor is called 

class Human
{
    private int age;
    private String name;
 
     public Human()   // defaulr constructor 
     {
         System.out.println("Constructor is called ");
     }

     public Human(int age, String name )     // parameterized constructor
     {
        this.name=name;
        this.age= age;
        System.out.println(age + " " + name);
     }
}


public class constructor 
{
     public static void main(String args[])
     {
     Human object  =new Human();
     Human object1  =new Human(40, "Monalisa");
     }
     
    
}
