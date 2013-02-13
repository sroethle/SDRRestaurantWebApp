<%-- 
    Document   : index
    Created on : Feb 3, 2013, 8:02:23 PM
    Author     : Scott Roethle
    Description: This page is the main page for a restaurant ording system.  It
                 obtains the ordering items from the user.
--%>

<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function validateItemSelected()
            {
                var isValid = true;
                var appitizer=document.forms["order"]["appetizer"].value;
                var mainMenu=document.forms["order"]["mainCourse"].value;
                var drink=document.forms["order"]["drink"].value;
                var desert=document.forms["order"]["desert"].value;
                        
                if (appitizer=="0" && mainMenu=="0" && drink=="" && desert=="0"){
                    isValid = false
                    alert("You must order at least one item!");
                }
                        
                return isValid;
            }
        </script>
    </head>
    <body>
        <h1>Welcome to Roethle's Restaurant</h1>
        <form id="order" name="order" method="POST" action="RestaurantController" onsubmit="return validateItemSelected()">
            <p>Select the items that you would like to order!<p>
            <p>Appetizer:
                <!-- the name attribute is set to 'appetizer' which is the
                     parameter to be retrieved by the servlet -->
                <select id="appetizer" name="appetizer" size ="1">
                    <option value="0"> Select An Item </option>
                    <option value="1"> Onion Rings </option>
                    <option value="2">Mozzarella Sticks</option>
                    <option value="3">Spinach & Artichoke Dip</option>
                    <option value="4">Cheeseburger Sliders </option>
                </select>
            </p>
            <p>Main Course:
                <!-- the name attribute is set to 'mainCourse' which is the
                     parameter to be retrieved by the servlet -->
                <select id="mainCourse" name="mainCourse" size ="1">
                    <option value="0"> Select An Item </option>
                    <option value="5"> Steak </option>
                    <option value="6">Lobster</option>
                    <option value="7">Cheeseburger</option>
                    <option value="8">Chicken Salad</option>
                </select>
            </p>
            <p>Drink:
                <!-- the name attribute is set to 'drink' which is the
                     parameter to be retrieved by the servlet -->
                <select id="drink" name="drink" size ="1">
                    <option value="0"> Select An Item </option>
                    <option value="9"> Soda </option>
                    <option value="10">Beer</option>
                    <option value="11">Wine</option>
                    <option value="12">Tea</option>
                </select>
            </p>
            <p>Dessert:
                <!-- the name attribute is set to 'desert' which is the
                     parameter to be retrieved by the servlet -->
                <select id="desert" name="desert" size ="1">
                    <option value="0"> Select An Item </option>
                    <option value="13"> Cake </option>
                    <option value="14">Brownie</option>
                    <option value="15">Ice Cream</option>
                    <option value="16">Cookie</option>
                </select>
            </p>
                
            <input id="itemSubmit" name="itemSubmit" type="submit" value="Place Order">
        </form> 
    </body>
</html>
