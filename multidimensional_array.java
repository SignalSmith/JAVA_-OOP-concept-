// Multi dimensional array means array of array 
// int arr[][]= new int[3][4]   means 3 fifferent arrays and each array having 4 elemnts  

public class multidimensional_array 
{
    

     public static void main(String args[])
     {
     int arr[][]= new int[3][4] ;   // 3 rows and 4 columns 
     
     
     
     for (int i=0;i<3 ;i++) 
      {
        for (int j=0;j<4;j++)
        {
           arr[i][j]= (int) (Math.random() *10);   // math.random() is a inbuilt fun in java which provide random values in 0.1 or 0.2 like this 
        }
        
    }
     
     
     // PRINTING THE ARRAY 
      for (int i=0;i<3 ;i++) 
      {
        for (int j=0;j<4;j++)
        {
              System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
      
    }
}
