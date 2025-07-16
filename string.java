// String is used to store multiple characters together but char only canstore one single character 
// String is basically a class and the class string have some functions like charAt()  , concat()  etc etc 
// by creating object of String class we can perform different operatons 

public class string {
      public static void main(String args[])
      {
         String obj= new String(" Anusua");
         System.out.println(obj);
         System.out.println( obj.charAt(2));
         System.out.println(obj.concat(" Hello"));

         // but for user friendly we use the below way for string but rememver behind each String the class created 

          String name = "Monalisa";  // name object creates that is why we can use the functions of string class 
          System.out.println(name );
          System.out.println(name.concat(" Hello"));
           System.out.println(name + " Hii " );
      }
}
