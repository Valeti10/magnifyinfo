<%@page import="MI.DAO"%>
<%@page import="java.util.TreeSet"%>
<%
        if(request.getParameter("usertype").equalsIgnoreCase("user"))
        {
            String userid=(String)session.getAttribute("userid");
            TreeSet<String> ls=(TreeSet<String>)session.getAttribute("view_loans");
            TreeSet<String> po=(TreeSet<String>)session.getAttribute("view_policies");
            DAO d=new DAO();
            System.out.println("userid:\t"+userid);
            System.out.println("view_loans:\t"+ls);
            System.out.println("view_policies:\t"+po);
            if(d.storeViewDetails(userid,ls,po))
                out.println("our session is stored successfully..");
            else
                out.println("our session is not stored..");
            
        }
        session.invalidate();
%>
<%@include file="index.jsp" %>