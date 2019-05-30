<%@page import="java.sql.ResultSet"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
<%
            String bank=request.getParameter("bank");
            String loantype=request.getParameter("loantype");
            String maxloanperiod=request.getParameter("period");
            String rateofinterest=request.getParameter("interest");
            String amountsanctionedupto=request.getParameter("amount");
            String emi=request.getParameter("emi");            
            DAO d=new DAO();
            ResultSet rs=d.getLoanSearchDetails(bank,loantype,maxloanperiod,rateofinterest,amountsanctionedupto,emi);
%>
             <table colspan="20px">
        <tr><td>Loan Id</td><td>Max Loan Period</td><td>Rate of Interest</td><td>Amount Sanctioned(In Lacks)</td><td>EMI</td></tr>
        <%
            while(rs.next()){
                String loanid=rs.getString("loanid");
        %>
        <tr><td><%=loanid%></td><td><%=rs.getString("maxloanperiod")%></td><td><%=rs.getString("rateofinterest")%></td><td><%=rs.getString("amountsanctionedupto")%> </td><td><%=rs.getString("emi")%> </td><td><a href="ViewParticularLoan.jsp?loanid=<%=loanid%>">Click Here To View More Details</a></td></tr>
        <%
          }
        %>        
    </table>
        <p>Note:These Results are in between maximum and minimum of 20%of max loan period and 5% of rate of interest and 20% of amount sanctioned and 10% of emi amount</p>
<%@ include file="Footer.jsp"  %>