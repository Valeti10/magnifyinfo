<%@page import="MI.DAO"%>
<%@ include file="UserHeader.jsp"  %>
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
         try{ 
              if(document.frm.loantype.value=="-1")
		{
			alert(" Please select Loan Type"); 
			document.frm.loantype.focus();
			return false;
	  	} 
            else if(document.frm.bank.value=="-1")
		{
			alert(" Please select Bank "); 
			document.frm.bank.focus();
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
            
         }catch( e)
         {  alert(e);
            return false;             
         }
        return true;   
    }
    
</script>
<h3>Customized Loan Search</h3>
<form name="frm" action="CustomizeLoanSearch1.jsp" method="post" onsubmit="return validate()">
    <table>
        <tr><td>Loan Type</td><td><select name="loantype" >
                        <option value="-1" >------------</option>
                        <option value="housing loan" >Housing Loan</option>
                        <option value="car loan">Car Loan</option>
                        <option value="education loan">Education Loan</option>
                        <option value="gold loan">Gold Loan</option></select>
        </td></tr>
        <tr><td>Bank Name:</td><td><select name="bank" >
                        <option value="-1" >-------</option>
                        <option value="icici" >ICICI</option>
                        <option value="sbi">SBI</option>
                        <option value="axis">AXIS</option>
                        <option value="sbh">SBH</option></select>
        </td></tr>
        <tr><td>Maximum Loan Period</td><td><input type="text" name="period">years</td></tr>
        <tr><td>Rate Of Interest</td><td><input type="text" name="interest"></td></tr>
        <tr><td>Amount sanctioned upto</td><td><input type="text" name="amount">lacks</td></tr>
        <tr><td>EMI</td><td><input type="text" name="emi"></td></tr>
        <tr><td align="right"><input type="submit" value="submit"></td><td><input type="reset" value="clear"></td></tr>
    </table>
</form>
<%@ include file="Footer.jsp"  %>