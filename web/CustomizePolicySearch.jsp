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
        var paid=document.frm.paid.value; 
        /*var minage=document.frm.minage.value;
        var maxage=document.frm.maxage.value;
        var term=document.frm.term.value;         
        var maxpremium=document.frm.maxpremium.value; 
        var maxsumassured=document.frm.maxsumassured.value; 
        var minsumassured=document.frm.minsumassured.value; 
        */
         try{             
          /*    if(document.frm.no.value=="")
		{
			alert(" Please Enter Policy No"); 
			document.frm.no.focus();
			return false;
	  	}             
            else if(document.frm.minage.value=="")
		{
			alert(" Please enter Minimum age limit"); 
			document.frm.minage.focus();
			return false;
	  	}
            else if(!(isNumeric(minage))) {
                alert("Invalid Characters in Minimum age limit");
                document.frm.minage.focus();
                return false;
            }
            else if(isNaN(minage)){
                 alert('Please Enter valid Minimum age limit');
                 document.frm.minage.focus();
                  return false;
            }
            if(document.frm.maxage.value=="")
		{
			alert(" Please enter Maximum age limit"); 
			document.frm.maxage.focus();
			return false;
	  	}
            else if(!(isNumeric(maxage))) {
                alert("Invalid Characters in Maximum age limit");
                document.frm.maxage.focus();
                return false;
            }
            else if(isNaN(maxage)){
                 alert('Please Enter valid Maximum age limit');
                 document.frm.maxage.focus();
                  return false;
            }
            else if(document.frm.term.value=="")
		{
			alert(" Please enter Policy term"); 
			document.frm.term.focus();
			return false;
	  	}
            else if(!(isNumeric(term))) {
                alert("Invalid Characters in Policy term ");
                document.frm.term.focus();
                return false;
            }
            else if(isNaN(term)){
                 alert('Please Enter valid Policy Term ');
                 document.frm.term.focus();
                  return false;
            }*/
             if(document.frm.pname.value=="-1")
		{
			alert(" Please select policy provider name "); 
			document.frm.pname.focus();
			return false;
	  	}
             else if(document.frm.premiumterm.value=="-1")
		{
			alert(" Please select premium term "); 
			document.frm.premiumterm.focus();
			return false;
	  	}
           else if(document.frm.frequency.value=="-1")
		{
			alert(" Please select Payment frequency"); 
			document.frm.frequency.focus();
			return false;
	  	}
           else if(document.frm.paid.value=="")
		{
			alert(" Please enter Amount paid"); 
			document.frm.paid.focus();
			return false;
	  	}
            else if(!(isNumeric(paid))) {
                alert("Invalid Characters in Amount paid");
                document.frm.paid.focus();
                return false;
            }
            else if(isNaN(paid)){
                 alert('Please Enter valid Amount paid');
                 document.frm.paid.focus();
                  return false;
            }
 /*          else if(document.frm.maxpremium.value=="")
		{
			alert(" Please enter max premium Amount"); 
			document.frm.maxpremium.focus();
			return false;
	  	}
            else if(!(isNumeric(maxpremium))) {
                alert("Invalid Characters in max premium Amount ");
                document.frm.maxpremium.focus();
                return false;
            }
            else if(isNaN(maxpremium)){
                 alert('Please Enter valid max premium Amount ');
                 document.frm.fee.focus();
                  return false;
            }
            else if(document.frm.maxsumassured.value=="")
		{
			alert(" Please enter max sum assured Amount"); 
			document.frm.maxsumassured.focus();
			return false;
	  	}
            else if(!(isNumeric(maxsumassured))) {
                alert("Invalid Characters inmax sum assured Amount ");
                document.frm.maxpremium.focus();
                return false;
            }
            else if(isNaN(maxsumassured)){
                 alert('Please Enter valid max sum assured Amount ');
                 document.frm.maxsumassured.focus();
                  return false;
            }
            else if(document.frm.minsumassured.value=="")
		{
			alert(" Please enter min sum assured Amount"); 
			document.frm.minsumassured.focus();
			return false;
	  	}
            else if(!(isNumeric(minsumassured))) {
                alert("Invalid Characters in min sum assured Amount ");
                document.frm.minsumassured.focus();
                return false;
            }
            else if(isNaN(minsumassured)){
                 alert('Please Enter valid min sum assured Amount ');
                 document.frm.minsumassured.focus();
                  return false;
            }
           */
         }catch( e)
         {  alert(e);
            return false;             
         }
        return true;   
    }
    
</script>
<h3>Customize Policy Search Details</h3>
<form name="frm" action="CustomizePolicySearch1.jsp" method="post" onsubmit="return validate()">
    <table>
       <tr><td> Policy Provider Company Name:</td><td><select name="pname" ><option value="-1">--------</option>
                    <option value="agrigold">AGRI GOLD</option>
                    <option value="lic">LIC</option>
                    <option value="bajaj allianz">BAJAJ ALLIANZ</option>
                </select></td></tr>
        <tr><td> Premium paying term</td><td><select name="premiumterm" ><option value="-1">--------</option>
                    <option value="10">10years</option>
                    <option value="15">15years</option>
                    <option value="20">20years</option>
                </select></td></tr> 
        <tr><td> Premium payment frequency</td><td><select name="frequency">
                    <option value="-1">--------</option>
                    <option value="yearly">Yearly</option>
                    <option value="halfyearly">Half Yearly</option>
                    <option value="Quarterly">Quarterly</option>
                    <option value="Monthly">Monthly</option>
                    <option value="daily">Daily</option>
                </select></td></tr>
      <tr><td> Amount Paid</td><td><input type="text" name="paid"></td></tr>
        <tr><td align="right"><input type="submit" value="submit"></td><td><input type="reset" value="clear"></td></tr>
    </table>
</form>
<%@ include file="Footer.jsp"  %>