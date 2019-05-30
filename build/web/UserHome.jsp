<%@page import="java.util.TreeSet"%>
<%@ include file="UserHeader.jsp"  %>

<div id="templatemo_content_panel_1">

	<!--<div id="templatemo_news_section">
    	<h1></h1>
        <div class="templatemo_news_box">
	<p>Hi welcome..</p>
	
      </div>

    </div><!-- end of news section -->   
    <div id="templatemo_section_1_1">
		<h3>Customization</h3>
		<p>Search according to your Need</p>
		<p>Search For the Required Loan / Policies of FD's and Insurances</p>
                <table><tr>
                     <td><a href="CustomizeLoanSearch.jsp" >	
                     <img src="images/customize_loan.jpg" alt="image"/> </a></td>
                     <td><a href="CustomizePolicySearch.jsp" >	
                    <img src="images/customize_policy.jpg" alt="image" /> </a></td>                    
                    </tr></table>
                
                
		
    	
    </div><!-- end of section 1 -->
    <div class="cleaner_with_height">&nbsp;</div>
</div>

<div id="templatemo_content_panel_2">
	<div class="templatemo_section_2">
    
    <a href="LoanDetails.jsp" >	
        <img src="images/loan.jpg" alt="image" />
    </a>                        
    </div>
    <div class="templatemo_section_2">
	<a href="GetPolicyDetails.jsp" >	
        <img src="images/templatemo_image_02.jpg" alt="image" />
        </a>
    </div>
    <div class="templatemo_section_2">
        <a href="ViewDollarValues.jsp" >	
        <img src="images/templatemo_image_03.jpg" alt="image" />
       </a>
    </div>
    
    <div class="cleaner_with_height">&nbsp;</div>
</div> <!-- end of content panel 2 -->

<div id="templatemo_content_panel_3">

    <%
            TreeSet<String> ls=(TreeSet<String>)session.getAttribute("view_loans");
            if(ls==null)
            {
                session.setAttribute("view_loans", new TreeSet<String>());
                System.out.println("loans are added intially to session");
            }
            TreeSet<String> po=(TreeSet<String>)session.getAttribute("view_policy");
            if(po==null)
            {
                 System.out.println("policies are added intially to session");
                 session.setAttribute("view_policies", new TreeSet<String>());
            }
                
    %>
    
<div class="cleaner_with_height">&nbsp;</div>
</div><!-- end of content panel 3 -->



<%@ include file="Footer.jsp"  %>