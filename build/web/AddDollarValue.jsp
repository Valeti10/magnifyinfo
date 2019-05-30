<%@page import="java.text.SimpleDateFormat"%>
<%@page import="MI.DAO"%>
<%@ include file="AdminHeader.jsp"  %>
<script type = "text/javascript">
function isNumeric(val) {
        var validChars = '0123456789.';
        for(var i = 0; i < val.length; i++) {
            if(validChars.indexOf(val.charAt(i)) == -1)
                return false;
        }        return true;
    }
    function validate()
    {
        var icici=document.frm.icici.value;
        var sbi=document.frm.sbi.value;
        var axixs=document.frm.axixs.value;
        var sbh=document.frm.sbh.value;        
         try{ 
              if(document.frm.icici.value=="")
		{
			alert(" Please enter Amount For ICICI"); 
			document.frm.icici.focus();
			return false;
	  	}
             else if(!(isNumeric(icici))) {
              alert("Invalid Characters Amount in ICICI");
              document.frm.icici.focus();
              return false;
            }
            else if(isNaN(icici)){
                 alert('Please Enter Amount Only');
                 document.frm.icici.focus();
                  return false;
            }
            else if(document.frm.sbi.value=="")
		{
			alert(" Please enter Amount For SBI"); 
			document.frm.sbi.focus();
			return false;
	  	}
            else if(!(isNumeric(sbi))) {
                alert("Invalid Characters Amount in SBI");
                document.frm.sbi.focus();
                return false;
            }
            else if(isNaN(sbi)){
                 alert('Please Enter Amount Only');
                 document.frm.sbi.focus();
                  return false;
            }
            if(document.frm.axixs.value=="")
		{
			alert(" Please enter Amount For AXIXS"); 
			document.frm.axixs.focus();
			return false;
	  	}
            else if(!(isNumeric(axixs))) {
                alert("Invalid Characters Amount in AXIXS");
                document.frm.axixs.focus();
                return false;
            }
            else if(isNaN(axixs)){
                 alert('Please Enter Amount Only');
                 document.frm.axixs.focus();
                  return false;
            }
            if(document.frm.sbh.value=="")
		{
			alert(" Please enter Amount For SBH"); 
			document.frm.sbh.focus();
			return false;
	  	}
            else if(!(isNumeric(sbh))) {
                alert("Invalid Characters Amount in SBH");
                document.frm.sbh.focus();
                return false;
            }
            else if(isNaN(sbh)){
                 alert('Please Enter Amount Only');
                 document.frm.sbh.focus();
                  return false;
            }
         }catch( e)
         {  alert(e);
            return false;             
         }
        return true;   
    }
    
</script>
<form name="frm" action="StoreDollarDetails" method="post" onsubmit="return validate()">
    <%
            java.util.Date d=new java.util.Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String result=request.getParameter("result");
    %>
    <table>
        <tr><td>Date:</td><td><input type="date" name="date" > </td></tr>
        <tr><td>Enter Dollar Value in ICICI:</td><td><input type="text" name="icici"> </td></tr>
        <tr><td>Enter Dollar Value in SBI:</td><td><input type="text" name="sbi"> </td></tr>
        <tr><td>Enter Dollar Value in Axis Bank:</td><td><input type="text" name="axixs"> </td></tr>
        <tr><td>Enter Dollar Value in SBH:</td><td><input type="text" name="sbh"> </td></tr>        
        <tr><td align="right"><input type="submit" value="submit"></td><td><input type="reset" value="clear"></td></tr>
    </table>
</form>
        <%
        if(result!=null)
                out.println(result);
        %>
<%@ include file="Footer.jsp"  %>