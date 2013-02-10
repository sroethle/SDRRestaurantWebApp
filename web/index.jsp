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
        <h1>Welcome to Roethle's Restaurant</h1>
        <form id="order" name="order" method="POST" action="RestaurantController" onsubmit="return validateItemSelected()">
            <p>Select the items that you would like to order!<p>
            <p>Appetizer:
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="appetizer" name="appetizer" size ="1">
                    <option value=""> Select An Item </option>
                    <option value="onionRings"> Onion Rings </option>
                    <option value="mozzarellaSticks">Mozzarella Sticks</option>
                    <option value="spinachArtichokeDip">Spinach & Artichoke Dip</option>
                    <option value="cheeseburgerSliders">Cheeseburger Sliders </option>
                </select>
            </p>
            <p>Main Course:
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="mainCourse" name="mainCourse" size ="1">
                    <option value=""> Select An Item </option>
                    <option value="steak"> Steak </option>
                    <option value="lobster">Lobster</option>
                    <option value="cheeseburger">Cheeseburger</option>
                    <option value="chickenSalad">Chicken Salad</option>
                </select>
            </p>
            <p>Drink:
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="drink" name="drink" size ="1">
                    <option value=""> Select An Item </option>
                    <option value="soda"> Soda </option>
                    <option value="beer">Beer</option>
                    <option value="wine">Wine</option>
                    <option value="tea">Tea</option>
                </select>
            </p>
            <p>Dessert:
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="desert" name="desert" size ="1">
                    <option value=""> Select An Item </option>
                    <option value="cake"> Cake </option>
                    <option value="brownie">Brownie</option>
                    <option value="ice cream">Ice Cream</option>
                    <option value="cookie">Cookie</option>
                </select>
            </p>
            

                <input id="itemSubmit" name="itemSubmit" type="submit" value="Place Order">

        </form> 
        
        <script type="text/javascript">
            function validateItemSelected()
            {
                var isValid = true;
                var appitizer=document.forms["order"]["appetizer"].value;
                var mainMenu=document.forms["order"]["mainCourse"].value;
                var drink=document.forms["order"]["drink"].value;
                var desert=document.forms["order"]["desert"].value;
                
                if (appitizer=="" && mainMenu=="" && drink=="" && desert==""){
                    isValid = false
                    alert("You must order at least one item!");
                }
                
                return isValid;
            }
            </script>
    </body>
</html>
