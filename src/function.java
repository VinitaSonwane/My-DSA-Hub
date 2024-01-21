import java.util.*;
public class function {
    /*public static void  printHelloWorld(){
 System.out.println("Hello World") ;
  System.out.println("Hello World") ;
   System.out.println("Hello World") ;
         return ;
    }
    public static int  calculateSum(int num1, int num2){
      int sum = num1 + num2;
      System.out.println("Sum : " + sum);
      return sum;
    }*/


    /*// swap the numbers
    public static void swap(int a , int b ){
      int temp = a;
      a = b;
      b = temp;
      System.out.println("a : " +a );
      System.out.println("b : " +b);

    }*/
    /*// product of two num
    public static int multiply(int a , int b){
      int product = a*b;
      return product;
    }*/


    // Factorial of number
    public static int factorial(int n ){
        int f = 1 ;
        for(int i=1 ; i <=n ; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args ){
     /*  printHelloWorld();      //function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);*/

        /*int a = 5;
        int b = 10;

       /*  //swap(a ,b);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b );
        System.out.println("a * b  : "+prod);*/

        System.out.println(factorial(4));   //factorial


    }

}
