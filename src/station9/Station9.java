import java.util.ArrayList;
import java.util.Random;

public class Station9 {

    public static String printOrder(ArrayList<Item> itemList, Random random) {
        // ここから
        Integer totalPrice = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(" ");
        for (Item item : itemList) {
            sb1.insert(0, item.name);
            sb1.append(item.price);
            sb1.append("円");
            System.out.println(sb1.toString());
            sb1.append(System.lineSeparator());
            sb2.append(sb1.toString());
            sb1.delete(0, sb1.length());
            sb1.append(" ");
            totalPrice += item.price;
        }
        sb1.insert(0, "合計");
        sb1.append(totalPrice);
        sb1.append("円");
        sb1.append(System.lineSeparator());
        sb2.append(sb1.toString());
        System.out.println(sb1.toString());
        sb1.delete(0, sb1.length());       
        Integer diceNum = random.nextInt(100);
        if (diceNum % 50 == 0) {
            sb1.append("1等: 全額キャッシュバック");
            System.out.println(sb1.toString());
            sb2.append(sb1.toString());
        } else if (diceNum % 10 == 0) {
            sb1.append("2等: 10%キャッシュバック");
            System.out.println(sb1.toString());
            sb2.append(sb1.toString());
        }
        return sb2.toString();
        // ここまで
    }
}
