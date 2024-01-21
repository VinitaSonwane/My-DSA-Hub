import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.LinkedList;

public class QueueInterface{
    public static void main(String[] args) {
        /*Queue<String> queue = new LinkedList<>();

        //Add() element 
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        System.out.println(queue);

        System.out.println("here is the peek queue  " +queue.peek());

        System.out.println("here is the poll queue  "+queue.poll());

        System.out.println("here is the peek queue  " +queue.peek());

        //remove() element 
       queue.remove("banana");
       System.out.println("the queue will be : " +queue);



       //Iterate()
       Iterator iterator = queue.iterator();
       while(iterator.hasNext()){
        System.out.print(iterator.next() +" ");
       }*/

   /*  Queue<String> q1 = new PriorityQueue<>();
    q1.add("vins");
    q1.add("chaitu");
    q1.add("nachi");

    /*System.out.println(q1.peek());
    System.out.println(q1.poll());
    System.out.println(q1.peek());

    System.out.println(q1.size());

    
   Spliterator<String> spt = q1.spliterator(); 
   System.out.println(q1);

   Object []arr = q1.toArray();
   System.out.println("the array is ");
   for(int i=0;i<arr.length;i++){
    System.out.print(" " + arr[i]);
   }*/


        //ArrayBlockingQueue
        int Capacity =5;
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(Capacity);
        abq.add(2);
        abq.add(3);
        abq.add(4);

        System.out.println(abq);    // add
        System.out.println(abq.peek());   //peek
        abq.remove(2);             //remove
        System.out.println(abq);

        ArrayBlockingQueue<Integer> abq2 = new ArrayBlockingQueue<Integer>(Capacity);
        abq2.add(10);
        abq2.add(20);
        abq.add(30);

        Object[] arr = new Object[2];       //toArray
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //spiltrator
        Spliterator<Integer> spliterator = abq.spliterator();
        System.out.println("spliterator is : " + abq);

        //take() method
        try{
            int head = abq.take();
        }catch(InterruptedException e){}
        System.out.println(abq);
    }

}