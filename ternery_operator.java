public class ternery_operator {
     public static void main(String arr[])
    {
        // odd even number 

         int n=9;
         int result = 0;

         /*   one way 
          if(n%2==0)
         result= 10;

         else
         result= 20;

         System.out.println(result); */ 

         //using ternery operator ? :

         result = n%2==0 ? 10 : 20 ;   //if the condition satisfies ? then print 10 or : print 20 
         System.out.println(result);
    }
}
