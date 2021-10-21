package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Jogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Iniciando JOGO</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"principal.css\" />\n");
      out.write("    </head>     \n");
      out.write("        \n");
      out.write("         ");

          //Salva os dados para Cookies da Página.
            
            String usuario = request.getParameter("nome");
            if(usuario != null){
            Cookie cookie = new Cookie("Usuario",usuario);//Istanciou o Cookie
             cookie.setMaxAge(60*60);//Definindo a permanencia  no Storange
             response.addCookie(cookie);//Salvou o Cookie
              
        }
        
       
        
        
      out.write(" \n");
      out.write("  \n");
      out.write("        <body>\n");
      out.write("        <div id=\"Corpo\">   \n");
      out.write("        \n");
      out.write("                       \n");
      out.write("            <div id=\"Jogo\">\n");
      out.write("                <div id=\"Imagem\">\n");
      out.write("                    \n");
      out.write("                    <figure>\n");
      out.write("                                            \n");
      out.write("                    </figure>\n");
      out.write("                    \n");
      out.write("                </div>  \n");
      out.write("                \n");
      out.write("                <div id=\"Questoes\">\n");
      out.write("                    <form>\n");
      out.write("                        \n");
      out.write("                        <p id=\"Mensagem\">");
      out.print(usuario);
      out.write("Inicie do Jogo !</p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div id=\"Next\">\n");
      out.write("                    <figure >\n");
      out.write("                        <img src=\"next.png\" class=\"next\" alt=\"Proxima QuestÃ£o\" onclick=\"NextPage() , Questao()\">\n");
      out.write("                    </figure>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <script>\n");
      out.write("                        \n");
      out.write("                                   \n");
      out.write("               function NextPage(){\n");
      out.write("                       console.log(\"Next Press\");\n");
      out.write("                        window.location.href = \"Pag01.jsp\";\n");
      out.write("                       \n");
      out.write("               }\n");
      out.write("               \n");
      out.write("                             \n");
      out.write("               \n");
      out.write("                    </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("</html>\n");
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
