/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2016-11-26 06:29:44 UTC
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

public final class listSortbyCountry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div layout=\"raw\" layout-align=\"center\">\n");
      out.write("\n");
      out.write("<md-sidenav\n");
      out.write("        class=\"md-sidenav-left\"\n");
      out.write("        md-component-id=\"left\"\n");
      out.write("        md-is-locked-open=\"$mdMedia('gt-md')\"\n");
      out.write("        md-whiteframe=\"4\">\n");
      out.write("\n");
      out.write("      <md-toolbar class=\"md-theme-indigo\" ng-style=\"{color:'#638980'}\">\n");
      out.write("        <h2 class=\"md-toolbar-tools\">Filter by</h2>\n");
      out.write("      </md-toolbar>\n");
      out.write("      <div layout=\"column\" layout-align=\"space-between start\">\n");
      out.write("        <md-button  class=\"md-primary\" ng-click = \"toMap()\">\n");
      out.write("          Country\n");
      out.write("        </md-button>\n");
      out.write("        <md-button  class=\"md-primary\">\n");
      out.write("          Networth <input type=\"text\" ng-style=\"{width:'50px'}\"}/> to <input type=\"text\" ng-style=\"{width:'50px'}\"/>\n");
      out.write("        </md-button>\n");
      out.write("      </div>\n");
      out.write("      <md-toolbar class=\"md-theme-indigo\" ng-style=\"{color:'#638980'}\">\n");
      out.write("          <h2 class=\"md-toolbar-tools\">Display</h2>\n");
      out.write("      </md-toolbar>\n");
      out.write("      <div layout=\"column\" layout-align=\"space-between start\">\n");
      out.write("          <md-button  class=\"md-primary\" ng-click=\"toList()\">\n");
      out.write("             View All\n");
      out.write("          </md-button>\n");
      out.write("      </div>\n");
      out.write("</md-sidenav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<fusioncharts\n");
      out.write("    width=\"800\"\n");
      out.write("    height=\"600\"\n");
      out.write("    type=\"mscombi2d\"\n");
      out.write("    datasource=\"{{DataSource}}\"\n");
      out.write("></fusioncharts>\n");
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
      out.write("            $scope.toMap = function(){\n");
      out.write("                window.location = 'countryMap.jsp';\n");
      out.write("            }\n");
      out.write("            $scope.toList = function(){\n");
      out.write("                window.location = 'companyList.jsp';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            $scope.DataSource = {\n");
      out.write("                            chart: {\n");
      out.write("                                caption: 'Customer Prediction for ");
      out.print( request.getParameter("countryName"));
      out.write("',\n");
      out.write("                                subcaption: \"For Quarters\",\n");
      out.write("                                xaxisname: \"Quarter\",\n");
      out.write("                                yaxisname: \"Number of Customers\",\n");
      out.write("                                numberprefix: \"\",\n");
      out.write("                                theme: \"ocean\"\n");
      out.write("                            },\n");
      out.write("                            categories: [\n");
      out.write("                                {\n");
      out.write("                                    category: [\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Oct '15\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Jan '16\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Apr '16\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Jul '16\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Oct '16\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Jan '17\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Apr '17\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            label: \"Jul '17\"\n");
      out.write("                                        }\n");
      out.write("                                    ]\n");
      out.write("                                }\n");
      out.write("                            ],\n");
      out.write("                            dataset: [\n");
      out.write("                                {\n");
      out.write("                                    seriesname: \"Predicted Customers\",\n");
      out.write("                                    data: [\n");
      out.write("                                        {\n");
      out.write("                                            value: \"21\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"11\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"6\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"8\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"23\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"13\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"5\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"7\"\n");
      out.write("                                        }\n");
      out.write("                                    ]\n");
      out.write("                                },\n");
      out.write("                                {\n");
      out.write("                                    seriesname: \"Actual Customers\",\n");
      out.write("                                    renderas: \"line\",\n");
      out.write("                                    showvalues: \"0\",\n");
      out.write("                                    data: [\n");
      out.write("                                        {\n");
      out.write("                                            value: \"17\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"10\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"5\"\n");
      out.write("                                        },\n");
      out.write("                                        {\n");
      out.write("                                            value: \"7\"\n");
      out.write("                                        }\n");
      out.write("\n");
      out.write("                                    ]\n");
      out.write("                                }\n");
      out.write("                            ]\n");
      out.write("                        };\n");
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