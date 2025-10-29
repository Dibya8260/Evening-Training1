class multi extends Thread{
public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("child thread");
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException ie) {
            System.out.println("thread is executing");
        }
    }
}
}
// public class multi1{
// public static void main(String[]args)throws InterruptedException{
//     multi t1=new multi();
//     t1.start();
//     t1.join();
//     for(int i=0;i<=3;i++){
//         System.out.println("main thread");
//     }

// }
// }

// class A extends Thread{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getPriority());
//     }
// }
// public class multi1{
//     public static void main(String[]args){
//     A t1=new A();
//      A t2=new A();
//       A t3=new A();
//        t1.setName("thread 1");
//         t2.setName("thread 2");
//          t3.setName("thread 3");
//          t1.setPriority(2);
//          t2.setPriority(3);
//          t2.setPriority(4);

//          t1.start();
//          t2.start();
//          t3.start();
//     }
// }

// public class multi1{
//     public static void main(String[] args) {
//         try {
//             checkage(19);
//         } catch (ArithmeticException e) {
//             System.out.println("exception "+e.getMessage());

//         }
//     }
//     static void checkage(int age){
//       if(age<18){
//         throw new ArithmeticException("you are not older");
//       }
//       else{
//         System.out.println("you are older");
//       }
//     }


// }