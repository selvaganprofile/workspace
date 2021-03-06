/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.43
 * Generated at: 2017-05-04 14:49:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.api_002ddocs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_html extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Execution Service Documentation</title>\r\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"images/favicon-32x32.png\" sizes=\"32x32\" />\r\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"images/favicon-16x16.png\" sizes=\"16x16\" />\r\n");
      out.write("  <link href='css/typography.css' media='screen' rel='stylesheet' type='text/css'/>\r\n");
      out.write("  <link href='css/reset.css' media='screen' rel='stylesheet' type='text/css'/>\r\n");
      out.write("  <link href='css/screen.css' media='screen' rel='stylesheet' type='text/css'/>\r\n");
      out.write("  <link href='css/reset.css' media='print' rel='stylesheet' type='text/css'/>\r\n");
      out.write("  <link href='css/print.css' media='print' rel='stylesheet' type='text/css'/>\r\n");
      out.write("  <script src='lib/jquery-1.8.0.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/jquery.slideto.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/jquery.wiggle.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/jquery.ba-bbq.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/handlebars-2.0.0.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/js-yaml.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/lodash.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/backbone-min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='swagger-ui.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/highlight.7.3.pack.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/jsoneditor.min.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/marked.js' type='text/javascript'></script>\r\n");
      out.write("  <script src='lib/swagger-oauth.js' type='text/javascript'></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Some basic translations -->\r\n");
      out.write("  <!-- <script src='lang/translator.js' type='text/javascript'></script> -->\r\n");
      out.write("  <!-- <script src='lang/ru.js' type='text/javascript'></script> -->\r\n");
      out.write("  <!-- <script src='lang/en.js' type='text/javascript'></script> -->\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("      var url = window.location.search.match(/url=([^&]+)/);\r\n");
      out.write("      if (url && url.length > 1) {\r\n");
      out.write("        url = decodeURIComponent(url[1]);\r\n");
      out.write("      } else {\r\n");
      out.write("        url = \"/execution-service/1.0/swagger.json\";\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      // Pre load translate...\r\n");
      out.write("      if(window.SwaggerTranslator) {\r\n");
      out.write("        window.SwaggerTranslator.translate();\r\n");
      out.write("      }\r\n");
      out.write("      window.swaggerUi = new SwaggerUi({\r\n");
      out.write("        url: url,\r\n");
      out.write("        validatorUrl : null,\r\n");
      out.write("\t\tbasePath: \"execution-service/1.0/\",\r\n");
      out.write("        dom_id: \"swagger-ui-container\",\r\n");
      out.write("        supportedSubmitMethods: ['get', 'post', 'put', 'delete', 'patch'],\r\n");
      out.write("        onComplete: function(swaggerApi, swaggerUi){\r\n");
      out.write("          if(typeof initOAuth == \"function\") {\r\n");
      out.write("            /*initOAuth({\r\n");
      out.write("              clientId: \"your-client-id\",\r\n");
      out.write("              clientSecret: \"your-client-secret-if-required\",\r\n");
      out.write("              realm: \"your-realms\",\r\n");
      out.write("              appName: \"your-app-name\",\r\n");
      out.write("              scopeSeparator: \",\",\r\n");
      out.write("              additionalQueryStringParams: {}\r\n");
      out.write("            });*/\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if(window.SwaggerTranslator) {\r\n");
      out.write("            window.SwaggerTranslator.translate();\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          addApiKeyAuthorization();\r\n");
      out.write("        },\r\n");
      out.write("        onFailure: function(data) {\r\n");
      out.write("          log(\"Unable to Load SwaggerUI\");\r\n");
      out.write("        },\r\n");
      out.write("        docExpansion: \"none\",\r\n");
      out.write("        jsonEditor: false,\r\n");
      out.write("        apisSorter: \"alpha\",\r\n");
      out.write("        defaultModelRendering: 'schema',\r\n");
      out.write("        showRequestHeaders: false\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      function addApiKeyAuthorization(){\r\n");
      out.write("        var key = encodeURIComponent($('#input_apiKey')[0].value);\r\n");
      out.write("        if(key && key.trim() != \"\") {\r\n");
      out.write("            var apiKeyAuth = new SwaggerClient.ApiKeyAuthorization(\"api_key\", key, \"query\");\r\n");
      out.write("            window.swaggerUi.api.clientAuthorizations.add(\"api_key\", apiKeyAuth);\r\n");
      out.write("            log(\"added key \" + key);\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      $('#input_apiKey').change(addApiKeyAuthorization);\r\n");
      out.write("\r\n");
      out.write("      // if you have an apiKey you would like to pre-populate on the page for demonstration purposes...\r\n");
      out.write("      /*\r\n");
      out.write("        var apiKey = \"myApiKeyXXXX123456789\";\r\n");
      out.write("        $('#input_apiKey').val(apiKey);\r\n");
      out.write("      */\r\n");
      out.write("\r\n");
      out.write("      window.swaggerUi.load();\r\n");
      out.write("\r\n");
      out.write("      function log() {\r\n");
      out.write("        if ('console' in window) {\r\n");
      out.write("          console.log.apply(console, arguments);\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("  });\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"swagger-section\">\r\n");
      out.write("<div id='header'>\r\n");
      out.write("  <div class=\"swagger-ui-wrap\">\r\n");
      out.write("    <a id=\"logo\" href=\"http://swagger.io\"><span class=\"logo__title\">Execution Service Documentation</span></a>\r\n");
      out.write("    <!--<form id='api_selector'>\r\n");
      out.write("      <div class='input'><input placeholder=\"http://example.com/api\" id=\"input_baseUrl\" name=\"baseUrl\" type=\"text\"/></div>\r\n");
      out.write("      <div class='input'><input placeholder=\"api_key\" id=\"input_apiKey\" name=\"apiKey\" type=\"text\"/></div>\r\n");
      out.write("      <div class='input'><a id=\"explore\" href=\"#\" data-sw-translate>Explore</a></div>\r\n");
      out.write("    </form> -->\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"message-bar\" class=\"swagger-ui-wrap\" data-sw-translate>&nbsp;</div>\r\n");
      out.write("<div id=\"swagger-ui-container\" class=\"swagger-ui-wrap\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
