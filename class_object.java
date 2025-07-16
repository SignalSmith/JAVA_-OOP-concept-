
 class Calculator   // new class 
{
      public int add(int n1,int n2)
      {
        int r = n1+n2;
        System.out.println(r);
        return 0;
      }
}


public class class_object {
    
       public static void main(String arr[])
       {
         int num1=5;
         int num2=4;
          Calculator cal=new Calculator();   // OBJECT CREATION cal : ::: non primitive datatype Calculator &&& new keyword dynamically allocating memory 
          cal.add(num1,num2);   // obj.function name with parameters if needed 
          
       }
}
