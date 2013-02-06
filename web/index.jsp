<%-- 
    Document   : index
    Created on : Feb 3, 2013, 8:02:23 PM
    Author     : Scotty
--%>

<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Restaurant Order</h1>
        <form id="form1" name="form1" method="POST" action="RestaurantController">
            <p>Select menu item<p>
            <p>Item:
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="item" name="item" size ="1">
                    <option value="steak"> steak </option>
                    <option value="lobster">lobster</option>
                    <option value="beer">beer</option>
                    <option value="salad">salad</option>
                </select>
            </p>
            <center>
                <input id="itemSubmit" name="itemSubmit" type="submit" value="Add Item">
                <input id="calcBill" name="calcBill" type="submit" value="Calculate Bill">
            </center>
        </form>
        <%
            //Object objItem = request.getAttribute("items");
            Map<String, Double> items = (Map<String, Double>) request.getAttribute("items");
            if (items != null) {
                for (String value : items.keySet()) {
                    out.println("<h2> Item Ordered: " + String.valueOf(value) + " </h2>");
                }
            }
        %>

                <form id="calculateBill" name="calculateBill" method="POST" action="RestaurantController">
            <center>
                <input id="calcBill" name="calcBill" type="submit" value="Calculate Bill">
            </center>
        </form>
        
        
    </body>
</html>
