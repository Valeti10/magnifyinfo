<%@ include file="Header.jsp"  %>

<div id="templatemo_content_panel_1">
<center>
	<div id="templatemo_news_section">
    	<h1>Login here</h1>
		<p> If You are Not Registered Please Register First</p>
        <div class="templatemo_news_box">
<%
	String uid=request.getParameter("username");
	String pwd=request.getParameter("password");
	if(uid.equalsIgnoreCase("user") && pwd.equalsIgnoreCase("user"))
	{
		session.setAttribute("username",uid);
	response.sendRedirect("UserHome.jsp");
	}
	//else
		//out.println("In Valid Userid / Password..");
%>

      </div>
    </div><!-- end of news section -->
    
  
    <div class="cleaner_with_height">&nbsp;</div>
	  </center>
</div>





<%@ include file="Footer.jsp"  %>