package Restaurant.controller;

import Restaurant.model.RestaurantBill;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Restaurant Controller that uses the model object to calculate the bill and
 * forwards to the resultView page.
 *
 * @author Scott Roethle
 */
@WebServlet(name = "RestaurantController", urlPatterns = {"/RestaurantController"})
public class RestaurantController extends HttpServlet {
    

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String destination = "/resultView.jsp";
       
        int appetizer = Integer.parseInt(request.getParameter("appetizer"));
        int mainCourse = Integer.parseInt(request.getParameter("mainCourse"));
        int drink = Integer.parseInt(request.getParameter("drink"));
        int desert = Integer.parseInt(request.getParameter("desert"));

        // Create a new instance of a model object
        RestaurantBill bill = new RestaurantBill();

        bill.addItemToBill(desert);
        bill.addItemToBill(mainCourse);
        bill.addItemToBill(appetizer);
        bill.addItemToBill(drink);

        request.setAttribute("items", bill.getItemsOrdered());
        request.setAttribute("totals", bill.getBillTotals());

        // This object lets you forward both the request and response
        // objects to a destination page
        RequestDispatcher view =
                request.getRequestDispatcher(destination);
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
