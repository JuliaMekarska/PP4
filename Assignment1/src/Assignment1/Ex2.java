package Assignment1;
import java.util.LinkedList;
public class Ex2 {
    public static void Fifo(){
        LinkedList<Integer> fifo = new LinkedList<Integer>();

        fifo.add(1);
        System.out.println(fifo);
        fifo.add(4);
        System.out.println(fifo);
        fifo.poll();
        System.out.println(fifo);
        fifo.add(2);
        System.out.println(fifo);
        fifo.poll();
        System.out.println(fifo);
        fifo.add(3);
        System.out.println(fifo);
        fifo.poll();
        System.out.println(fifo);
    }
}
