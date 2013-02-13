package Restaurant.model;

/**
 * Strategy Pattern Interface that allows creation of 
 * different varieties of MenuItem DAO implementations.
 * 
 * @author Scott Roethle
 */
public interface IMenuItemDAO {

    /**
     * Returns the price of the menu item.
     * 
     * @param itemNumber
     * @return price of the menu item
     */
    public abstract double getItemPrice(int itemNumber);

    /**
     * Returns the item name that corresponds to the item number.
     * @param itemNumber  integer value for item number
     * @return The String name that corresponds to an item number.
     */
    public abstract String getItemName(int itemNumber);
}
