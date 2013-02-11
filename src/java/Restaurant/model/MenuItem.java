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

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

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
