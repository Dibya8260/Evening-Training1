//import java.util.Scanner;
// public class basic2{
//     public static void main(String[] args) {
//    //  Scanner sc=new Scanner(System.in);
//      System.out.println("enter a number");
//      //int num=sc.nextInt();
//      for(int i=2;i<=100;i++){
//         boolean isPrime=true;
//         for(int j=2;j<=i/2;j++){
//             if(i%j==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(isPrime){
//             System.out.print(i+" ");
//         }

//      }   
//     }
// }



// import java.util.Scanner;
// public class basic2{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter a number");
//      int num=sc.nextInt();
//      boolean isPrime=true;
//      if(num<=1){
//         isPrime=false;
//      }
//      else{
//         for(int i=2;i<=num/2;i++){
//             if(num%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//      }
//      if(isPrime){
//         System.out.print("this is prime njmber");
//      }
//      else{
//         System.out.print("not prime");
//      }

//     }
// }

// public class basic2{
//     public static void main(String[] args) {
//      int sum=0;
//      for(int num=2;num<=100;num++){
//         boolean isPrime=true;
//         for(int i=2;i<=num/2;i++){
//             if(num%i==0){
//                 isPrime=false;
//             }
//         }
//         if(isPrime){
//             sum+=num;
//         }

//      }   
//      System.out.print("sum of the prime number between 1 to 100 is"+ " "+sum);
     
//     }
// }

//multipilcationof prime number
// public class basic2{
//     public static void main(String[] args) {
//      int mul=1;
//      for(int num=2;num<=100;num++){
//         boolean isPrime=true;
//         for(int i=2;i<=num/2;i++){
//             if(num%i==0){
//                 isPrime=false;
//             }
//         }
//         if(isPrime){
//             mul*=num;
//         }
//      } 
//      System.out.println("multiplication of prime number is"+" "+mul);  
//     }
// }

//check the armstrong number

// import java.util.Scanner;
// public class basic2{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter the number");
//      int num=sc.nextInt();
//      int original=num;
//      int sum=0;
//      int digits=String.valueOf(num).length();
//      while(num>0){
//         int digit=num%10;
//         sum+=Math.pow(digit,digits);
//         num/=10;

//      }if(num==original){
//         System.out.println(original+"is armstring");
//      }
//      else{
//         System.out.println(original+"not armstrong");
//      }
//     }
// }




// import java.util.Scanner;
// public class basic2{
// public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.print("enter  principal amount:");
//    float amount=sc.nextFloat();
//    System.out.print("enter  the time year:");
//    float year=sc.nextFloat();
//    System.out.print("enter  rate of interest:");
//    float rate=sc.nextFloat();
//    float interest=(amount*year*rate)/100;
//    System.out.println(interest);
   
    
// }
// }
//display all the armstrong in a given range

// import java.util.Scanner;
// public class basic2{
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the first number");
//       int start=sc.nextInt();
//       System.out.println("enter the ending number");
//       int end=sc.nextInt();
      
//       for(int num=start;num<=end;num++){
//          int original=num;
//          int sum=0;
//          int digits=String.valueOf(num).length();
         
//          int temp= num;
//          while(temp>0){
//             int digit=temp%10;
//             sum+=Math.pow(digit,digits);
//             temp/=10;


//          }
//          if(sum==original ){
//             System.out.print(original+" ");
//          }

//       }
      
       
//    }
// }


// import java.util.Scanner;
// public class basic2{
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the first number");
//     int first=sc.nextInt();  
//     System.out.println("enter the last number");
//     int last=sc.nextInt(); 
//     for(int i=first;i<=last;i++){
//       int sum=0;
//       int squre=i*i;
//       while(squre>0){
//          sum+=squre%10;
//          squre/=10;
//       }
//       if(sum==i){
//          System.out.print(i+" ");
//       }
//     } 
//    }
// }

// public class basic2{
//    public static void main(String[]args){
//       int first=0,second=1;
//       int n=10;
//       for(int i=1;i<=n;i++){
//          System.out.print(first+" ");
//          int temp=first+second;
//          first=second;
//          second=temp;

//       }
           
   
//  }
//  }

// public class basic2{
//    public static void main(String[]args){
//       int fact=1;
//     for(int i=1;i<=5;i++){
//       fact*=i;

//     }  
//     System.out.print(fact);
//    }
// }

// import java.util.Scanner;
// public class basic2{
//    public static void main(String[]args){
//       Scanner sc=new Scanner(System.in);
//       int totalsum=0;
      
//       System.out.println("enter the frst number");
//       int first =sc.nextInt();
//       System.out.println("enter the last number");
//       int last=sc.nextInt();
//       System.out.println("the armstrong number between "+first+"to"+last);
//       for(int i=first;i<=last;i++){
//          int sum=0,temp=i;
//          int digits=String.valueOf(i).length();
//          while(temp>0){
//             int digit=temp%10;
//             sum+=Math.pow(digit,digits);
//             temp/=10;
//          }
//          if(sum==i){
//             System.out.print(i+" ");
//              totalsum+=i;

