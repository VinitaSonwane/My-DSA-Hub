import java.util.List;
import java.util.ArrayList;
class ListInterface{
    public static void main(String[] args){
//List<Integer> l1 = new ArrayList<Integer>();
// l1.add(1);
// l1.add(2);


        //System.out.println(l1);



/* List<Integer> l2 = new ArrayList<Integer>();
 l2.add(3);
 l2.add(4);
 System.out.println(l2);

  l1.addAll(2,l2);
System.out.println(l1);

l1.remove(1);
System.out.println(l1);

System.out.println(l1.get(2));

l1.set(2,5);
System.out.println(l1);*/


// indexOf() Method
        List<Integer> l1 = new ArrayList<Integer>();
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(1));

//get()method
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        int element = l1.get(2);
        System.out.println("the element at index 2 is "+element);


//size() method
        int size = l1.size();
        System.out.println("size of an element is  :" + size);

//clear() method
/*l1.clear();
System.out.println(l1);*/

/*List<Integer> l2 = new ArrayList<Integer> ();
l2.add(100);
l2.add(200);
l2.add(400);


//Equal() method
if(l1.equals(l2)){
    System.out.println("Equal");
}
else{
    System.out.println("Not Equal");
}

//hashCode() method
int hash = l1.hashCode();
System.out.println(hash);*/


//containAll()

        List<String> lll = new ArrayList<String> ();
        lll.add("vins");
        lll.add("chaituu");
        System.out.println(lll);

        List<String> lil = new ArrayList<String> ();
        lil.add("geek");
        lil.add("gfg");
        System.out.println(lll.containsAll(lil));

    }
}
