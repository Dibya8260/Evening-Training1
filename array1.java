// public class array1{
//     public static void main(String[] args) {
//      int []arr={1,2,3,4,5};
//      int n=arr.length;
     
//      System.out.println("array traverse");
//      for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//      } 
//      System.out.println("\narray reverse"); 
//      for(int i=n-1;i>=0;i--){
//         System.out.print(arr[i]+" ");
//      }
     
//      int sum=0;
//      for(int i=0;i<n;i++){
//    sum+=arr[i];
//    // sum=sum+arr[i];
//     System.out.println("\nsum"+"is"+" "+sum);
//      }
//      System.out.println(sum);
//      System.out.println("\nlargest integer");
//      for(int i=1;i<n;i++){
//         int large=arr[0];
        
//         if(arr[i+1]>large){
//             large=arr[i+1];

//         }
//         System.out.println(large);

//      }
    

//     }
// }

// public class array1{
//     public static void main(String[] args) {
//      int []arr={1,2,3,4,5};
//      int n=arr.length;
//      int large=arr[0];
//      for(int i=1;i<n;i++){
//         if(arr[i]>large){
//             large=arr[i];
//         }
//         System.out.println(large);
//      } 
//      int small=arr[0];
//      for(int i=0;i<n;i++){
//         if(arr[i]<small){
//             small=arr[i];
//         }
//          System.out.println(small);
//      }  
//     }
// }

// public class array1{
//     public static void main(String[] args) {
//      int []arr={10,5,30,40,50};
//      int n=arr.length;
//      int j=0;
//      int []arr2=new int[n];
//      for(int i=n-1;i>=0;i--){
//         arr2[j]=arr[i];
//         j++;
//      }  
//      for(int i=0;i<n;i++){
//      System.out.println(arr2[i]); 
//     }
//     }
// }
// public class array1{
//     public static void main(String[] args) {
//      int []arr={10,5,30,40,50};
//      int n=arr.length;
//      int left=0;
//      int right=n-1;
//      int temp;
//      while(left<right){
//         temp=arr[left];
//         arr[left]=arr[right];
//         left++;
//         right--;
//      }
//      for(int i=0;i<n;i++){
//         System.out.println(arr[i]);
//      }


//     }

// }   

// public class array1{
//    public static void main(String[] args) {
//     int []arr={20,30,40,50,60};
//     int n=arr.length;
//     int flag=0;
//     int key=50;
//     for(int i=0;i<n;i++){
//       if(arr[i]==key){
//         System.out.println("element"+arr[i]+" "+"found at index"+" "+(i+1));
//          flag=1;
//          break;
//       }
//      // if(flag==1){
//       //   System.out.println("element"+arr[i]+" "+"found at index"+" "+(i+1));
//       //}
//       else{
//          System.out.println("not found");
//       }
//     }
//    }
// }

// public class array1{
//    public static void main(String[] args) {
//     int []arr={20,30,50,40,20,30,50,60};
//     int n=arr.length;
//    //  for(int i=0;i<n;i++){
//    //    System.out.print(arr[i]+" ");
//    //  }
//     for(int i=0;i<n;i++){
//       for(int j=i+1;j<n;j++){
//          if(arr[i]==arr[j]){
//             System.out.print(arr[i]+" ");
//             break;
//          }
//       }
//     }
    
//    }
// }
//addition of even and odd number in array
// public class array1{
//    public static void main(String[] args) {
//     int []arr={20,30,50,40,3,5,7,9,20,30,50,60};
//     int n=arr.length;
//     int evensum=0;
//     int oddsum=0;
//     for(int i=0;i<n;i++){
//      // System.out.print(arr[i]+" ");
//      if(arr[i]%2==0){
//       evensum=evensum+arr[i];
//       System.out.println("sumation is"+" "+evensum);
//      }
//      else{
//       oddsum=+arr[i];
//       System.out.println("odd sum is"+" "+oddsum);
//      }

//     }
//    }
// }

// public class array1{
//    public static void main(String[] args) {
//     int []arr={20,30,50,40,3,5,7,9,20,30,50,60};
//     int n=arr.length;
//     int key=30;
//     int count=0;
//     for(int i=0;i<n;i++){
//       if(arr[i]==key){
//          count++;
//        //  break;
//       }

//     }
//     System.out.println(key+" "+" "+count+" "+"in array");

//    }
//}
// // second largest element
// public class array1{
//    public static void main(String[] args) {
//     int []arr={20,30,50,40,3,5,7,9,20,30,50,60,100};
//     int n=arr.length;
//     int largest=arr[0];
//     int secondlargest=arr[0];
//     for(int i=0;i<n;i++){
//       if(arr[i]>largest){
//          secondlargest=largest;
//          largest=arr[i];
//       }
//       else if(arr[i]>secondlargest && arr[i]!=largest){
//          secondlargest=arr[i];

//       }


//     }
//     System.out.println(secondlargest);

//    }
// }

// public class array1{
//    public static void main(String[] args) {
//     int []arr={20,30,50,40,3,5,7,9,20,30,50,60,100};
//     int n=arr.length;
//     int largest=arr[0];
//     int secondlargest=arr[0];
//     int thirdlargset=arr[0];
//     int fourthlargest=arr[0];
//     for(int i=0;i<n;i++){
//       if(arr[i]>largest){
//          fourthlargest=thirdlargset;
//          thirdlargset=secondlargest;
//          secondlargest=largest;
//          largest=arr[i];
//       }
//       else if(arr[i]>secondlargest && arr[i]!=largest){
//          secondlargest=arr[i];

//       }
//       else if(arr[i]> thirdlargset && arr[i]!=secondlargest){
//          thirdlargset=arr[i];
//       }
//       else if(arr[i]>fourthlargest && arr[i]!=thirdlargset){
//           fourthlargest=arr[i];
//       }


//     }
//     System.out.println( "thord largsest is "+thirdlargset);
//     System.out.println("second lagrst id "+ secondlargest);
//     System.out.println("fourth lagrst id "+ fourthlargest);
//     System.out.println("largest is "+largest);
 
//    }
// }




// public class array1{
//    public static void main(String[] args) {
//     int arr[]={0,0,0,1,1,1,1,0,0,1,1,0,0}; 
//     int maxcount=0;
//     int count=0;
//     for(int i=1;i<arr.length;i++){
//       if(arr[i]==arr[i-1]){
//          count++;
//       }
//      else{
//       maxcount=Math.max(maxcount,count);
//       count=1;
//      }
//     } 
//     System.out.println(maxcount); 
//    }
// }



// public class array1{
//    public static void main(String[] args) {
//     int arr[]={1,2,3,4,5,6}; 
//      int temp;
//     for(int i=0;i<arr.length;i+=2){
//       //  int temp;
//       temp=arr[i];
   
//       arr[i]=arr[i+1];
//       arr[i+1]=temp;


//     }  
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//    }
// }