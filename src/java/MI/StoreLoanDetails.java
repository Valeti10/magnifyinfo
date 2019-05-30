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
public class StoreLoanDetails extends HttpServlet 
{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String bank="";
       
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            bank=request.getParameter("bank");
            String loantype=request.getParameter("loantype");
            String loanid=request.getParameter("lid");
            String maxloanperiod=request.getParameter("period");
            String rateofinterest=request.getParameter("interest");
            String amountsanctionedupto=request.getParameter("amount");
            String emi=request.getParameter("emi");
            String processingfee=request.getParameter("fee");
            String hiddencharges=request.getParameter("charges");
                        
           /*out.println("loantype:"+loantype);
            out.println("maxloanperiod:"+maxloanperiod);
            out.println("rateofinterest:"+rateofinterest);
            out.println("amountsanctionedupto:"+amountsanctionedupto);
            out.println("emi:"+emi);
            out.println("processingfee:"+processingfee);
            out.println("hiddencharges:"+hiddencharges);
            out.println("Submited successfully");*/          
            
            MI.DAO d=new MI.DAO();
            boolean loandetails=d.insertloan(loantype,bank,loanid,maxloanperiod,rateofinterest,amountsanctionedupto,emi,processingfee,hiddencharges);
            if(loandetails)
            {
                out.println("Submited successfully");
                response.sendRedirect("StoreLoanDetails.jsp?result=Stored successfully&bank="+bank);
            }            
            else
                //out.println("Try Again");
                response.sendRedirect("StoreLoanDetails.jsp?result=Storing Failed&bank="+bank);
    }
	
        
    }

