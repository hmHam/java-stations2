import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Station10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(4567);
        list.add(89012);
        list.add(345678);
        list.add(9012345);
        q1(list);
    }

    public static void q1(ArrayList<Integer> list) {
        // ここから
        Integer maxVal = Collections.max(list);
        Integer maxDigit = maxVal.toString().length();
        for (Integer i : list) {
            System.out.println(String.format("%," + ((maxDigit / 3) + maxDigit) + "d", i));
        }
        // ここまで
    }
}
