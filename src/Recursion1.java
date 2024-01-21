/*//print numbers form 5to1

public class Recursion1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[]args){
        int n =5;
        printNum(n);  //n = 5
    }
    
}*/


/*// print the numbers from 1 to 5
class Recursion1{
public static void printNumber(int n){
 if(n==6){
    return ;
 }
    System.out.println(n);
    printNumber(n+1);
}
    public static void main(String[] args){
      int n = 1;
      printNumber(n);
    }
}*/

/*//print the sum of first n natural numbers 
import java.util.*;
class Recursion1{
    public static void printSum(int i , int n , int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return; //?
        }
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //printSum = sc.nextSum();
     printSum(1, 5, 0);
    }
}*/

/*//Print factorial of number n
public class Recursion1{
    public static int calfactorial(int n){
   if(n==1 || n==0){
    return 1 ;
   }
   int fact_nm1 = calfactorial(n-1);
   int fact_n = n * fact_nm1;
   return fact_n;
    }
 public static void main(String[] args){
  int n =5;
  int ans = calfactorial(n);
  System.out.println(ans);
 }
}*/

//print the fibonacci sequence till nth term
class Recursion1{
    public static void printFib(int a , int b , int n){
        if(n==0){
            return;
        }
        int c =  a + b ;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[]args){
        int a = 0 , b=1 ;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFib(a, b, n-2);
    }
}