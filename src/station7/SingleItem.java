interface Item {
    public String getName();
}

class SingleItem implements Item {
    String name = null;

    @Override
    public String getName() {
        return name;
    }
}
