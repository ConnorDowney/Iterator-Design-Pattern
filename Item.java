/**
 * An Item
 * @author Connor Downey
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Creates an Item
     * @param title Name of the item
     * @param description Description of the item
     * @param price Price of the item
     */
    public Item(String title, String description, double price)
    {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Creates a string of the title, description, and price
     * @return The string of the title, description, and price
     */
    public String toString()
    {
        return "\n***** "+title+" *****\n"+description+"\nPrice: $"+price;
    }

    /**
     * Gets the price of the item
     * @return The price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Prints out the item's toString()
     */
    public void print()
    {
        System.out.println(toString());
    }
}
