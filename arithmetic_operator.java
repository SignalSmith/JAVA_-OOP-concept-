public class arithmetic_operator {
      public static void main(String arr[])
     {
         int num =8;
         int num2 = 5;
         int result= num % num2 ; // show the remainder 
         System.out.println(result);



          // for self arithmetic operations 
           int n1 = 5;
           n1 +=5;

           /*similarly 
            n1 -=2;
            n1 *=2; op= 10
           */
          System.out.println(n1);

           int n=4;
           // n++; post increment
           // ++n;   pre increment 

           int out = n++ ; // first fetch or print the value and then increment 
           // int out = ++n;  first increment  the value then fetch or print output will 5

             System.out.println(out);
     }
}
