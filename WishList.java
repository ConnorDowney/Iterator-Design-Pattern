public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;
    static final int MAX_ITEMS = 5;

    public WishList(String name)
    {
        items = new Item[MAX_ITEMS];
        this.name = name;
    }

    public void addItem(String title, String description, double price)
    {
        Item item = new Item(title, description, price);
        if(count >= items.length)
        {
           growArray(items);
        }
        items[count] = item;
        count++;
    }

    public WishListIterator createIterator()
    {
        return new WishListIterator(items);
    }

    public double getTotalCost()
    {
        double temp = 0;
        for(int i=0;i<items.length;i++)
        {
            temp += items[i].getPrice();
        }
        return temp;
    }

    private Item[] growArray(Item[] items)
    {
        Item[] temp = new Item[2*items.length];
        for(int i=0;i<items.length;i++)
        {
            temp[i] = items[i];
        }
        items = temp;
        return items;
    }
}