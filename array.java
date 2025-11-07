// public class array{
//     public static void main(String[]args){
//         int arr[]=new int[10];
//         arr[0]=10;
//         arr[1]=20;
//         arr[2]=30;
//         arr[3]=40;
//         arr[4]=50;
//         int n=5;
//         System.out.println("original array");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         //inseraation at begining
//         int value1=25;
//         for(int i=n;i>0;i--){
//             arr[i]=arr[i-1];
//         }
//         arr[0]=value1;
//         n++;
//         System.out.println("\nafter insertion at begining");
//         for(int i=0;i<=n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println("\ninsertion at the end");
//         int value2=80;
//         arr[n]=value2;
//         n++;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
            
//         }
//         //insertion at specific position
//         System.out.println("\ninsertion at specific position");
//          int k=4;
//          int value3=34;
//          for(int i=n;i>=k;i--){
//           arr[i]=arr[i-1];
//          }
//          arr[k-1]=value3;
//          n++;
//          for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//             }
            
            
//         System.out.println("\ninsertion at specific position at 7");
//           int value4=90;
//           int k2=7;
//           for(int i=n;i>=k2;i--){
//             arr[i]=arr[i-1];
//           } 
//           arr[k2-1]=value4;
//           n++;
//           for(int i=0;i<n;i++){
//               System.out.print(arr[i]+" ");
//           }
//             System.out.println("\ninset at 0 position "); 
//             int valu5=100;
//             for(int i=n;i<0;i--){
//                 arr[i]=arr[i-1];
//             }
//             arr[0]=valu5;
//                n++;
//                for (int i=0;i<n;i++) {
//                     System.out.print(arr[i]+" "); 
                   
//                }
//                  System.out.println("\ninsert at 9 th position ");
//                  int k5=9;
//                  int value9=900;
//                  for(int i=n;i>=k5;i--){
//                     arr[i]=arr[i-1];
//                  }
//                  arr[k5-1]=value9;
//                  n++;
//                  for(int i=0;i<n;i++){
//                       System.out.print(arr[i]+" ");
//                  }
                 
              
          

        
//     }
// }
// public class array{

//     public static void main(String[] args) {
//      int arr[]=new int[20];
//      arr[0]=18; 
//      arr[1]=17;   
//      arr[2]=16; 
//      arr[3]=15; 
//      arr[4]=14; 
//      arr[5]=13; 
//      arr[6]=12; 
//      arr[7]=10;
//      int n=8;
//       System.out.println("original array is");
//       for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//       }
//       System.out.println("\ninsert at biggining");
//       int value=90;
//       for(int i=n;i>0;i--){
//         arr[i]=arr[i-1];
//       }
//       arr[0]=value;
//       n++;
//       for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//       }
//       System.out.println("\ninsert at specific position");
//       int k=5;
//       int val1=200;
//       for(int i=n;i>=k;i--){
//         arr[i]=arr[i-1];
//       }
//       arr[k-1]=val1;
//       n++;
//       for (int i = 0; i < n; i++) {
//           System.out.print(arr[i]+" ");
          
//       }
//     }
// }

<<<<<<< HEAD
// public class array{
//     public static void main(String[]args){
//       int arr[]={10,20,30,40,50,60};
//       int n=6;
//       //delete at begining
//       for (int i=0;i<n;i++) {
//           System.out.print(arr[i]+" ");
//       }
//       System.out.println("\ndeletion at first");
//       for(int i=0;i<n-1;i++){
//         arr[i]=arr[i+1];
//       }
//       n--;
//       for(int i=0;i<n;i++){
//          System.out.print(arr[i]+" ");
//       }
//        System.out.println("\ndeletion at specific position ");;
//       int k=2;
//       for(int i=k-1;i<n-1;i++){
//         arr[i]=arr[i+1];
//       }
//       n--;
//       for(int i=0;i<n;i++){
//          System.out.print(arr[i]+" ");
//       }
//       System.out.println("\ndeletion at last");
//      for(int i=0;i<n;i++){
//         n--;
//      }
//      for(int i=0;i<n;i++){
//          System.out.print(arr[i]+" ");
//       }

