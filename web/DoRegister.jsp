<%@ include file="Header.jsp"  %>

<div id="templatemo_content_panel_1">
<center>
	<div id="templatemo_section_1_1">
<%
	String name=request.getParameter("name");
        String gender=request.getParameter("gender");
	String address=request.getParameter("address");
        String pincode=request.getParameter("pincode");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
	String phone=request.getParameter("phone");
	String salary=request.getParameter("salary");
        String occupation=request.getParameter("occupation");
        String email=request.getParameter("email");
	String dob=request.getParameter("dob");
        String age=request.getParameter("age");
        String designation=request.getParameter("designatoin");
	out.println("Success fully Registered..");

%>

    </div><!-- end of news section -->
    
  </center>
    <div class="cleaner_with_height">&nbsp;</div>

</div>





<%@ include file="Footer.jsp"  %>