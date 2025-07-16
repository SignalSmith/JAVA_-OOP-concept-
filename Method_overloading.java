//  method overloading in java :::  all the method names are same but parameters are different or 
//number of parameters may be same but data types should be different 

class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public double add (double n1,int n2)
    {
      return n1+n2;
    }

    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}

public class Method_overloading {

     public static void main(String arr[])
     {
        Calculator obj= new Calculator();
       double r= obj.add (3 ,2,5);
       System.out.println(r);
     }
    
}
