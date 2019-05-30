<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
<form name="loan" action="showAllLoanDetails.jsp" method="post">
    <%
            String bank=request.getParameter("bank");            
    %>
    <table>
        <tr><td>Loan Type</td><td><select name="loantype" >
            <option value="housing loan" >Housing Loan</option>
                        <option value="car loan">Car Loan</option>
                        <option value="education loan">Education Loan</option>
                        <option value="gold loan">Gold Loan</option></select>
            </td></tr>
        <tr><td>Bank Name:</td><td><input type="text" name="bank" readonly value=<%=bank %>> </td></tr>
         <tr><td align="right"><input type="submit" value="submit"></td><td><input type="submit" value="clear"></td></tr>
    </table>
</form>
<%@ include file="Footer.jsp"  %>