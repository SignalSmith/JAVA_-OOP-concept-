 
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
         super();    // at the time og execution this super method refer the super class here class A thus the default parameteriized constructor called as no parameter passed in super()
         System.out.println("in class B integer");
    } 
   }



public class super_class {

     public static void main(String args[])
     {
           B obj = new B(15);            // constructor of parent class executes  first 
     }
    
}


// ****  every constructor in JAVA have a method named super()  even it is not mentioned 
