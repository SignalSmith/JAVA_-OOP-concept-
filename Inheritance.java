

class Human
{
    public int age(int a)
    {
        return a;
    }
     public int height(int h)
     {
        return h;
     }
}

 class Student extends Human   // Student child class inherits from Human class 
 {
     public int marks(int b)
     {
        return b;
     }

      public int roll(int c)
      {
        return c;
      }
 }

public class Inheritance {
    public static void main(String args[])
    {
       Student obj= new Student();         // creating the object of child class 
       int ans1= obj.age(18);
        int ans2= obj.height(5);
         int ans3= obj.marks(90);
         int ans4= obj.roll(53);

         System.out.println( ans1 + " " + ans2 +  " " + ans3 + " " + ans4 );

    }
}
