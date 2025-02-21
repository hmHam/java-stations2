import java.util.ArrayList;

class SetItem implements Item {
    String name = null;

    ArrayList<SingleItem> items = new ArrayList<SingleItem>();

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
