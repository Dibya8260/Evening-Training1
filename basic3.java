// public class basic3{
//     public static void main(String[] args) {
//      for(int i=1;i<=6;i++){
//         for(int j=1;j<=6;j++){
//             for(int k=1;k<=6;k++){
//                 int number=i*100+j*10+k;
//                 System.out.print(number+" ");
//             }
//         }
//      }   
//     }
// }

// import java.util.Scanner;
// public class basic3{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the first number");
//      int a=sc.nextInt();   
//      System.out.println("enter the second number");
//      int b=sc.nextInt(); 
//      System.out.println("enter the third number");
//      int c=sc.nextInt(); 
//      System.out.println("enter 's' for sum and 'p' for product ");
//      char choice=sc.next().charAt(0);
//      if(choice=='s'||choice=='S'){
//         int sum=a+b+c;
//         System.out.println(sum);
//      }
//        else if(choice=='p'||choice=='P'){
//             int product=a*b*c;
//             System.out.println(product);
//         }
//         else{
//             System.out.println("invalid character");
//         }
         
//     }
// }

import java.util.Scanner;
public class basic3{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the first number");
     int a=sc.nextInt();
     System.out.println("enter the first number");
     int b=sc.nextInt();
     System.out.println("enter the character '+','-','*','/'  ");
     char op=sc.next().charAt(0);
     double result;
     switch(op){
        case'+':
        result=a+b;
        System.out.println(result);
        break;
        case '-':
         result=a-b;
         System.out.println(result);
        break;
        case '*':
         result=a*b;
         System.out.println(result);
        break;
        case'/':
        result=a/b;
        System.out.println(result);
        break;   

     }

    }
} 