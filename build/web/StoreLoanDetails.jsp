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
        var sbi=document.frm.period.value;
        var axixs=document.frm.interest.value;
        var sbh=document.frm.amount.value;   
        var emi=document.frm.emi.value; 
        var fee=document.frm.fee.value; 
         try{ 
              if(document.frm.loantype.value=="-1")
		{
			alert(" Please select Loan Type"); 
			document.frm.loantype.focus();
			return false;
	  	}             
            else if(document.frm.period.value=="")
		{
			alert(" Please enter Maximum loan period"); 
			document.frm.period.focus();
			return false;
	  	}
            else if(!(isNumeric(sbi))) {
                alert("Invalid Characters in Maximum loan period");
                document.frm.period.focus();
                return false;
            }
            else if(isNaN(sbi)){
                 alert('Please Enter valid Maximum loan period');
                 document.frm.period.focus();
                  return false;
            }
            if(document.frm.interest.value=="")
		{
			alert(" Please enter Amount For Rate of interest"); 
			document.frm.interest.focus();
			return false;
	  	}
            else if(!(isNumeric(axixs))) {
                alert("Invalid Characters in Rate Of Interest");
                document.frm.interest.focus();
                return false;
            }
            else if(isNaN(axixs)){
                 alert('Please Enter valid Rate of interest');
                 document.frm.interest.focus();
                  return false;
            }
            else if(document.frm.amount.value=="")
		{
			alert(" Please enter Sanctioned Amount"); 
			document.frm.amount.focus();
			return false;
	  	}
            else if(!(isNumeric(sbh))) {
                alert("Invalid Characters in sanctioned Amount ");
                document.frm.amount.focus();
                return false;
            }
            else if(isNaN(sbh)){
                 alert('Please Enter valid Amount ');
                 document.frm.amount.focus();
                  return false;
            }
           else if(document.frm.emi.value=="")
		{
			alert(" Please enter EMI Amount"); 
			document.frm.emi.focus();
			return false;
	  	}
            else if(!(isNumeric(emi))) {
                alert("Invalid Characters in Emi Amount ");
                document.frm.emi.focus();
                return false;
            }
            else if(isNaN(emi)){
                 alert('Please Enter valid Emi Amount ');
                 document.frm.emi.focus();
                  return false;
            }
           else if(document.frm.fee.value=="")
		{
			alert(" Please enter Processing Fee Amount"); 
			document.frm.fee.focus();
			return false;
	  	}
            else if(!(isNumeric(fee))) {
                alert("Invalid Characters in Processing Fee Amount ");
                document.frm.fee.focus();
                return false;
            }
            else if(isNaN(fee)){
                 alert('Please Enter valid Processing Fee Amount ');
                 document.frm.fee.focus();
                  return false;
            }
            else if(document.frm.charges.value=="-1")
		{
			alert(" Please select Hidden Charges "); 
			document.frm.charges.focus();
			return false;
	  	}
         }catch( e)
         {  alert(e);
            return false;             
         }
        return true;   
    }
    
</script>
<h3>Store Loan Details</h3>
<form name="frm" action="StoreLoanDetails" method="post" onsubmit="return validate()">
    <%
            String bank=request.getParameter("bank");
            String result=request.getParameter("result");
            DAO d=new DAO();
            String id=d.getLoanId();            
    %>
    <table>
        <tr><td>Loan Type</td><td><select name="loantype" >
            <option value="housing loan" >Housing Loan</option>
                        <option value="-1">-----------</option>
                        <option value="car loan">Car Loan</option>
                        <option value="education loan">Education Loan</option>
                        <option value="gold loan">Gold Loan</option></select>
            </td></tr>
        <tr><td>Bank Name:</td><td><input type="text" name="bank" readonly value=<%=bank %>> </td></tr>
        <tr><td>Loan Id:</td><td><input type="text" name="lid" readonly value=<%=id %>> </td></tr>
        <tr><td>Maximum Loan Period</td><td><input type="text" name="period">years</td></tr>
        <tr><td>Rate Of Interest</td><td><input type="text" name="interest"></td></tr>
        <tr><td>Amount sanctioned upto</td><td><input type="text" name="amount">lacks</td></tr>
        <tr><td>EMI</td><td><input type="text" name="emi"></td></tr>
        <tr><td>Processing Fee </td><td><input type="text" name="fee">of loan amount</td></tr>
        <tr><td>Hidden Charges</td><td><select name="charges">
                    <option value="-1">----</option>
                    <option value="no">No</option>
                    <option value="yes">Yes</option>
                </select></td></tr>
        <tr><td align="right"><input type="submit" value="submit"></td><td><input type="reset" value="clear"></td></tr>
    </table>
</form>
        <%
        if(result!=null)
                out.println(result);
        %>
<%@ include file="Footer.jsp"  %>