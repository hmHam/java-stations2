import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Station8 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static HashSet<String> aggregateUserId(ArrayList<Order> orders) {
        // 問題1: ここから
        HashSet<String> set = new HashSet<String>();
        for (Order order : orders) {
            set.add(order.userId);
        }
        return set;
        // 問題1: ここまで
    }

    public static HashMap<String, Integer> aggregateUserAndTotalPrice(ArrayList<Order> orders) {
        // 問題2: ここから
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Order order : orders) {
            if (map.containsKey(order.userId)) {
                map.put(order.userId, map.get(order.userId) + order.totalPrice);
            } else {
                map.put(order.userId, order.totalPrice);
            }
        }
        return map;
        // 問題2: ここまで
    }
}
