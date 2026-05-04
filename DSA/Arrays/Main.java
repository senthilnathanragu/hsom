import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(100));

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.remove(0); // index
        numbers2.indexOf(20); // lastIndexOf
        numbers2.contains(20);
        numbers2.size();
        numbers2.toArray();
    }
}
