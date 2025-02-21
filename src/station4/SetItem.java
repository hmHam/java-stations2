import java.util.ArrayList;

public class SetItem extends Item {
    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public String getName () {
        String returnName = name + "(";

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            returnName += item.getName();
            if (i != items.size() - 1) {
                returnName += ",";
            }
        }
        return returnName + ")";
    }
}
