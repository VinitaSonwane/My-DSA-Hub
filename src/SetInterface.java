import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {
    public static void main(String[]args){

        Set<String> hash_set = new HashSet<String>();
        hash_set.add("geek");
        hash_set.add("for");
        hash_set.add("geeks");

        /*System.out.println(hash_set.contains("geeks"));
        System.out.println(hash_set.remove("for"));
        System.out.println(hash_set);*/



        Iterator value = hash_set.iterator();
        System.out.println("Nothing");
        while (value.hasNext()) {
            System.out.println(value.next());

        }

        Set<String> hash_set2 = new HashSet<String>();
        hash_set2.add("vins");
        hash_set2.add("chaitu");
        hash_set2.add("nachi");
        System.out.println(hash_set2);

        hash_set.addAll(hash_set2);
        System.out.println(hash_set);

        hash_set.clear();
        System.out.println(hash_set);


        //containsAll() Method
        System.out.println(hash_set.containsAll(hash_set2));

        //hashCode() method
        System.out.println(hash_set2.hashCode());

        //retainAll()
        Set<Integer> s = new HashSet<Integer>();
        s.add(90);
        s.add(30);
        s.add(40);
/*Set<Integer> s2 = new HashSet<Integer>();
        s2.add(70);
        s2.add(50);
        s2.add(20);
        System.out.println(s2);
        s.retainAll(s2);*/

        Object []arr = s.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}


