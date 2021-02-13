import java.util.Iterator;

/**
 * A WishListIterator
 * @author Connor Downey
 */
public class WishListIterator implements Iterator{
    private Item[] items;
    private int position = 0;

    /**
     * Creates a WishListIterator
     * @param items Array of items
     */
    public WishListIterator(Item[] items)
    {
        this.items = items;
    }

    /**
     * Checks to see if the position is null or not
     * @return True or false depending on if it is null
     */
    public boolean hasNext()
    {
        if(position >= items.length || items[position] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Iterates to the next position if the next position is not null
     * @return The next Item
     */
    public Item next()
    {
        if(hasNext())
        {
            position++;
            return items[position-1];
        }
        else
        {
            return null;
        }
    }
}
