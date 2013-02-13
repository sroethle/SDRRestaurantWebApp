package Restaurant.model;

/**
 * MenuItem class that represents items found on the menu.  
 *
 * @author Scott Roethle
 */
public class MenuItem {
    
    private int itemNumber;
    private String itemName;
    private double itemPrice;

    /**
     * 
     * @return Integer that represents the menu item number.
     */
    public int getItemNumber() {
        return itemNumber;
    }

    /**
     * 
     * @param itemNumber integer identifier for a menu item
     */
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     *
     * @return the name of the menu item
     */
    public String getItemName() {
        return itemName;
    }

    /**
     *
     * @param itemName the name of the menu item
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     *
     * @return the price charged to a customer for the menu item
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     *
     * @param itemPrice the price charged to a customer for the menu item
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.itemNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MenuItem other = (MenuItem) obj;
        if (this.itemNumber != other.itemNumber) {
            return false;
        }
        return true;
    }  
}
