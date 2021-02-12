import java.util.Iterator;

public class WishListIterator implements Iterator{
    private Item[] items;
    private int position = 0;

    public WishListIterator(Item[] items)
    {
        this.items = items;
    }

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
