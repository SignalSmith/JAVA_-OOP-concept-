 
  class A               // parent class or Super class
  {
      public A()         // constructor 
      {
         super();        // even it is not mentioned it is always present 
        System.out.println("in class A");
      }
      public A(int a)       // parameterized constructor 
    {
         super();
         System.out.println("in class A integer");
    }
  }

   class B extends A     // child class or sub class
   {
    public B()       // constructor 
    {    
         super();
         System.out.println("in class B");
    }

    public B(int n1)       // parameterized constructor 
    {
         this();    // this()---> executes the constructor of this method only 
         System.out.println("in class B integer");
    } 
   }



public class this_method {

     public static void main(String args[])
     {
           B obj = new B(20);            
    
}
}


// ****  every constructor in JAVA have a method named super()  even it is not mentioned 
