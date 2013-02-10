package Restaurant.model;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Scott Roethle
 */
public class RestaurantService {
    //(look up the current prices, add up the total bill, add tax and suggested tip). A summary of the order and the totals calculated should be displayed on a result page
    private IMenuItemDAO menuItemDatabase;
    private Map<String, Double> items;
    
    public RestaurantService(){
        menuItemDatabase = new MenuItemDAO();
        items = new <String, Double>HashMap();
    } 
    
    public void addItemToBill(String item){ 
        if (!item.equalsIgnoreCase("")){
            items.put(item, getPrice(item)); 
        }
    }
    public Map<String, Double> getItemsOrdered(){
        return items;
    } 

    public double getPrice(String item) {       
        return menuItemDatabase.getItemPrice(item);
    }
    
    public Map<String, Double> getBillTotals(){
        Map<String, Double> totals = new<String, Double> HashMap();
        double subtotal = roundTwoDecimals(calculateSubtotal());
        
        totals.put("Subtotal", roundTwoDecimals(subtotal));
        totals.put("Tax", (Double)roundTwoDecimals(getTax(subtotal)));
        totals.put("Tip", (Double)roundTwoDecimals(getSuggestedTip(subtotal)));
        totals.put("Total", (Double)roundTwoDecimals(getTotalBillAmount()));     
        
        return totals;    
    }
    
    private double getTotalBillAmount(){
        double subtotal = 0;
        double bill=0;
        
        subtotal = calculateSubtotal();
        
        bill = subtotal + getTax(subtotal) + getSuggestedTip(subtotal);        
        return Math.round(bill);
    }

    private double calculateSubtotal() {
        double bill = 0;

        for (Double value : items.values()) {
            bill = bill + value;
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
