

class student
{
    int roll;
    String name;
    int marks;
}




public class array_of_object
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

           for(int i=0 ; i< arr.length ; i++)
           {
            System.out.println (arr[i].name + ": " + arr[i].roll+ ": " + arr[i].marks);
           }
      }
    
}
