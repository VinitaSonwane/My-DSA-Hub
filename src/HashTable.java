import java.util.Hashtable;

public class HashTable{
    public static void main(String[] args ){
        Hashtable<String,Integer> ht1 = new Hashtable<>();
        ht1.put("one" , 1);
        ht1.put("two" , 2);
        ht1.put("three" , 3);

        System.out.println("hashtable will be : " + ht1);
        System.out.println("hashtable : " + ht1.toString());
        System.out.println("hashtable : " + ht1.get("two"));
        System.out.println("hashtable : " + ht1.isEmpty());

    }
}