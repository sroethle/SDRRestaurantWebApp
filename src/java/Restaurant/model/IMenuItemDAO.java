package Restaurant.model;

/**
 * Strategy Pattern Interface that allows creation of 
 * different varieties of MenuItem DAO implementations.
 * 
 * @author Scott Roethle
 */
public interface IMenuItemDAO {

    public abstract double getItemPrice(int itemNumber);

    public abstract String getItemName(int itemNumber);
}
