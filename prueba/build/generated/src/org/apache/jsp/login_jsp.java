package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Login</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.8/css/solid.css\">\n");
      out.write("    <script src=\"https://use.fontawesome.com/releases/v5.0.7/js/all.js\"></script>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\" th:href=\"@{/css/index.css}\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"modal-dialog text-center\">\n");
      out.write("        <div class=\"col-sm-11 main-section\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("   \t\t\t\t<div class=\"col-12 user-img\">\n");
      out.write("                    <img src=\"logo1.jpg\" th:src=\"@{/img/user.png}\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-15 titulo\">\n");
      out.write("                    <h1>Iniciar Sesion</h1>\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("                <form class=\"col-12\">\n");
      out.write("                    <div class=\"form-group\" id=\"user-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Nombre de usuario\" name=\"username\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"contrasena-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Contraseña\" name=\"password\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 forgot\">\n");
      out.write("                    \t<a href=\"contraseña.jsp\">¿Olvidaste la contraseña?</a>\n");
      out.write("            \t\t</div>\n");
      out.write("                    <a href=\"otro.html\" type=\"submit\" class=\"btn btn-primary col-12 button\" role=\"button\" aria-pressed=\"true\"><i class=\"fas fa-sign-in-alt\"></i> Ingresar</a>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        \t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\t\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
