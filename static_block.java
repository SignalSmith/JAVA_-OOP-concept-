// every time when object is created ther are two steps 1st class loads and then 2nd objects are instatiated or created 
// static block is used to initialized the static variables 

class mobile
{
    String brand;
    int price;
    static String name;

     static              // static block // static block calles first before  any other functions are called 
     {                   // it called 1st because class loads 1st then object created 
        name= "SMART PHONE";
        System.out.println("Static block called ");
     }
      
    public  void store()
    {
        brand ="Vivo";
        price= 4500;
    }
      
      public mobile()      //constructor having same name of class name and called automatically when object is created of created of class 
      {
            System.out.println( "constructor block called ");
      }
}



public class static_block {
    public static void main(String args[])
    {
          mobile obj= new mobile();  
          mobile obj1= new mobile(); 

           // without creating any object we can not load the calss as a result the static block and any constructor can not called 
           // now we want to load class without loading the class to execute the static block 
           // using "Class" class it is possible to load class 
            
          // Class.forName ( "mobile"); 


    }
}
