package Restaurant.model;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Service class that provides necessary calculations for the Restaurant Bill.
 * @author Scott Roethle
 * @version 1.0
 */
public class RestaurantBill {
    private IMenuItemDAO menuItemDatabase;
    private Set <MenuItem>items;
    private MenuItem item;
    private final double TAX_RATE = .10;
    private final double TIP_RATE = .15;
     
    /**
     * Default constructor that instantiates the class items.
     */
    public RestaurantBill(){
        menuItemDatabase = new MenuItemFakeDatabaseDAO();
        items = new HashSet<MenuItem>();
    } 
    
    /**
     * Adds an item to the Bill
     * @param itemNumber Corresponds to a item number in a database
     */
    public void addItemToBill(int itemNumber) {
        
        if (itemNumber != 0) {
            item = new MenuItem();
            item.setItemNumber(itemNumber);
            item.setItemName(menuItemDatabase.getItemName(itemNumber));
            item.setItemPrice(menuItemDatabase.getItemPrice(itemNumber));
            
            items.add(item);
        }
    }
    
    /**
     * Returns a set of MenuItems
     * 
     * @return a Set of MenuItems
     */
    public Set<MenuItem> getItemsOrdered(){
        return items;
    } 
    
    /**
     * Gets the Restaurant bill totals.
     * 
     * @return Map of different totals for a bill.
     */
    public Map<String, Double> getBillTotals(){
        Map<String, Double> totals = new<String, Double> HashMap();
        double subtotal = roundTwoDecimals(calculateSubtotal());
        
        totals.put("Subtotal", roundTwoDecimals(subtotal));
        totals.put("Tax", roundTwoDecimals(getTax()));
        totals.put("Tip", roundTwoDecimals(getSuggestedTip()));
        totals.put("Total", roundTwoDecimals(calculateTotalBillAmount()));     
        
        return totals;    
    }
    
    private double calculateTotalBillAmount(){
        
        return calculateSubtotal() + getTax() + getSuggestedTip();
    }

    private double calculateSubtotal() {
        double bill = 0;
        
        for (MenuItem i : items){
            bill += i.getItemPrice();
        }
        return bill;
    }

    private double getTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    private double getSuggestedTip() {
        return calculateSubtotal() * TIP_RATE;
    }
    
    private double roundTwoDecimals(double d) { 
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(d));
    }
}
