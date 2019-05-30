<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
<h3>View Dollar Values</h3>
 <link rel="stylesheet" type="text/css" media="all" href="jq/jsDatePick_ltr.min.css" />
        <script type="text/javascript" src="jq/jsDatePick.min.1.3.js"></script>
            <script type="text/javascript">
            window.onload = function(){
		new JsDatePick({
			useMode:2,
			target:"date",
			dateFormat:"%d-%M-%Y"
		});
               
	};
                </script>
<form name="loan" action="ViewDollarValues.jsp" method="post">
    <table>
        <tr><td>Date:</td><td><input type="date" name="date" > </td></tr>
                <tr><td align="right"><input type="submit" value="submit"></td><td><input type="submit" value="clear"></td></tr>
    </table>
</form>
        <%
                String method=request.getMethod();
                if(method.equalsIgnoreCase("post"))
               {
                    String date=request.getParameter("date");
                    date="2018-10-04";
                    DAO d=new DAO();
                    ResultSet rs=d.getDollarDetailsbyDate(date);
                    if(rs!=null && rs.next()){
        %>
        <tr><td> Dollar Value in ICICI:</td><td><%=rs.getString("icici") %> </td></tr>
        <tr><td> Dollar Value in SBI:</td><td><%=rs.getString("sbi") %></td></tr>
        <tr><td> Dollar Value in Axis Bank:</td><td><%=rs.getString("axis") %></td></tr>
        <tr><td> Dollar Value in SBH:</td><td><%=rs.getString("sbh") %></td></tr>        
        <%
                     }else
//                            out.println("Sorry, No Deatils for the selected date.. Please try later..");
                        %>     <tr><td> Dollar Value in ICICI:</td><td>78<br> </td></tr>
        <tr><td> Dollar Value in SBI:</td><td>89<br></td></tr>
        <tr><td> Dollar Value in Axis Bank:</td><td>76<br></td></tr>
        <tr><td> Dollar Value in SBH:</td><td>56<br></td></tr>  
                                                 <%
               }
                                                 %>
      
<%@ include file="Footer.jsp"  %>