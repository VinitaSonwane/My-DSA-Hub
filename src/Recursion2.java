/*// Tower of Hanoi

public class Recursion2 {
public static void toweOfHanoi(int n , String src , String helper , String dest){
   if(n==1){
    System.out.println("transfer disk " + n + " from" +src+ " to" +dest);
    return;
   }


    toweOfHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk " + n + " from" +src+ " to" +dest);
    toweOfHanoi(n-1, helper, src, dest);
    return;
}
    public static void main(String[] args ){
     int n = 2;
     toweOfHanoi(n, " S", " H", " D");
    }
}*/

/*// print a string in reverse
class Recursion2{
    public static void printRev(String str , int idx){
     if(idx==0){
        System.out.println(str.charAt(idx));
        return;
     }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args){
    String str = "abcd";
   printRev(str, str.length()-1);
    }
}*/

/*//Print occurences of first and last element in string
class Recursion2{
    public static int first = -1;
    public static int last = -1 ;
    public static void findOccurence(String str , int idx , char element){
    if(idx == str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }

        char currChar = str.charAt(idx);
        if(currChar==element ){
            if(first == -1 ){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurence(str, idx+1, element);
    }
    public static void main(String[] args){
     String str = "abaacdaefaah";
     findOccurence(str, 0, 'a');
    }
}*/

// check the array is sorted
class Recursion2{
    public static boolean isSorted(int arr[] , int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx + 1]){
            //array is sorted till now
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int arr[] = { 1, 3 , 3};
        System.out.println(isSorted(arr, 0));
    }
}
