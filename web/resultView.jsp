<%-- 
    Document   : resultView
    Created on : Feb 3, 2013, 8:51:35 PM
    Author     : Scott Roethle
--%>

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
            Map<String, Double> items = (Map<String, Double>) request.getAttribute("items");
            Map<String, Double> totals = (Map<String, Double>) request.getAttribute("totals");

            for (Map.Entry entry : items.entrySet()) {
                if (!entry.getKey().equals("none")){
                    out.println("<p> Sale Item: " + entry.getKey() + " - $" + entry.getValue() + " </p>");
                }
            }
            out.println("<p> -------------------- <p>");
                    
            for (Map.Entry entry : totals.entrySet()) {
                out.println("<p> " + entry.getKey() + " - $" + entry.getValue() + " </p>");
            }
        %>
    </body>
</html>