public class nestedwhile_loop {
    // i is loop control variable
     public static void main(String arr[])
     {
         int i=1;
        while(i<=5)
        {
            System.out.println("Hi" + i);
            int j=1;
             while(j<=3)
             {
                System.out.println("Hello" + j);
                j++;
             }
            i++;
        }
         System.out.println("Bye" + i);
}
}
