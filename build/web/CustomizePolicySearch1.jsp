<%@page import="java.sql.ResultSet"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
<%
            String pname=request.getParameter("pname");
            String premiumterm=request.getParameter("premiumterm");
            String paymentfrequency=request.getParameter("frequency");
            String amountpaid=request.getParameter("paid");          
            DAO d=new DAO();
            ResultSet rs=d.getPolicySearchDetails(pname,premiumterm,paymentfrequency,amountpaid);
%>
       <table colspan="20px">
        <tr><td>Policy Id</td><td>policy term</td><td>Payment Frequency</td><td>Amount Paid</td><td>maximum sum assured</td></tr>
        <%
            while(rs.next()){
                String policyid=rs.getString("policyid");
        %>
        <tr><td><%=policyid %></td><td><%=rs.getString("policyterm")%></td><td><%=rs.getString("premiumpaymentfrequency")%> </td><td><%=rs.getString("maximumsumassured")%> </td><td><%=rs.getString("maximumsumassured")%> </td><td><a href="ViewParticularPolicy.jsp?policyid=<%=policyid%>">Click Here To View More Details</a></td></tr>
        <%
          }
        %>        
    </table>
        <p>Note:These Results are in between maximum and minimum of 25%of amount paid</p>
<%@ include file="Footer.jsp"  %>