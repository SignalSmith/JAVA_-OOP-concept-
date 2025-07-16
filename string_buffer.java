// StringBuffer is also a class like String which is changeable 

public class string_buffer {
    public static void main(String args[])
    {
        StringBuffer name = new StringBuffer("Anusua");
        System.out.println(name.capacity());  // it will always provide extra 16 spaces to change here total capacity 16+6 =22
            System.out.println(name.charAt(0));
        
        System.out.println(name.deleteCharAt(2));
         
        System.out.println(name.insert(1, "i"));

         

    }
}
