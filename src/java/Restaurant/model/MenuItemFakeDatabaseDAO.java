package Restaurant.model;

/**
 * Data Access Object (DAO) for Menu item information. This class provides
 * Menu item specific database access.
 * 
 * @author Scott Roethle
 * @version 1.0
 */
public class MenuItemFakeDatabaseDAO implements IMenuItemDAO {
    
    @Override
    public double getItemPrice(int itemNumber) {
        double price;
        switch (itemNumber) {
            case 1:
                price = 8.99;
                break;
            case 2:
                price = 6.25;
                break;
            case 3:
                price = 7.50;
                break;
            case 4:
                price = 9.99;
                break;
            case 5:
                price = 20.24;
                break;
            case 6:
                price = 35.24;
                break;
            case 7:
                price = 12.75;
                break;
            case 8:
                price = 10.00;
                break;
            case 9:
                price = 2.99;
                break;
            case 10:
                price = 5.00;
                break;
            case 11:
                price = 8.00;
                break;
            case 12:
                price = 4.00;
                break;
            case 13:
                price = 6.50;
                break;
            case 14:
                price = 5;
                break;
            case 15:
                price = 4;
                break;
            case 16:
                price = 3;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
        
    @Override
      public String getItemName(int itemNumber) {
        String name;
        switch (itemNumber) {
            case 1:
                name = "Onion Rings";
                break;
            case 2:
                name = "Mozzarella Sticks";
                break;
            case 3:
                name = "Spinach Artichoke Dip";
                break;
            case 4:
                name = "Cheeseburger Sliders";
                break;
            case 5:
                name = "Steak";
                break;
            case 6:
                name = "Lobster";
                break;
            case 7:
                name = "Cheeseburger";
                break;
            case 8:
                name = "Chicken Salad";
                break;
            case 9:
                name = "Soda";
                break;
            case 10:
                name = "Beer";
                break;
            case 11:
                name = "Wine";
                break;
            case 12:
                name = "Tea";
                break;
            case 13:
                name = "Cake";
                break;
            case 14:
                name = "Brownie";
                break;
            case 15:
                name = "Ice Cream";
                break;
            case 16:
                name = "Cookie";
                break;
            default:
                name = "";
                break;
        }

        return name;

    } 
}
