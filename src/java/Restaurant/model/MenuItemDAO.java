package Restaurant.model;

/**
 *
 * @author Scotty
 */
public class MenuItemDAO implements IMenuItemDAO {

    @Override
    public double getItemPrice(String item) {
        double price;

        if (item.equalsIgnoreCase("onionRings")) {
            price = 8.99;
        } else if (item.equalsIgnoreCase("mozzarellaSticks")) {
            price = 6.25;
        } else if (item.equalsIgnoreCase("spinachArtichokeDip")) {
            price = 7.50;
        } else if (item.equalsIgnoreCase("cheeseburgerSliders")) {
            price = 9.99;
        } else if (item.equalsIgnoreCase("steak")) {
            price = 20.24;
        } else if (item.equalsIgnoreCase("lobster")) {
            price = 35.24;
        } else if (item.equalsIgnoreCase("cheeseburger")) {
            price = 12.75;
        } else if (item.equalsIgnoreCase("chickenSalad")) {
            price = 10.00;
        } else if (item.equalsIgnoreCase("soda")) {
            price = 2.99;
        } else if (item.equalsIgnoreCase("beer")) {
            price = 5;
        } else if (item.equalsIgnoreCase("wine")) {
            price = 8;
        } else if (item.equalsIgnoreCase("tea")) {
            price = 4;
        } else if (item.equalsIgnoreCase("cake")) {
            price = 6.50;
        } else if (item.equalsIgnoreCase("brownie")) {
            price = 5;
        } else if (item.equalsIgnoreCase("iceCream")) {
            price = 4;
        } else if (item.equalsIgnoreCase("cookie")) {
            price = 3;
        } else {
            price = 0;
        }
        return price;
    }
}
