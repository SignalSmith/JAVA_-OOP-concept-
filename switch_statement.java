public class switch_statement {
     public static void main(String arr[])
     {
        // without using break; 
        
         String day= "Tuesday";  
        String result ="";

         /* 
          switch(day)
          {
            case "saturday", "sunday" -> result = "10am"  ; // or we can write System.out.println("clock at 10am"); 

            case "monday", "Tuesday" -> result = "7am"  ;

            case "Thursday", "Friday" -> result ="8am"  ;

             default -> result ="6am" ;
          }
           System.out.println(result);   */
                       

             // another way  if not want to use -> 
           result =switch(day) 
           {
            case "saturday", "sunday": yield  "10am"  ;

            case "monday", "Tuesday" : yield  "7am"  ;

            case "Thursday", "Friday" : yield "8am"  ;

            default : yield "6am" ;
           };
           System.out.println(result); 
     }
}
