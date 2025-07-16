

class student
{
    int roll;
    String name;
    int marks;
}

public class enhanched_for_loop
 {
     
      public static void main(String args[])
      {
         student s1= new student();
         s1.roll=1;
         s1.name= "Anusua";
         s1.marks= 88;

         student s2= new student();
         s2.roll=2;
         s2.name= "Moulisha";
         s2.marks= 85;

         student s3= new student();
         s3.roll=1;
         s3.name= "Mousumi";
         s3.marks= 90;
          
          student arr[] = new student[3]; // "arr[]"" is the object of class "student" 

          arr[0]=s1;
          arr[1]=s2;
          arr[2]=s3;

           for(student n : arr)  // here student is the type  : : : : n is loop control variable :  : : arr provide the length 
           {
                  System.out.println(n.name + " " + n.roll + " " + n.marks  );
           }  
      }
    
}

//   syntax of enhanced for loop ---->  for(student n : arr)
