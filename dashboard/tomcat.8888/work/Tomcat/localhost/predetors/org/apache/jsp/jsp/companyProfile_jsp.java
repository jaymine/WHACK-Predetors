/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2016-11-26 08:13:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

public final class companyProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.LinkedHashMap");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.ArrayList");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <title>Exito</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body ng-app=\"DeploymentMonitor\"  ng-controller=\"AppCtrl\" ng-cloak >\n");
      out.write("<div layout=\"column\" layout-align=\"center center\">\n");
      out.write("\n");
      out.write("<md-subheader class=\"md-primary\" ng-style=\"{width:'100%','left-padding':'50'}\">Company profile</md-subheader>\n");
      out.write("\n");
      out.write("<div layout=\"row\" layout-align=\"space-around center\">\n");
      out.write("<h2>");
      out.print( request.getParameter("name"));
      out.write("</h2>\n");
      out.write("\n");
      out.write(" <md-button md-no-ink class=\"md-raised md-warn\" layout layout-align=\"end center\">\n");
      out.write(" <span>Predicted Time to become a customer<br> 145 </span>\n");
      out.write(" </md-button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <md-content ng-style=\"{'width':'85%', 'boarder':'5px solid grey'}\">\n");
      out.write("     <md-tabs md-dynamic-height md-border-bottom>\n");
      out.write("      <md-tab label=\"Suggestions\">\n");
      out.write("         <md-content class=\"md-padding\">\n");
      out.write("           <h2 class=\"md-display-2\">Suggestions</h2>\n");
      out.write("           <p>Invite to Wso2 IS mobile connector webinar </p>\n");
      out.write("           <p>Send a mail attaching How to configure WSO2 IS mobile connector white paper</p>\n");
      out.write("           <p>Send a mail attaching How to configure WSO2 SAML metadata white paper</p>\n");
      out.write("           <p>Send a mail attaching How to configure travelocity SAML configuration white paper</p>\n");
      out.write("         </md-content>\n");
      out.write("      </md-tab>\n");
      out.write("       <md-tab label=\"Recent Activities\">\n");
      out.write("            <md-content class=\"md-padding\">\n");
      out.write("              <h2 class=\"md-display-2\">Recent Activities</h2>\n");
      out.write("              <p>\"john@zooyork.com\"Download Wso2 IS 5.2.0 </p>\n");
      out.write("              <p>\"elizabeth@zooyork.com\":Visited White paper: How to configure SAML Service Provider</p>\n");
      out.write("              <p>\"farrok@zooyork.com\":Visited White paper: How to configure SAML Identity Provider</p>\n");
      out.write("              <p>\"hannah@zooyork.com\":Attended Webinar on LDAP user store</p>\n");
      out.write("              <p>\"johny@zooyork.com\":Download Wso2 API mannager</p>\n");
      out.write("            </md-content>\n");
      out.write("       </md-tab>\n");
      out.write("       <md-tab label=\"BANT USERS\">\n");
      out.write("         <md-content class=\"md-padding\">\n");
      out.write("           <h2 class=\"md-display-2\">BANT qualified Users</h2>\n");
      out.write("           <p>john@zooyork.com </p>\n");
      out.write("           <p>farook@zooyork.com </p>\n");
      out.write("           <p>nathasha@zooyork.com </p>\n");
      out.write("           <p>sammy@zooyork.com </p>\n");
      out.write("           <p>bravo@zooyork.com </p>\n");
      out.write("         </md-content>\n");
      out.write("       </md-tab>\n");
      out.write("       <md-tab label=\"SQL USERS\">\n");
      out.write("         <md-content class=\"md-padding\">\n");
      out.write("           <h2 class=\"md-display-2\">SQL Users</h2>\n");
      out.write("            <p>phelix@zooyork.com </p>\n");
      out.write("                       <p>camaron@zooyork.com </p>\n");
      out.write("                       <p>hilaria@zooyork.com </p>\n");
      out.write("                       <p>jane@zooyork.com </p>\n");
      out.write("                       <p>colron@zooyork.com </p>\n");
      out.write("         </md-content>\n");
      out.write("       </md-tab>\n");
      out.write("       <md-tab label=\"RAW LEADS\">\n");
      out.write("         <md-content class=\"md-padding\">\n");
      out.write("           <h2 class=\"md-display-2\">Raw LEADS</h2>\n");
      out.write("           <p>silvia@zooyork.com </p>\n");
      out.write("                      <p>sharuk@zooyork.com </p>\n");
      out.write("                      <p>ashen@zooyork.com </p>\n");
      out.write("                      <p>jaynthi@zooyork.com </p>\n");
      out.write("                      <p>jehan@zooyork.com </p>\n");
      out.write("         </md-content>\n");
      out.write("       </md-tab>\n");
      out.write("     </md-tabs>\n");
      out.write("   </md-content>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Angular Material requires Angular.js Libraries -->\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js\"></script>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-animate.min.js\"></script>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-aria.min.js\"></script>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-messages.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Angular Material Library -->\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Angular Graphs-->\n");
      out.write("<script src=\"http://static.fusioncharts.com/code/latest/fusioncharts.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/angular-fusioncharts.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- bootstrap  -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        var deploymentMonitor = angular.module('DeploymentMonitor', ['ngMaterial','ng-fusioncharts']);\n");
      out.write("\n");
      out.write("        deploymentMonitor.controller('AppCtrl', function($scope, $mdDialog) {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
