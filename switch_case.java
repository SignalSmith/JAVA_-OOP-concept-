public class switch_case {
    
     public static void main(String arr[])
    {
        int n= 2;

         switch(n)
         {
            case 1: 
            System.out.println("Monday");
            break;   // used to move out from the block switch if satisfies 

            case 2: 
            System.out.println("Tuesday");
            break;

            case 3: 
            System.out.println("Wednesday");
            break;

            case 4: 
            System.out.println("Thursday");
            break;

            case 5: 
            System.out.println("Friday");
            break;

            case 6: 
            System.out.println("Saturday");
            break;

            case 7: 
            System.out.println("Sunday");
            break;

            default : 
             System.out.println("enter a valid number ");
             break ; 
         }
    }
}
