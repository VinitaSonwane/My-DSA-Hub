import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;

public class DequeInterface {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.addFirst(1);
        deque.addLast(2);

        int first = deque.removeFirst();
        int last = deque.removeLast();

        System.out.println("First :" + first + ", Last :" + last);



        Deque<String> d1 = new ArrayDeque<String>();
        d1.add("apple");
        d1.addFirst("banana");
        d1.addLast("cherry");

        Iterator iterate = deque.iterator();
        while(iterate.hasNext()){
            System.out.println(((Iterator) d1).next() + " ");

        }
    }

}
