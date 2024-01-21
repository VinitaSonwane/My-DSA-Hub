import java.util.*;
   public class conditional {
        public static void main(String[]args){


   /*  int age = 16;
    if(age>=18){
        System.out.println("Vote , Drive ");

    }
    if(age>12 && age>=14){
        System.out.println("Mid");
    }
    else{
        System.out.println("Not Adult");
    }*/


            // PRINT THE LARGEST OF 2

   /*int A=1;
    int B =5;
    if(A>=B){
        System.out.println("A is largest of 2");
    }else{
        System.out.println("Bis largest of 2");
    }*/


   /*  //INCOME TAX CALCULATOR

    Scanner sc = new Scanner (System.in);
    int income = sc.nextInt();
    int tax;
    if(income < 500000){
          tax=0;

    }else if(income >= 500000 && income< 1000000){
        tax=(int)(income*0.2);

    }else{
        tax=(int)(income*0.3);
    }
    System.out.println("your tax is : " + tax); */

            // PRINT THE LARGEST
     /*int C=1 , B=3 , A=6;
     if((A>=B) && (A>=C)){
        System.out.println("LARGEST IS A ");
     }
     else if(B>=C){
        System.out.println("B");
     }else{
        System.out.println("C");
     }*/

            //TERNARY OPERATOR

    /* Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();

     //int number = 6789;

     String type = ((number==0)? "even":"odd");
    System.out.println(type);*/

            // CHECK IF THE STUDENT WIL PASS  OR FAIL

   /*  int marks = 31  ;
    String reportCard = (marks>=33) ? "pass":"fail";
    System.out.println(reportCard);*/

            //SWITCH STATEMENT

   /*  char ch = 'a';
    //int number = 2;
    switch(ch){


    //switch(number){
        /*case 'a' : System.out.println("samosa");
        break;
        case 'b': System.out.println("Burger");
        break;
        case 'c' : System.out.println("panipuri");
        default:System.out.println("Nothing ");
    }*/



            //CALCULATOR

            Scanner sc = new Scanner (System.in);
            System.out.println("enter a :");
            int a = sc.nextInt();
            System.out.println("enter b : ");
            int b = sc.nextInt();
            System.out.println("enter operator : ");
            char operator = sc.next().charAt(0);
            switch(operator){
                case '+' : System.out.println(a+b);
                    break;
                case '-' : System.out.println(a-b);
                    break;
                case '*' : System.out.println(a*b);
                    break;
                case '/' : System.out.println(a/b);
                    break;
                case '%' : System.out.println(a%b);
                    break ;
                default: System.out.println("nooo");
            }

        }
    }


