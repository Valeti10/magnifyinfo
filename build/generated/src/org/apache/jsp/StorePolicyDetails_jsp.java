package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MI.DAO;

public final class StorePolicyDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        var minage=document.frm.minage.value;\n");
      out.write("        var maxage=document.frm.maxage.value;\n");
      out.write("        var term=document.frm.term.value;   \n");
      out.write("        var paid=document.frm.paid.value; \n");
      out.write("        var maxpremium=document.frm.maxpremium.value; \n");
      out.write("        var maxsumassured=document.frm.maxsumassured.value; \n");
      out.write("        var minsumassured=document.frm.minsumassured.value; \n");
      out.write("         try{ \n");
      out.write("              if(document.frm.no.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please Enter Policy No\"); \n");
      out.write("\t\t\tdocument.frm.noe.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}             \n");
      out.write("            else if(document.frm.minage.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Minimum age limit\"); \n");
      out.write("\t\t\tdocument.frm.minage.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(minage))) {\n");
      out.write("                alert(\"Invalid Characters in Minimum age limit\");\n");
      out.write("                document.frm.minage.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(minage)){\n");
      out.write("                 alert('Please Enter valid Minimum age limit');\n");
      out.write("                 document.frm.minage.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            if(document.frm.maxage.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Maximum age limit\"); \n");
      out.write("\t\t\tdocument.frm.maxage.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(maxage))) {\n");
      out.write("                alert(\"Invalid Characters in Maximum age limit\");\n");
      out.write("                document.frm.maxage.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(maxage)){\n");
      out.write("                 alert('Please Enter valid Maximum age limit');\n");
      out.write("                 document.frm.maxage.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            else if(document.frm.term.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Policy term\"); \n");
      out.write("\t\t\tdocument.frm.term.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(term))) {\n");
      out.write("                alert(\"Invalid Characters in Policy term \");\n");
      out.write("                document.frm.term.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(term)){\n");
      out.write("                 alert('Please Enter valid Policy Term ');\n");
      out.write("                 document.frm.term.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("             else if(document.frm.premiumterm.value==\"-1\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please select premium term \"); \n");
      out.write("\t\t\tdocument.frm.premiumterm.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("           else if(document.frm.frequency.value==\"-1\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please select Payment frequency\"); \n");
      out.write("\t\t\tdocument.frm.frequency.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("           else if(document.frm.paid.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Amount paid\"); \n");
      out.write("\t\t\tdocument.frm.paid.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(paid))) {\n");
      out.write("                alert(\"Invalid Characters in Amount paid\");\n");
      out.write("                document.frm.paid.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(paid)){\n");
      out.write("                 alert('Please Enter valid Amount paid');\n");
      out.write("                 document.frm.paid.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("           else if(document.frm.maxpremium.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter max premium Amount\"); \n");
      out.write("\t\t\tdocument.frm.maxpremium.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(maxpremium))) {\n");
      out.write("                alert(\"Invalid Characters in max premium Amount \");\n");
      out.write("                document.frm.maxpremium.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(maxpremium)){\n");
      out.write("                 alert('Please Enter valid max premium Amount ');\n");
      out.write("                 document.frm.fee.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            else if(document.frm.maxsumassured.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter max sum assured Amount\"); \n");
      out.write("\t\t\tdocument.frm.maxsumassured.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(maxsumassured))) {\n");
      out.write("                alert(\"Invalid Characters inmax sum assured Amount \");\n");
      out.write("                document.frm.maxpremium.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(maxsumassured)){\n");
      out.write("                 alert('Please Enter valid max sum assured Amount ');\n");
      out.write("                 document.frm.maxsumassured.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            else if(document.frm.minsumassured.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter min sum assured Amount\"); \n");
      out.write("\t\t\tdocument.frm.minsumassured.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(minsumassured))) {\n");
      out.write("                alert(\"Invalid Characters in min sum assured Amount \");\n");
      out.write("                document.frm.minsumassured.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(minsumassured)){\n");
      out.write("                 alert('Please Enter valid min sum assured Amount ');\n");
      out.write("                 document.frm.minsumassured.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("         }catch( e)\n");
      out.write("         {  alert(e);\n");
      out.write("            return false;             \n");
      out.write("         }\n");
      out.write("        return true;   \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("<h3>Store Policy Details</h3>\n");
      out.write("<form name=\"policy\" action=\"StorePolicyDetails\" method=\"post\">\n");
      out.write("    ");

            String pname=request.getParameter("provider");
            String result=request.getParameter("result");
            DAO d=new DAO();
            String id=d.getPolicyId();
    
      out.write("    \n");
      out.write("    <table>\n");
      out.write("        <tr><td> Policy Id</td><td><input type=\"text\"  name=\"pid\" readonly value=");
      out.print(id );
      out.write("></td></tr>\n");
      out.write("        <tr><td> Policy No</td><td><input type=\"text\" name=\"no\"></td></tr>\n");
      out.write("        <tr><td> Policy Provider Company Name:</td><td><input type=\"text\" name=\"pname\" value=\"");
      out.print(pname );
      out.write("\" readonly></td></tr>\n");
      out.write("        <tr><td> Minimum entry age</td><td><input type=\"text\" name=\"minage\"></td></tr>\n");
      out.write("        <tr><td> Maximum entry age</td><td><input type=\"text\" name=\"maxage\"></td></tr>\n");
      out.write("        <tr><td> Policy term</td><td><input type=\"text\" name=\"term\">years</td></tr>\n");
      out.write("        <tr><td> Premium paying term</td><td><select name=\"premiumterm\" >\n");
      out.write("                    <option value=\"-1\">-----</option><option value=\"10\">10years</option>\n");
      out.write("            <option value=\"15\">15years</option><option value=\"20\">20years</option>\n");
      out.write("                </select></td></tr> \n");
      out.write("        <tr><td> Premium payment frequency</td><td><select name=\"frequency\">\n");
      out.write("                    <option value=\"-1\">------</option><option value=\"yearly\">Yearly</option>\n");
      out.write("            <option value=\"halfyearly\">Half Yearly</option><option value=\"Quarterly\">Quarterly</option>\n");
      out.write("      <option value=\"Monthly\">Monthly</option><option value=\"daily\">Daily</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("      <tr><td> Amount Paid</td><td><input type=\"text\" name=\"paid\"></td></tr>\n");
      out.write("      <tr><td> Maximum Premium</td><td><input type=\"text\" name=\"maxpremium\"></td></tr>\n");
      out.write("      <tr><td>Maximum Sum Assured</td><td><input type=\"text\" name=\"maxsumassured\"></td></tr>\n");
      out.write("      <tr><td> Minimum Sum Assured</td><td><input type=\"text\" name=\"minsumassured\"></td></tr>\n");
      out.write("      <tr><td align=\"right\"><input type=\"submit\" value=\"submit\"></td><td><input type=\"reset\" value=\"reset\"></td></tr>    \n");
      out.write("</table>\n");
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
