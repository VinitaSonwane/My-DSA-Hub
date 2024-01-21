
import java.util.*;
public class BitManipulation {

    //Operators
   /*public static void main(String[] args){
      System.out.println((5 & 6));
      System.out.println((5 | 6));
      System.out.println((5 ^ 6));
      System.out.println((~5));
      System.out.println((5<<6));
      System.out.println((5>>6));
   }*/


    //check if the number is even or odd
    public static void oddOrEven(int n){
        int BitMask = 1;
        if((n & BitMask)==0){
            System.out.println("even numer");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static int getIthBit(int n , int i ){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }

    }
    public static int setIthBit(int n , int i ){
        int bitMask = 1<<i;
        return n | bitMask ;
    }
    public static int clearIthBit(int n , int i ){
      /*int bitMask = ~(1<<i);
      return n & bitMask;*/
        int BitMask= (~0)<<i;
        return n & BitMask;
    }

    public static int updateIthBit(int n , int i , int newBit){
      /*if(newBit==0){
         return clearIthBit(n, i);
      }
      else{
         return setIthBit(n, i);
      }*/

        n = clearIthBit(n,i);
        int BitMask = n<<i;
        return n | BitMask;
    }
    public static int clearIthBitsinRange(int n , int i , int j ){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    //Check if a number is power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    //Count Set Bits in a number
    public static int countSetBits(int n ){
        int count = 0 ;
        while(n>0){
            if((n&1) != 0){ //check our LSB
                count++;
            }
            n = n >>1;
        }
        return count ;

    }

    //Fast Exponentiation
    public static int fastExpo(int a, int n ){
        int ans = 1;
        while(n>0){
            if((n &1) != 0 ){ //check LSB
                ans = ans * a ;
            }
            a = a* a ;
            n = n >>1;
        }
        return ans ;
    }
    public static void main(String[] args){
        System.out.println(fastExpo(3 , 5));
        System.out.println(countSetBits(15));
        System.out.println(isPowerOfTwo(9));
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,4));
        System.out.println(clearIthBit(10 , 1));
        System.out.println(updateIthBit(10,2,1));
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);

        System.out.println(clearIthBit(15, 2));
        System.out.println(clearIthBitsinRange(2,4,6));


    }
}



