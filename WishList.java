/**
 * A WishList
 * @author Connor Downey
 */
public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;
    static final int MAX_ITEMS = 5;

    /**
     * Creates a WishList
     * @param name The name of the wishlist
     */
    public WishList(String name)
    {
        items = new Item[MAX_ITEMS];
        this.name = name;
    }

    /**
     * Takes in an item's attributes and adds them to the Item array
     * @param title Name of the item
     * @param description Description of the item
     * @param price Price of the item
     */
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

    /**
     * Creates a new WishListIterator with the array of Items
     * @return The new WishListIterator
     */
    public WishListIterator createIterator()
    {
        return new WishListIterator(items);
    }

    /**
     * Adds up the total cost of all items
     * @return The total cost of all items
     */
    public double getTotalCost()
    {
        double temp = 0;
        for(int i=0;i<items.length;i++)
        {
            temp += items[i].getPrice();
        }
        return temp;
    }

    /**
     * Doubles the size of the array
     * @param items Array of items
     * @return The new array of items doubled
     */
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