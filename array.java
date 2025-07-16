

// if we want to store multiple values in a one single variable then array is required 

public class array {
    
     public static void main(String args[])
     {
        /*int arr[]= new int [4];
        arr[0]=5;
        arr[1]=7;
        arr[2]=3;
        arr[3]=4; */
         
         int arr[]={9,3, 4, 8 };     //anyone way is possible 

         for(int i=0;i<=3 ;i++)
         {
            System.out.println(arr[i]);
         }
     }
}

// DRAWBACKS OF ARRAY : : : 
// 1) the size of array is fixed but if we want to increase the size we can copy the array but this is not efficient 
// 2) we can not able to store values having different data type 
// 3) For searching and insertion values it take more time 
// 4) The solution is use "collection"
