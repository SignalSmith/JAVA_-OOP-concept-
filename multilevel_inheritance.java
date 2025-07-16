

class Calc
{
     public int sum(int n1, int n2)
     {
        return n1+n2;
     }

      public int sub(int n1, int n2)
      {
        return n1-n2;
      }
}

class AdvCalc extends Calc    // chuild 1  // inherits from Calc
{
    public int mul(int n1, int n2)
     {
        return n1*n2;
     }

      public int div(int n1, int n2)
      {
        return n1/n2;
      }
}

class VeryAdvCalc extends AdvCalc // child 2 // inherits from AdvCalc
{
    public int mul(int n1, int n2)
     {
        return n1*n2;
     }

      public int div(int n1, int n2)
      {
        return n1/n2;
      }
}

class FastCalc extends VeryAdvCalc  // child 3  // inherits from VeryAdvCalc
{
    public double result(int n1, int n2)
    {
     return Math.pow(n1,n2);
    }
}



public class multilevel_inheritance {
    public static void main(String args[])
    {
       FastCalc obj = new FastCalc();
       int r1 = obj.sum(4,5);
       int r2 = obj.sub(10,6);
       int r3 = obj.mul(4,6);
       int r4 = obj.div(10,5);
       double r5 = obj.result(5,5);
       System.out.println( r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " );
    }
}
// *****  JAVA does not support Multiple inheritance 
// In multiple inheritance one single child inherits from multiple parent class 