//          }
//       }
//       System.out.println("\nthe um is"+" "+totalsum);
//    }
// }


// import java.util.Scanner;
// public class basic2{
//    public static void main(String[]args){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the length of the rectangale");
//       float a=sc.nextFloat();
//        System.out.println("enter the breagth of the rectangale");
//       float b=sc.nextFloat();
//       float perimeter=(a*b)/2f;
//       float area=a*b;
//       System.out.println(perimeter);
//       System.out.println(area);
      
      
//    }
// } 

 //sum of even number in a range
//  import java.util.Scanner;
//  public class basic2{
//    public static void main(String[]args){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the firt number");
//       int a=sc.nextInt();
//        System.out.println("enter the last number");
//       int b=sc.nextInt();
//       int sum=0;
//       for(int i=a;i<=b;i++){
         
//          if(i%2==0){
//             sum+=i;
//          System.out.print(i+" ");
//          }
//       }
//       System.out.println("\n"+sum+" ");
//    }
//  

//pallindrom
// import java.util.Scanner;
// public class basic2{
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter a number");
//     int num=sc.nextInt();
//     int original=num;
//     int reverse=0,reminder;
//     while(num!=0){
//       reminder=num%10;
//       reverse=reverse*10+reminder;
//       num/=10;

//     } 
//     if(original==reverse){
//       System.out.println("this ia an armstrong");
//     }  
//     else{
//       System.out.println("this is not an armstrong");
//     }
//    }
// }

// import java.util.Scanner;
// public class basic2{
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter a number");
//     int a=sc.nextInt();
//     int sum=0;
//     for(int i=1;i<=a/2;i++){
      
//       if(a%i==0){
//          sum+=i;

//       }
//     }  
//     if(sum==a){
//       System.out.println("this is a perfect number");
//     } 
//     else{
//       System.out.println("this is not perfect number");
//     }
//    }
// }

// import java.util.Scanner;
// public class basic2{
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);  
//     System.out.println("enter firsr number");
//     int first=sc.nextInt();
//     System.out.println("enter second number");
//     int last=sc.nextInt();
    
//     for(int i=first;i<=last;i++){
//       int sum=0;
//       for(int j=1;j<=i/2;j++){
//          if(i%j==0){
//             sum+=j;
            
//          }
         
//          }
//          if(sum==i && i!=0){
//       System.out.print(i+" ");
      
//     }
    
    
//     } 
   
//    }
// }

// import java.util.Scanner;
// public class basic2{
//    public static void main(String[]args){
//       Scanner sc=new Scanner(System.in);

//        System.out.println("enter the first number");
//       int first=sc.nextInt();
//        System.out.println("enter the last number");
//       int last=sc.nextInt();
//       for(int i=first;i<=last;i++){
//          int sum=0;
//          int squre=i*i;
//          int temp=squre;
//          while(temp!=0){
//             int r=temp%10;
//             sum+=r;
//             temp=temp/=10;
//          }
//          if(sum==i){
//             System.out.print(i+" ");
//          }
//       }
     
     

//    }
// }

// import java.util.Scanner;
// public class basic2{
//    public static void main(String[]args){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the first number");
//       int first=sc.nextInt();
//       System.out.println("enter the last number");
//       int last=sc.nextInt();
//       for(int i=first;i<=last;i++){
//          int squre=i*i;
//          String istr=String.valueOf(i);
//          String squrestr=String.valueOf(squre);
//          if(squrestr.endsWith(istr)){
//             System.out.print(i+" ");
//          }
//       }
//    }
// }

//disarium number
// import java.util.Scanner;
// public class basic2{
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in); 
//     System.out.println("enter the number");
//     int num=sc.nextInt();
//     int length=String.valueOf(num).length();
//     int temp=num,sum=0;
//     while(temp>0){
//         int digit=temp%10;
//         sum+=Math.pow(digit,length);
//         temp/=10;
//         length--;

//     }
//     if(sum==num){
//         System.out.println(num+"is disarium number");
//     }
//     else{
//         System.out.println("it is not a disarium number");
//     }

//     }
// }
// import java.util.Scanner;
// public class basic2{
//     public  static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int num=sc.nextInt();
//         int temp=num,sum=0;
//         while(temp>0){
//             int rem=temp%10;
//             int digits=String.valueOf(num).length();
//             sum+=Math.pow(rem,digits);
//             temp/=10;

//         }
//         if(sum==num){
//                 System.out.println(num +"is"+" "+"neon number");
//         }
//         else{
//             System.out.println("not a neon number");
//         }

//     }

// }