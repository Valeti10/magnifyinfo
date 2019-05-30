<%@ include file="Header.jsp"  %>

<div id="templatemo_content_panel_1">
<center>
	<div id="templatemo_news_section">
    	<h1>Login here</h1>
		<p> If You are Not Registered Please Register First</p>
        <div class="templatemo_news_box">
<script language="javascript">
function validate()
{try{  if(document.frm.userid.value=="")
		{	alert(" Please enter username"); 
			document.frm.userid.focus();
			return false;
	  	}
		else if(document.frm.password.value=="")
		{
			alert(" Please enter Password"); 
			document.frm.password.focus();
			return false;
	  	}
	  	}catch(e)
		{	alert(e);
                    	return false;
		}
	return true;
}
</script>
<form action="logininfo" method="post" name="frm" onsubmit="return validate()">
	<table>
	<tr><td>User name</td><td><input type="text" name="userid"></td></tr>
	<tr><td>password</td><td><input type="password" name="password"></td></tr>
        <tr><td><input type="submit" value="Login"></td><td><input type="reset" value="Reset"></td></tr>
	</table>
</form>
	<a href="ForgotPassword.jsp">Forgot password</a><br>
        <a href="Register.jsp">Register</a>
                
        	
      </div>
    </div><!-- end of news section -->
    
  
    <div class="cleaner_with_height">&nbsp;</div>
	  </center>
</div>





<%@ include file="Footer.jsp"  %>