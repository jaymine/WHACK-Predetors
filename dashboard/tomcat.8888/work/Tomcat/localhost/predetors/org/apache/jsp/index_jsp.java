/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2016-11-26 09:20:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <md-content class=\"md-padding\" flex>\n");
      out.write("\n");
      out.write("        <div layout=\"row\" layout-align=\"space-between center\">\n");
      out.write("\n");
      out.write("                <h1>Intelligent Marketing </h1>\n");
      out.write("\n");
      out.write("                <md-nav-bar md-selected-nav-item=\"currentNavItem\" nav-bar-aria-label=\"navigation links\">\n");
      out.write("                  <md-nav-item md-nav-click=\"goto('home')\" name=\"index.html\" class=\"md-secondary\">\n");
      out.write("                    <span ng-style=\"{color:'#e3e5ef'}\" >\n");
      out.write("                    HOME\n");
      out.write("                    </span>\n");
      out.write("                  </md-nav-item>\n");
      out.write("                  <md-nav-item md-nav-click=\"goto('bant')\" name=\"jsp/pageBANT.jsp\" class=\"md-secondary\">\n");
      out.write("                      <span ng-style=\"{color:'#e3e5ef'}\">\n");
      out.write("                      BANT\n");
      out.write("                      </span>\n");
      out.write("                  </md-nav-item>\n");
      out.write("                  <md-nav-item md-nav-click=\"goto('sql')\" name=\"jsp/pageSQL.jsp\" class=\"md-secondary\">\n");
      out.write("                      <span ng-style=\"{color:'#e3e5ef'}\">\n");
      out.write("                      SQL\n");
      out.write("                      </span>\n");
      out.write("                  </md-nav-item>\n");
      out.write("                  <md-nav-item md-nav-click=\"goto('raw')\" name=\"jsp/pageRAWLEAD.jsp\" class=\"md-secondary\">\n");
      out.write("                      <span ng-style=\"{color:'#e3e5ef'}\">\n");
      out.write("                      RAW LEAD\n");
      out.write("                      </span>\n");
      out.write("                  </md-nav-item>\n");
      out.write("                </md-nav-bar>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </md-content>\n");
      out.write("\n");
      out.write("     <div class=\"ext-content\" id=\"content\" style=\"width:100%; height: 100%;\">\n");
      out.write("         <object type=\"text/html\" data=\"jsp/pageHome.jsp\" style=\"width:100%; height: 100%;\"></object>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("    <!-- footer-->\n");
      out.write("     <div layout=\"row\" layout-align=\"space-between end\">\n");
      out.write("         <md-content class=\"md-padding\" flex>\n");
      out.write("            <md-nav-bar md-selected-nav-item=\"currentNavItem1\" nav-bar-aria-label=\"navigation links\">\n");
      out.write("            </md-nav-bar>\n");
      out.write("         </md-content>\n");
      out.write("     </div>\n");
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
      out.write("<!-- bootstrap  -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        var deploymentMonitor = angular.module('DeploymentMonitor', ['ngMaterial']);\n");
      out.write("\n");
      out.write("        deploymentMonitor.controller('AppCtrl', function($scope, $mdDialog) {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("              $scope.indexpage =\n");
      out.write("              '<object type=\"text/html\" data=\"jsp/pageHome.jsp\" style=\"width:100%; height: 100%;\"></object>';\n");
      out.write("              $scope.bantpage =\n");
      out.write("              '<span><object type=\"text/html\" data=\"jsp/pageBANT.jsp\" style=\"width:100%; height: 100%;\"></object></span>';\n");
      out.write("              $scope.sqlpage =\n");
      out.write("              '<span><object type=\"text/html\" data=\"jsp/pageSQL.jsp\" style=\"width:100%; height: 100%;\"></object></span>';\n");
      out.write("              $scope.rawleadpage =\n");
      out.write("              '<span><object type=\"text/html\" data=\"jsp/pageRAWLEAD.jsp\" style=\"width:100%; height: 100%;\"></object></span>';\n");
      out.write("\n");
      out.write("              $scope.goto = function(pageName) {\n");
      out.write("                if (pageName == 'home') {\n");
      out.write("                    document.getElementById(\"content\").innerHTML= $scope.indexpage;\n");
      out.write("                }\n");
      out.write("                if (pageName == 'bant') {\n");
      out.write("                    document.getElementById(\"content\").innerHTML= $scope.bantpage;\n");
      out.write("                }\n");
      out.write("                if (pageName == 'sql') {\n");
      out.write("                    document.getElementById(\"content\").innerHTML= $scope.sqlpage;\n");
      out.write("                }\n");
      out.write("                if (pageName == 'raw') {\n");
      out.write("                    document.getElementById(\"content\").innerHTML= $scope.rawleadpage;\n");
      out.write("                }\n");
      out.write("              }\n");
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
