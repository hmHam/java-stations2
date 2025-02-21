import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 
        // System.out.println(q1("Tech", "Train"));
        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Tech");
        // list.add("Train");
        // list.add("Railway");
        // ArrayList<String> searchWords = new ArrayList<String>();
        // searchWords.add("Railway");
        // searchWords.add("Tech");
        // searchWords.add("Station");
        // System.out.println(q2(list, searchWords));
    }

    public static ArrayList<String> q1() {
        // co
        ArrayList<String> list = new ArrayList<String>();
        list.add("Tech");
        list.add("Train");
        return list;
        // 
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 
        int count = 0;
        for (String a: list) {
            for (String b: searchWords) {
                // System.out.print(a + " " + b);
                // System.out.println(a==b);
                if (a == b) {
                    count += 1;
                }
            }
        }
        return count;
        //
    }
}
