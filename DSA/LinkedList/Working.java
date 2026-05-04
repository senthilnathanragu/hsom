import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.remove(1); // takes index, llly removeFirst, removeLast
        list.contains(20);
        list.indexOf(20); // index of first occor of the element
        list.size();
        var array = list.toArray();
        System.out.println(list);
    }
}
