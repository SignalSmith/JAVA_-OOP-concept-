public class literals {
     
    public static void main(String a[])
    {
        double p = 0b101;
        System.out.println(p);

        //hex numbers 
           int op = 0x7E;
        System.out.println(op);

          // for users to distunguish multiple zeroes 
          int num=100_00_0;
          System.out.println(num);

          double n2 = 12e10; // e to the power 10 
          System.out.println(n2);

          // integers can not be converted to boolean 

          char c = 'a';
          c++;
         System.out.println(c);
    }
}
