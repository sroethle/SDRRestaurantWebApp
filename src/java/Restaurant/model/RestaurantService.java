package Restaurant.model;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Service class that provides necessary calculations for the Restaurant Bill.
 * @author Scott Roethle
 */
public class RestaurantService {
    private IMenuItemDAO menuItemDatabase;
    private Set <MenuItem>items;
    private MenuItem item;
     
    public RestaurantService(){
        menuItemDatabase = new MenuItemFakeDatabaseDAO();
        items = new HashSet<MenuItem>();
    } 
    
    public void addItemToBill(int itemNumber) {
        
        if (itemNumber != 0) {
            item = new MenuItem();
            item.setItemNumber(itemNumber);
            item.setItemName(menuItemDatabase.getItemName(itemNumber));
            item.setItemPrice(menuItemDatabase.getItemPrice(itemNumber));
            
            items.add(item);
        }
    }
    
    public Set<MenuItem> getItemsOrdered(){
        return items;
    } 
    
    public Map<String, Double> getBillTotals(){
        Map<String, Double> totals = new<String, Double> HashMap();
        double subtotal = roundTwoDecimals(calculateSubtotal());
        
        totals.put("Subtotal", roundTwoDecimals(subtotal));
        totals.put("Tax", (Double)roundTwoDecimals(getTax(subtotal)));
        totals.put("Tip", (Double)roundTwoDecimals(getSuggestedTip(subtotal)));
        totals.put("Total", (Double)roundTwoDecimals(calculateTotalBillAmount()));     
        
        return totals;    
    }
    
    private double calculateTotalBillAmount(){
        double subtotal;
        double bill;
        
        subtotal = calculateSubtotal();
        bill = subtotal + getTax(subtotal) + getSuggestedTip(subtotal);  
        
        return roundTwoDecimals(bill);
    }

    private double calculateSubtotal() {
        double bill = 0;
        
        for (MenuItem i : items){
            bill += i.getItemPrice();
        }

        return bill;
    }

    private double getTax(double billAmount) {
        double tax;

        tax = billAmount * .10;
        return tax;
    }

    private double getSuggestedTip(double billAmount) {
        double tip;

        tip = billAmount * .15;

        return tip;
    }
    
    private double roundTwoDecimals(double d) { 
        DecimalFormat twoDForm = new DecimalFormat("#.##");        
        return Double.valueOf(twoDForm.format(d));
    }
}
