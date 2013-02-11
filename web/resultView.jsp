<%-- 
    Document   : resultView
    Created on : Feb 3, 2013, 8:51:35 PM
    Author     : Scott Roethle
    Description: This page displays the bill for the customer.
--%>

<%@page import="java.util.HashSet"%>
<%@page import="Restaurant.model.MenuItem"%>
<%@page import="Restaurant.model.RestaurantService"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Receipt Page</title>
    </head>
    <body>
        <h2>Thank you for dining at Roethle's Restaurant!</h2>
        <%
            Map<String, Double> totals = (Map<String, Double>) request.getAttribute("totals");
            Set <MenuItem>items = (HashSet<MenuItem>)request.getAttribute("items");
            
            for (MenuItem i : items){
                out.println("<p> Sale Item: " + i.getItemName() + " - $" + i.getItemPrice() + " </p>");
            }

            out.println("<p> -------------------- <p>");
                    
            for (Map.Entry entry : totals.entrySet()) {
                out.println("<p> " + entry.getKey() + " - $" + entry.getValue() + " </p>");
            }
        %>
    </body>
</html>