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
}