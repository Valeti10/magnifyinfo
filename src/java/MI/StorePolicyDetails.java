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
public class StorePolicyDetails extends HttpServlet 
{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String policyid=request.getParameter("pid");
            String policyno=request.getParameter("no");
            String pname=request.getParameter("pname");
            String minage=request.getParameter("minage");
            String maxage=request.getParameter("maxage");
            String policyterm=request.getParameter("term");
            String premiumterm=request.getParameter("premiumterm");
            String paymentfrequency=request.getParameter("frequency");
            String amountpaid=request.getParameter("paid");
            String maxpremium=request.getParameter("maxpremium");
            String maxsumassured=request.getParameter("maxsumassured");
            String minsumassured=request.getParameter("minsumassured");
                        
           /*out.println("policyno:"+policyno);
            out.println("minage:"+minage);
            out.println("maxage:"+maxage);
            out.println("policyterm:"+policyterm);
            out.println("premiumterm:"+premiumterm);
            out.println("paymentfrequency:"+paymentfrequency);
            out.println("amountpaid:"+amountpaid);
            out.println("maxpremium:"+maxpremium);
            out.println("maxsumassured:"+maxsumassured);
            out.println("minsumassureed:"+minsumassured);
            out.println("policyid:"+policyid);*/          
            MI.DAO d=new MI.DAO();
            boolean loandetails=d.insertpolicy(policyid,policyno,pname,minage,maxage,policyterm,premiumterm,paymentfrequency,amountpaid,maxpremium,maxsumassured,minsumassured);
            if(loandetails)
            {
                out.println("Submited successfully");
                response.sendRedirect("StorePolicyDetails.jsp?result=Stored successfully&provider="+pname);
            }             
            else
                //out.println("Try Again");
                response.sendRedirect("StorePolicyDetails.jsp?result=Storing Failed&provider="+pname);
    } 
    }

