package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/AdminHeader.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("<title>Magnify Info</title>\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"gallery_style.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"templatemo_container\">\n");
      out.write("<div id=\"templatemo_top_panel\">\n");
      out.write("\t<div id=\"templatemo_header_section\">\n");
      out.write("\t\t<div id=\"templatemo_header\">\n");
      out.write("        \t\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- end of header section -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_menu_login_section\">\n");
      out.write("    \t<div id=\"templatemo_menu_section\">\n");
      out.write("        \t<div id=\"templatemo_menu_panel\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"AdminHome.jsp\" class=\"current\">Home</a></li>\n");
      out.write("                     <li><a href=\"Logout.jsp?usertype=admin\">Logout</a></li>\n");
      out.write("                   <!-- <li><a href=\"ContactUs.jsp\">Contact</a></li>       -->            \n");
      out.write("                </ul> \n");
      out.write("            </div> <!-- end of menu -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <p>Welcome ");
      out.print(session.getAttribute("userid") );
      out.write("</p>\n");
      out.write("            </div> <!-- end of menu login section -->\n");
      out.write("\n");
      out.write("</div> <!-- end of top panel -->\n");
      out.write("\n");
      out.write("<div id=\"templatemo_gallery_panel\">\n");
      out.write("<div id=\"gallery\">\n");
      out.write("  <div id=\"imagearea\">\n");
      out.write("    <div id=\"image\">\n");
      out.write("      <a href=\"javascript:slideShow.nav(-1)\" class=\"imgnav \" id=\"previmg\"></a>\n");
      out.write("      <a href=\"javascript:slideShow.nav(1)\" class=\"imgnav \" id=\"nextimg\"></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"thumbwrapper\">\n");
      out.write("    <div id=\"thumbarea\">\n");
      out.write("      <ul id=\"thumbs\">\n");
      out.write("        <li value=\"1\"><img src=\"images/thumbs/1.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"2\"><img src=\"images/thumbs/2.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"3\"><img src=\"images/thumbs/3.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"4\"><img src=\"images/thumbs/4.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"5\"><img src=\"images/thumbs/5.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"3\"><img src=\"images/thumbs/3.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"4\"><img src=\"images/thumbs/4.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("        <li value=\"5\"><img src=\"images/thumbs/5.jpg\" width=\"179\" height=\"100\" alt=\"\" /></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var imgid = 'image';\n");
      out.write("var imgdir = 'images/fullsize';\n");
      out.write("var imgext = '.jpg';\n");
      out.write("var thumbid = 'thumbs';\n");
      out.write("var auto = true;\n");
      out.write("var autodelay = 5;\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"slide.js\"></script>\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"templatemo_content_panel_1\">\n");
      out.write("\n");
      out.write("\t<!--<div id=\"templatemo_news_section\">\n");
      out.write("    \t<h1></h1>\n");
      out.write("        <div class=\"templatemo_news_box\">\n");
      out.write("\t<p>Hi welcome..</p>\n");
      out.write("\t\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div><!-- end of news section -->   \n");
      out.write("    <div id=\"templatemo_section_1_1\">\n");
      out.write("\t\t<h3>Customization</h3>\n");
      out.write("\t\t<p>Search according to your Need</p>\n");
      out.write("\t\t<p>Search For the Required Loan / Policies of FD's and Insurances</p>\n");
      out.write("\t\t<br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("    \t\n");
      out.write("    </div><!-- end of section 1 -->\n");
      out.write("    <div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"templatemo_content_panel_2\">\n");
      out.write("\t<div class=\"templatemo_section_2\">\n");
      out.write("    \n");
      out.write("    <a href=\"InsertLoanDetails.jsp\" >\t\n");
      out.write("        <img src=\"images/templatemo_image_01.jpg\" alt=\"image\" />\n");
      out.write("    </a>                        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"templatemo_section_2\">\n");
      out.write("\t<a href=\"InsertPolicyDetails.jsp\" >\t\n");
      out.write("        <img src=\"images/templatemo_image_02.jpg\" alt=\"image\" />\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"templatemo_section_2\">\n");
      out.write("        <a href=\"AddDollarValue.jsp\" >\t\n");
      out.write("        <img src=\"images/templatemo_image_03.jpg\" alt=\"image\" />\n");
      out.write("       </a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("</div> <!-- end of content panel 2 -->\n");
      out.write("\n");
      out.write("<div id=\"templatemo_content_panel_3\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("</div><!-- end of content panel 3 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"templatemo_footer_panel\">\n");
      out.write("    Copyright © 2014 <a href=\"index.jsp\">Magnify Info</a> </div>\n");
      out.write("</div> <!-- end of container -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
