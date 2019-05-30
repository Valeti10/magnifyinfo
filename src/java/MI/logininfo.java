package MI;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logininfo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String userid=request.getParameter("userid");
        String password=request.getParameter("password");
        //out.println("userid:"+userid);
        ///out.println("password:"+password);
       MI.DAO d=new MI.DAO();
        String desig=d.loginCheck(userid, password);
        //out.println("desig"+desig);
        if(desig==null)
        { response.sendRedirect("index.jsp?info=invalid");
        }
        else if(desig.equalsIgnoreCase("user"))
            {
                HttpSession ses=request.getSession();
                ses.setAttribute("userid", userid);
                response.sendRedirect("UserHome.jsp");
            }
        else if(desig.equalsIgnoreCase("admin"))
            {
                HttpSession ses=request.getSession();
                ses.setAttribute("userid", userid);
                response.sendRedirect("AdminHome.jsp");
            }
        
                    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
