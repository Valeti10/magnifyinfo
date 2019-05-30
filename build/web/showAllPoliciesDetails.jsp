<%@page import="java.sql.ResultSet"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
    <%
            String provider=request.getParameter("provider");
            DAO d=new DAO();
            ResultSet rs=d.getAllPolicyDetailsbyProvider(provider);            
            
    %>
    <table colspan="20px">
        <tr><td>Policy Id</td><td>policy term</td><td>maximum sum assured</td></tr>
        <%
            while(rs.next()){
                String policyid=rs.getString("policyid");
        %>
        <tr><td><%=policyid %></td><td><%=rs.getString("policyterm")%></td><td><%=rs.getString("maximumsumassured")%> </td><td><a href="ViewParticularPolicy.jsp?policyid=<%=policyid%>">Click Here To View More Details</a></td></tr>
        <%
          }
        %>        
    </table>

        
<%@ include file="Footer.jsp"  %>