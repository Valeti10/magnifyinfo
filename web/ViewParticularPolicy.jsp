<%@page import="java.util.TreeSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
    <%
            String policyid=request.getParameter("policyid");            
            DAO d=new DAO();
            ResultSet rs=d.getAllPolicyDetailsbyId(policyid);            
            
    %>
    <table colspan="20px">
        
        <%
        if(rs.next()){
            TreeSet<String> po=(TreeSet<String>)session.getAttribute("view_policies");
            if(po==null)
            {
                System.out.println("added to session in user view particular policy");
                session.setAttribute("view_policies", new TreeSet<String>().add(policyid));
            }
            else
            {
                po.add(policyid);
                session.setAttribute("view_policies", po);
            }
        %>
        <tr><td> Policy Id</td><td><%=rs.getString("policyid") %></td></tr>
        <tr><td> Policy No</td><td><%=rs.getString("policyno") %></td></tr>
        <tr><td> Policy Provider Company Name:</td><td><%=rs.getString("providername") %></td></tr>
        <tr><td> Minimum entry age</td><td><%=rs.getString("minimumentryage") %></td></tr>
        <tr><td> Maximum entry age</td><td><%=rs.getString("maximumentryage") %></td></tr>
        <tr><td> Policy term</td><td><%=rs.getString("policyterm") %>years</td></tr>
        <tr><td> Premium paying term</td><td><%=rs.getString("premiumpayingterm") %></td></tr> 
        <tr><td> Premium payment frequency</td><td><%=rs.getString("premiumpaymentfrequency") %></td></tr>
        <tr><td> Amount Paid</td><td><%=rs.getString("amountpaid") %></td></tr>
        <tr><td> Maximum Premium</td><td><%=rs.getString("maximumpremium") %></td></tr>
        <tr><td>Maximum Sum Assured</td><td><%=rs.getString("maximumsumassured") %></td></tr>
        <tr><td> Minimum Sum Assured</td><td><%=rs.getString("minimumsumassured") %></td></tr>
        <%        
          }
        %>        
    </table>

        
<%@ include file="Footer.jsp"  %>