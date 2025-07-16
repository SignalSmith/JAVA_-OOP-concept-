public class conversion {
     
     public static void main(String arr[])
     {
         byte b= 127 ; // range from -128 to 127 
         int n= 588;    // range higher than byte 
         n=b;   //  implicit conversion               b (127)  is storing in b possible but b=n not possible 
         b= (byte)n; //casting (expiticit conversion called casting) 

         float f=5.6f;
         int num= (int) f;
         System.out.println(num);  // after  point values looses here 0.6 will not show only op 5 

          int a = 12;
          byte by=(byte) a;  // type casting :::: without typecasting byte can not store int as size exceeds 
          System.out.println(by);

           byte b1 = 10;
           byte b2= 30;
           int out =b1 * b2 ;  // type promotions no error though op exceeds byte range 300>128
           System.out.println(out);
      }
}
