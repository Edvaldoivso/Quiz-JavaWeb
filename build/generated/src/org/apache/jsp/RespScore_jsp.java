package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RespScore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"principal.css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Score Final do Jogo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div id=\"Home\"> \n");
      out.write("            \n");
      out.write("        \n");
      out.write("         <div id=\"Jogo\">\n");
      out.write("             ");

                 /*
          Principal Funcao = new Principal();
          String pontos = request.getParameter("Pontos");
          Float Pontuacao = Float.parseFloat(pontos) ;
          String nome = request.getParameter("Nome");
                     */
          
          int Pontuacao = 7;
         String nome = "João yu";
          
if(Pontuacao < 3){    
    
    
    
}else if(Pontuacao >3 || Pontuacao <7){
             
    
}else if(Pontuacao >7){
   
}



      out.write("              <div id=\"ScoreFinal\">\n");
      out.write("    \n");
      out.write("              <h1>");
      out.print(nome);
      out.write(",sua pontuação foi ,");
      out.print(Pontuacao);
      out.write(" </h1> \n");
      out.write("              ");
  out.print("Este é um teste com outPrint");
      out.write("\n");
      out.write("              \n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("              </br>\n");
      out.write("              </br>\n");
      out.write("           <a href=\"index.html\">JOGAR NOVAMENTE !</a>\n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("    </body>\n");
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
