// public class pattern{
//     public static void main(String[]args){
//         for(int i=1;i<=4;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the row");
//      int i=sc.nextInt();
//      System.out.println("enter the column");
//      int j=sc.nextInt();
//      for(int x=1;x<=i;x++){
//         for(int y=1;y<=x;y++){
//         System.out.print("* ");
//      } 
//      System.out.println(" ");
//      }  
//     }
// }

// public class pattern{
//     public static void main(String[]args){
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print("*    ");
//             }
//             System.out.println("");
//         }
//     }
// }

// public class pattern{
//     public static void main(String[]args){
//         for(int i=1;i<=5;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*    ");
//             }
//             System.out.println(" ");
//         }
//          for(int i=1;i<=5;i++){
//             for(int j=5-1;j>=i;j--){
//                 System.out.print("*     ");
//             }
//             System.out.println("");
//         }
//     }
// }


// public class pattern{
//     public static void main(String[]args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       


//     }
// }

// public class pattern{
//     public static void main(String[] args) {
//         int n=5;
//      for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("");
//         }
//         for(int k=1;k<=i;k++){
//             System.out.print(" *");
//         }
//         System.out.println();
//      }   
//     }
// }
// public class pattern{
//     public static void main(String[]args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
       


//     }
//  }
// public class pattern{
//     public static void main(String[]args){
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=i;j>=n-i;j--){
//                 System.out.print("");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(j==1||i==1||j==n||i==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print("");
//                 }
                
//         }
//         System.out.println();

//     }
//     }
// }

public class pattern{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("");
            }
        for(int j=1;j<=2*i-1;j++){
            if(j==1||j==2*i-1||i==n){
                System.out.print("* ");
                
            }
            else{
                System.out.print("");
            }

        }
        System.out.println();
        }
    }
}