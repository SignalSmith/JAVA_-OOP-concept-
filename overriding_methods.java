/*in method overridingcc----> all the methods in different classes having the same name, same return type
 and methods in child class overrides the method in parent class
 */



class Calc
{
     public int sum(int n1, int n2)
     {
        return n1+n2;
     }
}

 class AdvCalc extends Calc
 {
     public int sum(int n1, int n2)       // overrides the sum method in class Calc
    {
        return n1+n2+1;
    }
 } 

public class overriding_methods {
         public static void main(String args [])
         {
             AdvCalc obj = new AdvCalc();
            int result=  obj.sum(4,5);
            System.out.println(result);
         }    
}
