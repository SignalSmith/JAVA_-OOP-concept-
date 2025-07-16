public class logical_operaor {
    public static void main(String arr[])
     {
         /* &AND   |OR  !NOT
           true is "1"  and  false is "0"
              for AND ---> a*b
              for OR ---> a+b
              for NOT ---> a=inverse of a 
          */

            int x=5;
            int y= 7;
            int a=10;
            int b=3;

             boolean result = x<y && a>b ;
             System.out.println(result);

               boolean result1 = x<y || a>b || a>1 ;
             System.out.println(result1);

               boolean result2 = x<y && a>b ;
             System.out.println(!result2);

     }
}
