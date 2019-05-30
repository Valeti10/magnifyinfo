<%@page import="java.util.TreeSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
    <%
            String loanid=request.getParameter("loanid");
            
            DAO d=new DAO();
            ResultSet rs=d.getAllLoanDetailsbyId(loanid);            
            
    %>
    <table colspan="20px">
        
        <%
        if(rs.next()){
            TreeSet<String> ls=(TreeSet<String>)session.getAttribute("view_loans");
            if(ls==null)
            {
                session.setAttribute("view_loans", new TreeSet<String>().add(loanid));
            }
            else
            {
                ls.add(loanid);
                session.setAttribute("view_loans", ls);
            }
        %>
        <tr><td>Loan Type</td><td><%=rs.getString("loantype") %></td></tr>
        <tr><td>Bank Name:</td><td><%=rs.getString("bank") %></td></tr>
        <tr><td>Loan Id:</td><td><%=rs.getString("loanid") %></td></tr>
        <tr><td>Maximum Loan Period</td><td><%=rs.getString("maxloanperiod") %>years</td></tr>
        <tr><td>Rate Of Interest</td><td><%=rs.getString("rateofinterest") %></td></tr>
        <tr><td>Amount sanctioned upto</td><td><%=rs.getString("amountsanctionedupto") %>lacks</td></tr>
        <tr><td>EMI</td><td><%=rs.getString("emi") %></td></tr>
        <tr><td>Processing Fee </td><td><%=rs.getString("processingfee") %> %of loan amount</td></tr>
        <tr><td>Hidden Charges</td><td><%=rs.getString("hiddencharges") %></td></tr>
        <%        
          }
        %>        
    </table>

        
<%@ include file="Footer.jsp"  %>