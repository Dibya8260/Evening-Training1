//     public static void main(String[] args) {
//      System.out.println("hello world");   
//     }
// }

//multiplication of two float number
// import java.util.Scanner;
// public class basic{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number");
//         float a=sc.nextFloat();
//         System.out.println("enter the second number");
//         float b=sc.nextFloat();
//         float c=a*b;
//         System.out.println(c);
        
        
//     }
// }

//swap two number
// import java.util.Scanner;
// public class basic{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the first number");
//      int a=sc.nextInt();
//      System.out.println("enter the second number");
//      int b=sc.nextInt();
//      System.out.println("before swap:a="+a+" "+"b="+b);
     
//      int temp=a;
//      a=b;
//      b=temp;
//      System.out.println("after swap a:="+a +" "+"b="+b);


//     }
// }

//find the largest among 3 number
// import java.util.Scanner;
// public class basic{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter first number");
//      int a=sc.nextInt();
//      System.out.println("enter second number");
//      int b=sc.nextInt();
//      System.out.println("enter third number");
//      int c=sc.nextInt();
//      if(a>b & a>c){
//         System.out.println("a is the largest number");
//      }
//      else if(b>c & b>a){
//         System.out.println("b is the largest number");

//      }
//      else{
//         System.out.println("c is the largest number");
//      }

//     }
// }

//

//find the lcm of two number
// import java.util.Scanner;
// public class basic{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the first number");
//         int A=sc.nextInt();
        
//         System.out.println("enter the second number");
//         int B=sc.nextInt();
//         int max=(A>B)? A:B;        
        
//         int lcm=max;
        
        
//         while (true) { 
            

//             if(lcm %A==0 && lcm %B==0){
//                 break;
//             }
//             lcm++;
            
//         }
//         System.out.println(lcm);

//     }
// }

//find the gcd or hcf of two number

// import java .util.Scanner;
// public class basic{
//     public static int gcd(int a,int b){
//         if(b==0){
//             return a;
//         }
//         return gcd(b ,a%b);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the first number");
//         int num1=sc.nextInt();
//          System.out.println("enter the first number");
//         int num2=sc.nextInt();
//         int result=gcd(num1,num2);
//         System.out.println("gcd of num1 and num2 is:"+result);
        
//     }
// }

//display all the prime number from1 to 100
// public class basic{
//     public static void main(String[] args) {
//      System.out.println("prime number between 1 and 100 are");
//      for(int num=2;num<=1000; num++){
//         boolean isPrime=true;
//         //check the divissibility
//         for(int i=2;i<=Math.sqrt(num);i++){
//             if(num%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(isPrime){
//             System.out.print(num+" ");
//         }

//      }   
//     }
// }

// import java.util.Scanner;
// public class basic{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the year");
//         int year=sc.nextInt();
        
//         if(year%4==0||year%400==0 && year%100!=0){
//             System.out.println("this is a leap year");
//         }
//         else  {
//             System.out.println("this is not a leap year");
            
//         }
//     }
// }

//check the number is a neon number or not

// import java.util.Scanner;
// public class basic{
//     public  static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number");
//         int num=sc.nextInt();
//         int square=num*num;
//         int sum=0;
//         //find the sum of digit of square
//         while(square>0){
//             sum+=square%10;
//             square/=10;
//         }
//         //compare the sum is equal to original number
//         if(sum==num){
//             System.out.println("the number is neon number");
//         }
//         else{
//             System.out.println("not a neon number");
//         }

//     }
// }


// public class basic{
//     public static void main(String[] args) {
//      System.out.println("enter the neon number betwee 1 to 1000");
//      for(int num=1;num<=2000;num++){
//         int square=num*num;
//         int sum=0;
//         int temp=square;
//         while(temp>0){
//             sum+=temp%10;
//             temp/=10;
//         }
//         if(sum==num){
//             System.out.println(num);
//         }
//      }   
//     }
// }

//check the character is vowel or consonant
// import java.util.Scanner;
// public class basic{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter a charactrt");
//      char ch=sc.next().charAt(0);   
//      if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){
//         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//             System.out.println("this ia vowel ");

//         }
//         else{
//             System.out.println("this is consonant");
//         }
//      } 
//      else{
//         System.out.println("this is a invalid syntax");
//      }


//     }
// }

//find the factorial of a number
//import java.util.Scanner;
// public class basic{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number");
//         int num=sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=num;i++){
//             fact*=i;

//         }
//         System.out.println("factorial of"+num+"is"+" "+fact);
        
//     }
// } 
// public class basic{
//     public  static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number");
//         int num =sc.nextInt();
//         int fact=1;
//         for(int i=num;i>=1;i--){
//             fact*=i;
//         }
//         System.out.println("enter the factorial is"+" "+fact+" ");

//     }
// }

// public class basic{
//     public static void main(String[] args) {
//      int n=10;
//      int first=0,second=1;
//      System.out.println("fibonacci seriesnup to"+n+"terms");
//      for(int i=1;i<=n;i++){
//         System.out.print(first+" ");
//         int next=first+second;
//         first=second;
//         second=next;

//      }   
//     }
// }

// public class basic{
//     public static void main(String[]args){

// int first=0,second=1;
// System.out.println("the fibonacci number is less than 10");
// while(first<10){
//     System.out.print(first+" ");
//     int next=first+second;
//     first=second;
//     second=next;
// }
// first=0;
// second=1;
// System.out.println("\neven fibonacci numbers less than 10");
// while(first<10){
//     if(first%2==0){
//         System.out.print(first+" ");
//     }
//     int next=first+second;
//     first=second;
//     second=next;
// }

//  }
// }


//fibonacci series

// import java.util.Scanner;
// public class basic{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner (System.in);
//      System.out.println("enter a number");
//      int num=sc.nextInt();
//      int first=0,second=1;
//      System.out.println("enter the fibonacci serier under the n number");
//      while(first<num){
//         System.out.print(first+" ");
//         int next=first+second;
//         first=second;
//         second=next;
//      }
    
//      first=0;
//      second=1;
//      System.out.print("\nenter the even number of fibonacci series");
//      while(first<num){
//         if(first%2==0){
//             System.out.print(first+" ");
//         }
//         int next=first+second;
//         first=second;
//         second=next;
//      }

//     }
// }
// import java.util.Scanner;
// public class basic{
//    public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter a number");
//     int number=sc.nextInt();
//     System.out.println("the fibonacci series are ..");
//     int first=0;
//     int second=1;
//     while(first<number){
//         System.out.print(first+" ");
//         int next=first+second;
//         first=second;
//         second=next;
//     }
//     first=0;
//     second=1;
//     System.out.print("\nthe odd fibonacci number are");
//     while(first<number){
//         if(first%2!=0){
//             System.out.print("\n"+first+" ");
//         }
//             int next=first+second;
//             first=second;
//             second=next;
        
//     }
//    }
// }

// public class basic{
//     public static void main(String[] args) {
//      System.out.println("prime number between 1 and 100 are");
//      for(int num=2;num<=1000; num++){
//         boolean isPrime=true;
//         //check the divissibility
//         for(int i=2;i<=Math.sqrt(num);i++){
//             if(num%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(isPrime){
//             System.out.print(num+" ");
//         }

//      }   
//     }
// }

