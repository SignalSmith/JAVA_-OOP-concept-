   // Mutable string ----> changeable
   // Immutable String ----> Unchangeable // by default all the strings are innutable 
   //StringBuffer ----> used to change Immutable string 

public class typeof_string {
    
      public static void main(String args[])
      {
         String name= " Anusua ";  
          name += " Hello ";  // Though the name variable is is updated but the name "Ansuua" always be there not changed 
           System.out.println(name);

            String obj1= " Monalisa ";  // remember here not two object forms only one object is there as obj1==obj2 
            String obj2= " Monalisa "; 
             System.out.println(obj1==obj2);   // to check that the two objects are samme or not we got the ans true 

      }
}