//     }
// }
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
   

     
     

//    }
// }

//print only first row and last row element
//   public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("first row and last row");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          if(i==0 ||i==row-1){
//             System.out.print(arr[i][j]+" ");
//          }else{
//             System.out.print(" "+"ram");
//          }
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }


//display the first and last columns
// public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("first row and last row");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          if(j==0 || j==cols-1){
//             System.out.print(arr[i][j]+" ");
//          }else{
//             System.out.print(" "+"*"+" ");
//          }
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }


//print all the daigonal element
// public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("first row and last row");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          if(i==j){
//             System.out.print(arr[i][j]+" ");

   
//       }else{
//           System.out.print("x");
//       }
      

//      }
//       System.out.println();
   

//      }
     

//    }
// }


//print all the element below the daigonal
//  public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("first row and last row");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          if(i>j){
//             System.out.print(arr[i][j]+" ");
//          }else{
//             System.out.print(" "+"*");
//          }
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }


// public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("first row and last row");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          if(i<j){
//             System.out.print(arr[i][j]+" ");
//          }else{
//             System.out.print(""+"* ");
//          }
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }


//print non daigonal
// public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("first row and last row");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          if(i==j){
//             System.out.print("* ");
//          }
//          else{
//             System.out.print(arr[i][j]+" ");
//          }
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }


// public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("the matrix");
//      for(int i=0;i<row;i++){
//       int temp=arr[0][i] ;
//            arr[0][i]=arr[row-1][i];
//            arr[row-1][i]=temp;
//      }
//      for(int i=0;i<row;i++){
      
//       for(int j=0;j<cols;j++){
           
//            System.out.print(arr[i][j]+" ");    
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }

// public class array{
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int row=sc.nextInt();
//      System.out.println("enter the columns");
//      int cols=sc.nextInt();
//      int[][] arr=new int[row][cols];
//      System.out.println("enter elements");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
//          arr[i][j]=sc.nextInt();
//         // System.out.print(arr[i][j]);
//       }
//      }
//      System.out.println("displaying the element");
//      for(int i=0;i<row;i++){
//       for(int j=0;j<cols;j++){
         
//          System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//      }
//      System.out.println("the matrix");
//      for(int j=0;j<cols;j++){
//       int temp=arr[cols-1][j];
//       arr[cols-1][j]=arr[0][j];
//       arr[0][j]=temp;

//      }
//      for(int i=0;i<row;i++){
      
//       for(int j=0;j<cols;j++){
           
//            System.out.print(arr[i][j]+" ");    
        

//       }
//        System.out.println();

//      }
   

     
     

//    }
// }


public class array{
   public static void main(String[] args) {
       int n=5;
       int number=1;
       for(int i=0;i<n;i++){
         for(int j=0;j<=i;j++){
         System.out.print(number+" ");
         number++;
         }
         System.out.println();

       }
   }
=======
public class array{
    public static void main(String[]args){
      int arr[]={10,20,30,40,50,60};
      int n=6;
      //delete at begining
      for (int i=0;i<n;i++) {
          System.out.print(arr[i]+" ");
      }
      System.out.println("\ndeletion at first");
      for(int i=0;i<n-1;i++){
        arr[i]=arr[i+1];
      }
      n--;
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }
       System.out.println("\ndeletion at specific position ");;
      int k=2;
      for(int i=k-1;i<n-1;i++){
        arr[i]=arr[i+1];
      }
      n--;
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println("\ndeletion at last");
     for(int i=0;i<n;i++){
        n--;
     }
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }

    }
>>>>>>> 90feee5744c567efbb58d27481d3ad4d7a8c2331
}