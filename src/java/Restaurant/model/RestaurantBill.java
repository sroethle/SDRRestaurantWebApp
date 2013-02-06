package Restaurant.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Scott Roethle
 */
public class RestaurantBill {
    //(look up the current prices, add up the total bill, add tax and suggested tip). A summary of the order and the totals calculated should be displayed on a result page

    double totalBill;
    String itemName;
    Map<String, Double> items = new<String, Double> HashMap();
    
    
    public void addItemToBill(String item){      
        items.put(item, getPrice(item)); 
    }
    public Map<String, Double> getItems(){
        return items;
    } 

    public double getPrice(String item) {
        double price;

        if (item.equalsIgnoreCase("steak")) {
            price = 25;
        } else if (item.equalsIgnoreCase("lobster")) {
            price = 35;
        } else if (item.equalsIgnoreCase("beer")) {
            price = 5;
        } else if (item.equalsIgnoreCase("salad")) {
            price = 15;
        } else {
            price = 0;
        }

        return price;
    }
    
    public double getBillAmount(){
        double bill=0;

        for (Double value : items.values()) {
            bill = bill + value;
        }
        
        return bill;
    }

    public double getTax(double billAmount) {
        double tax;

        tax = billAmount * .10;
        return tax;
    }

    public double getSuggestedTip(double billAmount) {
        double tip;

        tip = billAmount * .15;

        return tip;
    }

}
