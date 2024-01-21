public class Pattern2 {
   /*  public static void hollow_rectangle(int totRows , int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            //inner - columns
            for(int j=1; j<=totCols; j++){
                //cell - (i,j)
                if(i == 1 || i ==totRows || j == 1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        hollow_rectangle(4 , 5);
    }*/

   /* //PRINT INVERTED STAR PATTERN
    public static void main(String[]args){
        int n = 4;
        for(int line = 1 ; line <=n ;line ++){
            for(int star = 1 ; star <= n-line+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

   /*  //PRINT PYRAMID PATTERN
   public static void main(String[]args){
     int n = 4;
     for(int line =1 ;line<=n ; line ++){
        for(int number = 1;number <= line ; number ++){
            System.out.print(number);
        }
        System.out.println();
     }
}*/



/*//PRINT CHARACTER PATTERN
public static void main(String[]args){
    char ch = 'A';
    int n = 4;
     for(int line =1 ;line<=n ; line ++){
        for(int character= 1;character <= line ; character ++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
     }
}*/

/*//PRINT INVERTED ROTATED HALF PYRAMID
public static void inverted_rotated_half_pyramid(int n){
    for(int i =1 ;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
public static void main(String[]args){
    inverted_rotated_half_pyramid(4);
}*/


/*// FLOYDS TRIANGLE
public static void main(String[]args){

    int num = 1;
    int n =5;
    for(int line = 1 ; line <= n ;line ++){
        for(int number = 1 ; number<=line;number++){
            System.out.print(" " + num);
            num++;
        }
        System.out.println();
    }
}*/

/*//0 - 1 TRIANGLE
public static void main(String[]args){
    int n = 5 ;
    for(int i = 1; i<=n ; i++){
        for(int j=1 ; j<=i ; j++){
            if((i+j) % 2==0){       //even
                System.out.print("1");
            } else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}*/


/*// butterfly pattern

public static void  butterfly_pattern(int n){


     n = 4;
    for(int i = 1 ;i <= n ;i ++){

        //spaces
        for(int j = i ; j<=(2*(n-i));j++){
            System.out.print(" ");
        }
        for(int j = i ; j<=n;j++){
            System.out.print("*");
        }
         System.out.println();
            }
        }

public static void main(String[]args){
    butterfly_pattern(5);

}*/

/*//  solid Rhombus
public static void solid_rhombus(int n){
    for(int i=1 ; i<=n ; i++){

        // spaces
        for(int j = 1 ; j<=(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1 ; j <= n ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[]args){
    solid_rhombus(7);
}*/








/*// hollow rhombus
public static void hollow_rhombus(int n){
    n = 5;
for(int i = 1 ; i <=n ; i++){
    for(int j =1 ; j<=(n-i) ; j++){
       System.out.print(" ");
    }
       for(int j=1;j<=n;j++){
        if(i ==1 || i==n || j==1 || j==n){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
       }
       System.out.println();
}

}*/

/*//  Diamond

public static void diamond(int n){
    for(int i = 1 ; i<= n ; i++){
        //spaces
        for(int j =1 ; j<=(n-i); j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1 ; j <= (2*i)-1 ; j++){
            System.out.print("*");
        }
        System.out.println();

    }
    for(int i = n ; i>=1 ; i--){
        //spaces
        for(int j =1 ; j<=(n-i); j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1 ; j <= (2*i)-1 ; j++){
            System.out.print("*");
        }
        System.out.println();

    }
}






public static void main(String[]args){
    //solid_rhombus(7);
    //hollow_rhombus(5);
    diamond(7);
}*/


/*// Solid Rectangle
public static void main(String[]args){


for(int i =1;i<=4;i++){
 for(int j = 1; j<=5;j++){
    System.out.print("*");
 }
 System.out.println();

}
}*/

/*// Hollow rectangle
public static void main(String [] args ){
    int n = 4;
    int m = 5 ;
    for(int i = 1; i<=n;i++){

        for(int j = 1; j<=m;j++){
            if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}*/

/*// HALF PYRAMID
public static void main(String [] args ){
    int n = 4;

    for(int i = n; i>=1;i--){

        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/


/*// INVERTED HALF PYRAMID
public static void main(String [] args ){
    int n = 4;

    for(int i = 1; i<=n;i++){

        for( int j = 1 ; j<=(n-i) ; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/

/*// PRINT THE NUMBERS pattern

public static void main(String [] args ){
    int n= 5 ;

    for(int i = 1 ; i<=n ; i++){

        for(int j = 1 ; j<=i ; j++){
             System.out.print(j + "  ");
        }
       System.out.println();
    }

}*/

/*// print the inverted pattern numbers
public static void main(String [] args ){
    int n= 5 ;

    for(int i = n ; i>=1 ; i--){

        for(int j = 1 ; j<=i ; j++){
             System.out.print(j + "  ");
        }
       System.out.println();
    }

}*/


/*// Floyds triangle

public static void main(String[]args){
    int n=5;
    int number = 1;
    for(int i= 1 ; i<=n;i++){
        for(int j = 1 ; j<=i ; j++){
            System.out.print(number + " ");
             number++;
        }
        System.out.println();
    }
}*/

/*// 0 - 1 triangle
public static void main(String [] args ){
    int n = 5 ;
    //outer loop
    for(int i =1;i<=n;i++){
          // innner loop
          for(int j = 1 ; j<=i ; j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
          }
          System.out.println();
    }
}*/


/*// BUTTERFLY PATTERN
public static void main(String [] args ){
    int n = 5 ;
    //upper half
    for(int i = 1; i<=n ; i++){
        //1st part
        for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for(int j = 1 ; j<=spaces ; j++){
            System.out.print(" ");
        }
        // 2nd part star
        for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // lower half
    for(int i = n; i>=1 ; i--){
        //1st part
        for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for(int j = 1 ; j<=spaces ; j++){
            System.out.print(" ");
        }
        // 2nd part star
        for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/

/*//solid rhombus
public static void main(String[]args){
    int n = 5 ;

    for(int i=1 ; i<=n ; i++){

        // spaces
        for(int j = 1 ; j<=(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1 ; j <= n ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/

/*// number pyramid

public static void main (String[]args){
    int n = 5 ;
    for(int i = 1 ;i <=n ; i++){
        for(int j=1 ; j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j =1 ; j<=i;j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}*/

// Palindrome pattern

    public static void main (String[]args){
        int n = 5 ;
        for(int i = 1 ;i <=n ; i++){
            //spaces
            for(int j=1 ; j<=n-i ;j++){
                System.out.print(" ");
            }
            //1st half numbers
            for(int j =i; j>=1;j--){
                System.out.print(j+" ");
            }

            //2nd half
            for(int j =1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println( );
    }
}



