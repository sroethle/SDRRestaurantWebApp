<%-- 
    Document   : resultView
    Created on : Feb 3, 2013, 8:51:35 PM
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
        <%
            double totalBill = (Double)request.getAttribute("totalBill");
            double tax = (Double)request.getAttribute("tax");
            double tip = (Double)request.getAttribute("tip");
            String temp = (String)request.getAttribute("temp");
            Map<String, Double> items = (Map<String, Double>)request.getAttribute("items");

                for (String value : items.keySet()) {
                    out.println("<h2> Item: " + String.valueOf(value) + " </h2>");
                }
            
            out.println("<h2> The Bill is: " + String.valueOf(totalBill) + " </h2>");
            out.println("<h2> The total tax is: " + String.valueOf(tax) + " </h2>");
            out.println("<h2> The suggested tip is: " + String.valueOf(tip) + " </h2>");
            out.println("<h2> Temp: " + temp + " </h2>");
        %>
    </body>
</html>