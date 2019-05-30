package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import MI.DAO;

public final class AddDollarValue_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("<script type = \"text/javascript\">\n");
      out.write("function isNumeric(val) {\n");
      out.write("        var validChars = '0123456789.';\n");
      out.write("        for(var i = 0; i < val.length; i++) {\n");
      out.write("            if(validChars.indexOf(val.charAt(i)) == -1)\n");
      out.write("                return false;\n");
      out.write("        }        return true;\n");
      out.write("    }\n");
      out.write("    function validate()\n");
      out.write("    {\n");
      out.write("        var icici=document.frm.icici.value;\n");
      out.write("        var sbi=document.frm.sbi.value;\n");
      out.write("        var axixs=document.frm.axixs.value;\n");
      out.write("        var sbh=document.frm.sbh.value;        \n");
      out.write("          if(!(isNumeric(icici))) {\n");
      out.write("              alert(\"Please Enter a amount for ICICI\");\n");
      out.write("              document.frm.icici.focus();\n");
      out.write("              return false;\n");
      out.write("          }\n");
      out.write("          else if(isNaN(icici)){\n");
      out.write("               alert('Please Enter Amount Only');\n");
      out.write("               document.frm.icici.focus();\n");
      out.write("                return false;\n");
      out.write("          }\n");
      out.write("          else if(!(isNumeric(sbi))) {\n");
      out.write("              alert(\"Please Enter a amount For SBI\");\n");
      out.write("              document.frm.sbi.focus();\n");
      out.write("              return false;\n");
      out.write("          }\n");
      out.write("          else if(isNaN(sbi)){\n");
      out.write("               alert('Please Enter Amount Only');\n");
      out.write("               document.frm.sbi.focus();\n");
      out.write("                return false;\n");
      out.write("          }\n");
      out.write("          else if(!(isNumeric(axixs))) {\n");
      out.write("              alert(\"Please Enter a amount For AXIXS\");\n");
      out.write("              document.frm.axixs.focus();\n");
      out.write("              return false;\n");
      out.write("          }\n");
      out.write("          else if(isNaN(axixs)){\n");
      out.write("               alert('Please Enter Amount Only');\n");
      out.write("               document.frm.axixs.focus();\n");
      out.write("                return false;\n");
      out.write("          }\n");
      out.write("          else if(!(isNumeric(sbh))) {\n");
      out.write("              alert(\"Please Enter a amount For SBH\");\n");
      out.write("              document.frm.sbh.focus();\n");
      out.write("              return false;\n");
      out.write("          }\n");
      out.write("          else if(isNaN(sbh)){\n");
      out.write("               alert('Please Enter Amount Only');\n");
      out.write("               document.frm.sbh.focus();\n");
      out.write("                return false;\n");
      out.write("          }\n");
      out.write("       \n");
      out.write("           \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("<form name=\"frm\" action=\"StoreDollarDetails\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("    ");

            java.util.Date d=new java.util.Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
            String result=request.getParameter("result");
    
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr><td>Date:</td><td><input type=\"text\" name=\"date\" readonly value=");
      out.print(sdf.format(d) );
      out.write("> </td></tr>\n");
      out.write("        <tr><td>Enter Dollar Value in ICICI:</td><td><input type=\"text\" name=\"icici\"> </td></tr>\n");
      out.write("        <tr><td>Enter Dollar Value in SBI:</td><td><input type=\"text\" name=\"sbi\"> </td></tr>\n");
      out.write("        <tr><td>Enter Dollar Value in Axis ank:</td><td><input type=\"text\" name=\"axis\"> </td></tr>\n");
      out.write("        <tr><td>Enter Dollar Value in SBH:</td><td><input type=\"text\" name=\"sbh\"> </td></tr>        \n");
      out.write("        <tr><td align=\"right\"><input type=\"submit\" value=\"submit\"></td><td><input type=\"reset\" value=\"clear\"></td></tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("        ");

        if(result!=null)
                out.println(result);
        
      out.write('\n');
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
