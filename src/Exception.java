public class Exception {
    public static void main(String[] args){
        try{
    int a = 5;
    int b = 0;
    int c = a / b ;
    System.out.println(c);
        } catch(ArithmeticException e ){
            System.out.println(e.getMessage()+"Occured");
        }catch(ArrayIndexOutOfBoundsException e ){
        System.out.println("Sixe is outof bound");
        }
        catch(IllegalArgumentException e ){
            System.out.println("check type casting is correct ");
        }
        System.out.println("hello");
}
}

/*//throw and throws
public class Exception{
    public static void main(String[] args){
        fun1();
    }
    static void fun1(){


        int a = 5;
        int b = 3 ;
        int c = a / b ;
        System.out.println(c);

        boolean isDanger =  true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("danger was coming");
        }
    }
}*/


