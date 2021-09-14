import java.util.*;

class Prime1 {
        public static int isPrime(int num) {
             int prime = 1;
             for (int i = 2; i < num; i++) {
                 if ((num % i) == 0) {
                     num = 0;
                 }
                 else{
                     num=1;
                 }
             }
             return num;
         }

         public static int nextPrime(int num) {
             num++;
             for (int i = 2; i < num; i++) {
                 if (num % i == 0) {
                     num++;
                     i = 2;
                 } else {
                     continue;
                 }
             }
             return num;
         }

         public static void main(String[] args) {
             // write your code here
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a number ::");
             int num = sc.nextInt();
             int result = 0;
            int prime = isPrime(num);
             if (prime == 1) {
                 System.out.println(num + " is a prime number");
             } else {
                 System.out.println(num + " is not a prime number");
             }
             System.out.println("Next prime number is: " + nextPrime(num));
         }
     }

