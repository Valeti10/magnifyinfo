<%@ include file="Header.jsp"  %>
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
<div id="templatemo_content_panel_1">

	<div id="templatemo_news_section">
    	<h1>Login here</h1>
        <div class="templatemo_news_box">
            <form action="logininfo" method="post" name="frm" onsubmit="return validate()">
		<table>
		<tr><td>User name</td><td><input type="text" name="userid"></td></tr>
		<tr><td>password</td><td><input type="password" name="password"></td></tr>
		<tr><td><input type="submit" value="Login"></td><td><input type="reset" value="Reset"></td></tr>
		</table>
	</form>
	<a href="ForgotPassword.jsp">Forgot password</a><br>
                       <h4><a href="Register.jsp">Register</a></h4>
                
        	
      </div>
    </div><!-- end of news section -->
    
    <div id="templatemo_section_1_1">
		<h3>Customization</h3>
		<p>Search according to your Need</p>
		<p>Search For the Required Loan / Policies of FD's and Insurances</p>
		<br/><br/><br/><br/><br/><br/><br/>
    	
    </div><!-- end of section 1 -->
    <div class="cleaner_with_height">&nbsp;</div>
</div>

<div id="templatemo_content_panel_2">
	<div class="templatemo_section_2">
    
    <a href="Login.jsp" >	
        <img src="images/templatemo_image_01.jpg" alt="image" />
    </a>                        
    </div>
    <div class="templatemo_section_2">
	<a href="Login.jsp" >	
        <img src="images/templatemo_image_02.jpg" alt="image" />
        </a>
    </div>
    <div class="templatemo_section_2">
<a href="Login.jsp" >	
        <img src="images/templatemo_image_03.jpg" alt="image" />
       </a>
    </div>
    
    <div class="cleaner_with_height">&nbsp;</div>
</div> <!-- end of content panel 2 -->

<div id="templatemo_content_panel_3">

	
    
<div class="cleaner_with_height">&nbsp;</div>
</div><!-- end of content panel 3 -->






<%@ include file="Footer.jsp"  %>