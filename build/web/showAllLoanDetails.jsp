<%@page import="java.sql.ResultSet"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
    <%
            String bank=request.getParameter("bank");
            String loantype=request.getParameter("loantype");
            DAO d=new DAO();
            ResultSet rs=d.getAllLoanDetailsbyBankandType(bank,loantype);            
            
    %>
    <table colspan="20px">
        <tr><td>Loan Id</td><td>Max Loan Period</td><td>Amount Sanctioned(In Lacks)</td></tr>
        <%
            while(rs.next()){
                String loanid=rs.getString("loanid");
        %>
        <tr><td><%=loanid%></td><td><%=rs.getString("maxloanperiod")%></td><td><%=rs.getString("amountsanctionedupto")%> </td><td><a href="ViewParticularLoan.jsp?loanid=<%=loanid%>">Click Here To View More Details</a></td></tr>
        <%
          }
        %>        
    </table>

        
<%@ include file="Footer.jsp"  %>