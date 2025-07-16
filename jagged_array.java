// in jagged array we have the rows fixed but columns are vary menas eg: arr[3][]  here total 3 rows or arrays but size of each array are different 

public class jagged_array {

     public static void main(String args[])
     {
      
      int arr[][]= new int[3][];  // 3 rows or 3 arrays are there having diff size 
      arr[0]= new int[4];  // for the 1st array having 4 elements or size is 4 
      arr[1]= new int[3];  // for the 1st array having 4 elements or size is 3
      arr[2]= new int[2];  // for the 1st array having 4 elements or size is 2

        for(int i=0; i< arr.length; i++)  // arr.length shows the no of rows
        {
             for ( int j=0 ; j<arr[i].length; j++)   // arr[i].length --> for every row the size 
             {
                arr[i][j]= (int) (Math.random() *10)  ;  // defining values for each array 
             }
        }

         // printing the array 

         for(int i=0; i< arr.length; i++)  // arr.length shows the no of rows
        {
             for (int j=0 ; j<arr[i].length; j++)   // arr[i].length --> for every row the size 
             {
               System.out.print(arr[i][j] + " ");
             }
              System.out.println();
        }
    }

}
