package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MI.DAO;

public final class StoreLoanDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        var sbi=document.frm.period.value;\n");
      out.write("        var axixs=document.frm.interest.value;\n");
      out.write("        var sbh=document.frm.amount.value;   \n");
      out.write("        var emi=document.frm.emi.value; \n");
      out.write("        var fee=document.frm.fee.value; \n");
      out.write("         try{ \n");
      out.write("              if(document.frm.loantype.value==\"-1\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please select Loan Type\"); \n");
      out.write("\t\t\tdocument.frm.loantype.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}             \n");
      out.write("            else if(document.frm.period.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Maximum loan period\"); \n");
      out.write("\t\t\tdocument.frm.period.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(sbi))) {\n");
      out.write("                alert(\"Invalid Characters in Maximum loan period\");\n");
      out.write("                document.frm.period.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(sbi)){\n");
      out.write("                 alert('Please Enter valid Maximum loan period');\n");
      out.write("                 document.frm.period.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            if(document.frm.interest.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Amount For Rate of interest\"); \n");
      out.write("\t\t\tdocument.frm.interest.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(axixs))) {\n");
      out.write("                alert(\"Invalid Characters in Rate Of Interest\");\n");
      out.write("                document.frm.interest.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(axixs)){\n");
      out.write("                 alert('Please Enter valid Rate of interest');\n");
      out.write("                 document.frm.interest.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            else if(document.frm.amount.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Sanctioned Amount\"); \n");
      out.write("\t\t\tdocument.frm.amount.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(sbh))) {\n");
      out.write("                alert(\"Invalid Characters in sanctioned Amount \");\n");
      out.write("                document.frm.amount.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(sbh)){\n");
      out.write("                 alert('Please Enter valid Amount ');\n");
      out.write("                 document.frm.amount.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("           else if(document.frm.emi.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter EMI Amount\"); \n");
      out.write("\t\t\tdocument.frm.emi.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(emi))) {\n");
      out.write("                alert(\"Invalid Characters in Emi Amount \");\n");
      out.write("                document.frm.emi.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(emi)){\n");
      out.write("                 alert('Please Enter valid Emi Amount ');\n");
      out.write("                 document.frm.emi.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("           else if(document.frm.fee.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please enter Processing Fee Amount\"); \n");
      out.write("\t\t\tdocument.frm.fee.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("            else if(!(isNumeric(fee))) {\n");
      out.write("                alert(\"Invalid Characters in Processing Fee Amount \");\n");
      out.write("                document.frm.fee.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(isNaN(fee)){\n");
      out.write("                 alert('Please Enter valid Processing Fee Amount ');\n");
      out.write("                 document.frm.fee.focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            else if(document.frm.charges.value==\"-1\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" Please select Hidden Charges \"); \n");
      out.write("\t\t\tdocument.frm.charges.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t  \t}\n");
      out.write("         }catch( e)\n");
      out.write("         {  alert(e);\n");
      out.write("            return false;             \n");
      out.write("         }\n");
      out.write("        return true;   \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("<h3>Store Loan Details</h3>\n");
      out.write("<form name=\"frm\" action=\"StoreLoanDetails\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("    ");

            String bank=request.getParameter("bank");
            String result=request.getParameter("result");
            DAO d=new DAO();
            String id=d.getLoanId();            
    
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr><td>Loan Type</td><td><select name=\"loantype\" >\n");
      out.write("            <option value=\"housing loan\" >Housing Loan</option>\n");
      out.write("                        <option value=\"-1\">-----------</option>\n");
      out.write("                        <option value=\"car loan\">Car Loan</option>\n");
      out.write("                        <option value=\"education loan\">Education Loan</option>\n");
      out.write("                        <option value=\"gold loan\">Gold Loan</option></select>\n");
      out.write("            </td></tr>\n");
      out.write("        <tr><td>Bank Name:</td><td><input type=\"text\" name=\"bank\" readonly value=");
      out.print(bank );
      out.write("> </td></tr>\n");
      out.write("        <tr><td>Loan Id:</td><td><input type=\"text\" name=\"lid\" readonly value=");
      out.print(id );
      out.write("> </td></tr>\n");
      out.write("        <tr><td>Maximum Loan Period</td><td><input type=\"text\" name=\"period\">years</td></tr>\n");
      out.write("        <tr><td>Rate Of Interest</td><td><input type=\"text\" name=\"interest\"></td></tr>\n");
      out.write("        <tr><td>Amount sanctioned upto</td><td><input type=\"text\" name=\"amount\">lacks</td></tr>\n");
      out.write("        <tr><td>EMI</td><td><input type=\"text\" name=\"emi\"></td></tr>\n");
      out.write("        <tr><td>Processing Fee </td><td><input type=\"text\" name=\"fee\">of loan amount</td></tr>\n");
      out.write("        <tr><td>Hidden Charges</td><td><select name=\"charges\">\n");
      out.write("                    <option value=\"-1\">----</option><option value=\"no\" selected>No</option>\n");
      out.write("                    <option value=\"yes\">Yes</option></select></td></tr>\n");
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
