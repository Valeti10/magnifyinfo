<%@page import="MI.DAO"%>
<%@ include file="AdminHeader.jsp"  %>
<link rel="stylesheet" type="text/css" media="all" href="jq/jsDatePick_ltr.min.css" />
        <script type="text/javascript" src="jq/jsDatePick.min.1.3.js"></script>
            <script type="text/javascript">
            window.onload = function(){
		new JsDatePick({
			useMode:2,
			target:"fromdate",
			dateFormat:"%d-%M-%Y"
		});
                new JsDatePick({
			useMode:2,
			target:"todate",
			dateFormat:"%d-%M-%Y"
		});
	};
    function validate()
    {
         try{ 
              if(document.frm.lid.value=="")
		{
			alert(" Please Enter Loan Id"); 
			document.frm.lid.focus();
			return false;
	  	}             

         }catch( e)
         {  alert(e);
            return false;             
         }
        return true;   
    }
    
</script>
<h3> No Of Views For Loan </h3>
<form name="frm" action="LoanViews.jsp" method="post" onsubmit="return validate()">
    <%
            String method=request.getMethod();
    %>
    <table>
        <tr><td>Loan Id:</td><td><input type="text" name="lid" </td></tr>
        <tr><td>Select Starting Date:</td><td><input type="text" name="fromdate" id="fromdate"/></td></tr>
           <tr><td>Select Ending Date:</td><td><input type="text" name="todate" id="todate"/></td></tr> 
        <tr><td align="right"><input type="submit" value="submit"></td><td><input type="reset" value="clear"></td></tr>
    </table>
</form>
    <%
            if(method.equalsIgnoreCase("post"))
            {
                    DAO d=new DAO();
                    String lid=request.getParameter("lid");  
                    String fromdate=request.getParameter("fromdate");   
                    String todate=request.getParameter("todate");                                     
                    int views=d.getNoOfLoanViewsForaLoan(lid,fromdate,todate);
                    out.println("No Of Views For Loan "+lid+"&nbsp;&nbsp;:"+views);
            }
    %>
<%@ include file="Footer.jsp"  %>