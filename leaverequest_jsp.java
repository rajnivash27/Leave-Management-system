/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-10-21 11:39:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leaverequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>HomePage</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background-image: url(\"images.jpg\");\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("   /* Full height */\r\n");
      out.write("  height: 100%;\r\n");
      out.write("\r\n");
      out.write("  /* Center and scale the image nicely */\r\n");
      out.write("  background-position: center;\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("  display: block;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  width: 25%;\r\n");
      out.write("  margin-bottom:0px;\r\n");
      out.write("}\r\n");
      out.write(".cright{\r\n");
      out.write("padding:0 51rem 0;\r\n");
      out.write("margin:0px;\r\n");
      out.write("width:200%;\r\n");
      out.write("}\r\n");
      out.write("table{\r\n");
      out.write("display:flex;\r\n");
      out.write("padding: 0 0 0 470px\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("td{\r\n");
      out.write("padding:5px;\r\n");
      out.write("}\r\n");
      out.write("form{\r\n");
      out.write("text-align:center;\r\n");
      out.write("}\r\n");
      out.write("#fileclass{\r\n");
      out.write("visibility:hidden;\r\n");
      out.write("}\r\n");
      out.write("#lopclass{\r\n");
      out.write("visibility:hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function leavefor(){\r\n");
      out.write("	if (document.getElementById('Casual').checked) {\r\n");
      out.write("        document.getElementById('lopclass').style.visibility = 'visible';\r\n");
      out.write("        document.getElementById('fileclass').style.visibility ='hidden' ;\r\n");
      out.write("    }\r\n");
      out.write("	if (document.getElementById('Sick').checked) {\r\n");
      out.write("        document.getElementById('lopclass').style.visibility = 'hidden';\r\n");
      out.write("        document.getElementById('fileclass').style.visibility = 'visible';\r\n");
      out.write("    }    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateEmail() {\r\n");
      out.write("    var emailID = document.myForm.eMail.value;\r\n");
      out.write("    atpos = emailID.indexOf(\"@\");\r\n");
      out.write("    dotpos = emailID.lastIndexOf(\".\");\r\n");
      out.write("    \r\n");
      out.write("    if (atpos < 1 || ( dotpos - atpos < 2 )) {\r\n");
      out.write("       alert(\"Please enter correct email ID\")\r\n");
      out.write("       document.myForm.eMail.focus() ;\r\n");
      out.write("       return false;\r\n");
      out.write("    }\r\n");
      out.write("    return( true );\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("function DateCheck(){\r\n");
      out.write("	var firstDate = document.myForm.startdate.value;\r\n");
      out.write("	var endDate = document.myForm.enddate.value;\r\n");
      out.write("	var sDate = new Date(firstDate);\r\n");
      out.write("	var eDate = new Date(endDate);\r\n");
      out.write("    \r\n");
      out.write("	if(firstDate !='' && endDate !='' && sDate > eDate){\r\n");
      out.write("		alert(\"End Date should be greater then or equal to start date\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	var Difference_In_Time = eDate.getTime() - sDate.getTime();\r\n");
      out.write("	var Difference_In_Days = (Difference_In_Time / (1000 * 3600 * 24)) + 1;\r\n");
      out.write("	document.myForm.nod.value = Difference_In_Days;\r\n");
      out.write("	if(Difference_In_Days > 5){\r\n");
      out.write("		if(eDate.getMonth() == sDate.getMonth()){\r\n");
      out.write("			var lossmath = 20000/30;\r\n");
      out.write("			var lossofpay = Math.round(lossmath * Difference_In_Days);\r\n");
      out.write("			document.myForm.lop.value = lossofpay;\r\n");
      out.write("		}else{\r\n");
      out.write("			document.myForm.lop.value = 0;\r\n");
      out.write("		}\r\n");
      out.write("	}else{\r\n");
      out.write("		document.myForm.lop.value = 0;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("function Mobnocheck(){\r\n");
      out.write("	var emgno =  document.myForm.emg.value \r\n");
      out.write("	if (document.myForm.emg.value.length != 10 ){           \r\n");
      out.write("            alert( \"Please provide a emg in the format ##########.\" );\r\n");
      out.write("            return false;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img src=\"https://www.pngkey.com/png/full/209-2096342_generic-episode-image-gavs-technologies-logo.png\" alt=\"Gavs Logo\">\r\n");
      out.write("<h2 class=\"cright\">&copy;</h2>\r\n");
      out.write(" <form action=\"Data_insertdB\" method=\"post\" name = \"myForm\" enctype =\"multipart/form-data\">\r\n");
      out.write("         <table cellspacing = \"2\" cellpadding = \"2\" border = \"1\">\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <th colspan ='2'>Leave Request Management System</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">EmpName</td>\r\n");
      out.write("               <td><input type = \"text\" name = \"eName\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">EmpId</td>\r\n");
      out.write("               <td><input type = \"number\" name = \"eid\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">MailId</td>\r\n");
      out.write("               <td><input type = \"text\" name = \"eMail\" onchange=\"validateEmail()\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">EmgMobileNo</td>\r\n");
      out.write("               <td><input type = \"number\" name = \"emg\" onchange= \"Mobnocheck()\" max = \"9999999999\" min = \"1111111111\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">LeaveFrom</td>\r\n");
      out.write("               <td><input type = \"date\" name = \"startdate\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">LeaveTo</td>\r\n");
      out.write("               <td><input type = \"date\" name = \"enddate\" onchange= \"DateCheck()\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">NoOfDays</td>\r\n");
      out.write("               <td><input type = \"number\" name = \"nod\" required readonly/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\">Reason</td>\r\n");
      out.write("               <td><input type = \"text\" name = \"reason\" required/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align=\"right\">type_of_leave</td>\r\n");
      out.write("               <td>\r\n");
      out.write("               Casual Leave<input type=\"radio\" onclick=\"leavefor()\" id=\"Casual\" name=\"leavemode\" value=\"Casual Leave\" />\r\n");
      out.write("               Sick Leave<input type=\"radio\" onclick=\"leavefor()\" id=\"Sick\" name=\"leavemode\" value=\"Sick Leave\"/>\r\n");
      out.write("               </td></tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr id=\"lopclass\">\r\n");
      out.write("            <td>LossOfPay: </td>\r\n");
      out.write("            <td><input type =\"number\" id=\"lop\" name=\"lop\" readonly/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr id=\"fileclass\">\r\n");
      out.write("            <td> Upload Your Medical file: </td>\r\n");
      out.write("            <td><input type=\"file\" id=\"fileload\" name=\"fileload\"  accept=\"image/jpeg,image/x-png\" data-max-size=\"20000\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("                       \r\n");
      out.write("            <tr>\r\n");
      out.write("               <td align = \"right\"></td>\r\n");
      out.write("               <td colspan='2' ><input type = \"submit\" value = \"Submit\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("         </table>\r\n");
      out.write("      </form>  \r\n");
      out.write("      <form action=\"Report.jsp\" method=\"get\" name = form1>\r\n");
      out.write("				<input type=\"submit\" value=\"Show Report\">\r\n");
      out.write("			</form>    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}