package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"erros.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("Jogo De Onde Vem?\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Que Bicho é esse?</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"principal.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"Corpo\">   \r\n");
      out.write("        \r\n");
      out.write("            <div id=\"Home\"> \r\n");
      out.write("            \r\n");
      out.write("                <p id=\"Mensagem\">Que Bicho &eacute; esse ?</p>\r\n");
      out.write("               <form method=\"POST\" action=\"Jogo.jsp\">  \r\n");
      out.write("               <label for=\"nome\">COLOQUE SEU NOME AI DO LADO RECRUTA\r\n");
      out.write("                <input type=\"text\" name=\"nome\" id=\"nome\" >  \r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-light btn btn-primary btn-md\" value=\"COMEÇAR JÁ!\">\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                <br/>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 <br/>\r\n");
      out.write("               \r\n");
      out.write("                  \r\n");
      out.write("                <br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"Animacao\">\r\n");
      out.write("                   <figure>\r\n");
      out.write("                    <img src=\"inicio2.jpg\">\r\n");
      out.write("                </figure>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div id=\"Jogo\">\r\n");
      out.write("                <div id=\"Imagem\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>  \r\n");
      out.write("                \r\n");
      out.write("                <div id=\"Questoes\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                        \r\n");
      out.write("                        <p>Vem o formulÃ¡rio</p>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"Next\">\r\n");
      out.write("                    <figure >\r\n");
      out.write("                        <img src=\"next.png\" class=\"next\" alt=\"Proxima QuestÃ£o\" onclick=\"Next() , Questao()\">\r\n");
      out.write("                    </figure>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("    <!--Verificação dos Dados em Cookie se existir ela já manda para o jogo-->    \r\n");
      out.write("        \r\n");
      out.write("         ");

         String usuario = request.getParameter("nome");//Pegou a string
         Cookie[] cookie = request.getCookies();//Criou um array de Cookie e valores
            for(Cookie atual : cookie){//Verifica cada um dos cookies 
                if(atual.getName().equals("Usuario")){//compara se existe algum oara o Usuário
                  usuario = atual.getValue();//Insere novamente na variavel o valor do Cookie
                    response.sendRedirect("Jogo.jsp");//Manda Direto para o Jogo
                    
                }
            }
           
                
          
            
      
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         <script>\r\n");
      out.write("                        \r\n");
      out.write("                     function Show(){\r\n");
      out.write("                         var ValNome = document.getElementById(\"Valor\").value\r\n");
      out.write("                            if(ValNome == \"\"){\r\n");
      out.write("                                alert(\"Falta o Nome\");\r\n");
      out.write("                             }else{\r\n");
      out.write("                           document.getElementById(\"Home\").style.display = \"none\"; \r\n");
      out.write("                           \r\n");
      out.write("                   } \r\n");
      out.write("               }\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               function Next(){\r\n");
      out.write("                       console.log(\"Next Press\");\r\n");
      out.write("               }\r\n");
      out.write("               \r\n");
      out.write("                var numero=0;\r\n");
      out.write("              function Questao(){\r\n");
      out.write("                  \r\n");
      out.write("                  var imagem = [\"Cavalo\",\"Boi\",\"Sapao\",\"Kiwi\",\"Lemure\"];\r\n");
      out.write("                  \r\n");
      out.write("                  for(questao = 0; questao < 9; questao++){\r\n");
      out.write("                      \r\n");
      out.write("                    document.getElementById(\"Imagem\").innerHTML = imagem;\r\n");
      out.write("                    \r\n");
      out.write("                    console.log(numero);\r\n");
      out.write("                  }\r\n");
      out.write("                   \r\n");
      out.write("                  if(numero >= 1){\r\n");
      out.write("                      window.location.href = \"RespScore.jsp\";\r\n");
      out.write("                      \r\n");
      out.write("                  }\r\n");
      out.write("                  numero++;\r\n");
      out.write("              }\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("                    </script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
