package MI;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Register extends HttpServlet 
{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String name=request.getParameter("name");
            String gender=request.getParameter("gender");
            String address=request.getParameter("address");
            String pincode=request.getParameter("pincode");
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String phone=request.getParameter("phone");
            
            String salary=request.getParameter("salary");
            String occupation=request.getParameter("occupation");
            String email=request.getParameter("email");
            String dob=request.getParameter("dob");
            String age=request.getParameter("age");
            String designation="user";
            
           /*out.println("name:"+name);
            out.println("gender:"+gender);
            out.println("address:"+address);
            out.println("pincode:"+pincode);
            out.println("username:"+username);
            out.println("password:"+password);
            out.println("phone:"+phone);
            
            out.println("salary:"+salary);
            out.println("occupation:"+occupation);
            out.println("email:"+email);
            out.println("dob:"+dob);
            out.println("age:"+age);*/
            DAO d=new DAO();
            boolean register=d.insert(name,gender,address,pincode,username,password,phone,salary,occupation,email,dob,age,designation);
            if(register)
            {
                out.println("Registered successfully");
            }
            
            else
                out.println("Try Again");
            
        
        
        
        
    }
	
        
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
    /*@Override
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
   /* @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   /* @Override
    public String getServletInfo() {
        return "Short description";
    }*/// </editor-fold>

