import java.util.*;


public class MapInterface {
    public static void main(String[]args){
        Map<String,Integer> hm = new HashMap<>();

//put() method
        hm.put("one", 1);
        hm.put("two" , 2);
        hm.put("three" , 3);
        hm.put("four", 4);

        System.out.println("hm will be : "+hm);

//remove() method
        hm.remove("one");
        System.out.println(hm);

        hm.remove("four");
        System.out.println(hm);

//containsKey() method
        System.out.println("contain key :" + hm.containsKey("two"));

//containsValue
        System.out.println("contain key :" + hm.containsValue(2));


        hm.clear();
        System.out.println("clear: " +hm);

        System.out.println("contain key :" + hm.containsKey("two"));
    }

}
