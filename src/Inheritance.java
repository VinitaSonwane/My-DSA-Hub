
class shape{
    public void area(){
        System.out.println("Are displayed");
    }
    class Triangle extends shape{
        public void area(int h , int b){
            System.out.println("area of triangle : " + 1/2*b*h);
        }
        class Circle extends shape{
            public void area(int r ){
                System.out.println(3.14*r*r);
            }
        }
    }
}
public class Inheritance{
    public static void main(String[]args){

    }
}
