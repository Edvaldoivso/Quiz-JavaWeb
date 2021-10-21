/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author edval
 */
@WebServlet(name = "Gerenciador", urlPatterns = {"/Gerenciador"})
public class Rank extends HttpServlet {
    
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      
        GerenciaDados dados = new GerenciaDados();
        HttpSession session =  request.getSession();       
        String questao1 = (String)session.getAttribute("questao1");
        String questao2 = (String) session.getAttribute("questao2");
        String questao3 = (String) session.getAttribute("questao3");
        String questao4 = (String) session.getAttribute("questao4");
        String questao5= (String) session.getAttribute("questao5");
        String questao6 = (String) session.getAttribute("questao6");
        String questao7= (String) session.getAttribute("questao7");
        String questao8= (String) session.getAttribute("questao8");
        String questao9 = (String) session.getAttribute("questao9");
        String questao10 = (String) session.getAttribute("questao10");
        String A,B,C,D,E,F,G,H,I,R = null;
        
       int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
        
      if(questao1.equals("1")){
           A ="Correto";
           p1 = 1;
       }else{
         A ="Errado";
         p1 = 0;
      } ;
      
      if(questao2.equals("2")){
           B ="Correto";
           p2=1;
      }else{
          B = "Errado";
          p2=0;
      }
      
      if(questao3.equals("3")){
          C ="Correto";
          p3=1;
      }else{
          C = "Errado";
          p3=0;
      }
      
      if(questao4.equals("4")){
          D ="Correto";
          p4=1;
      }else{
          D = "Errado";
          p4=0;
      }
      
      if(questao5.equals("5")){
          E = "Correto";
          p5=1;
      }else{
          E = "Errado";
          p5=0;
      }
      
      if(questao6.equals("1")){
          F = "Correto";
          p6=1;
      }else{
          F = "Errado";
          p6=0;
      }
      
      if(questao7.equals("2")){
          G ="Correto";
          p7=1;
      }else{
          G = "Errado";
          p7=0;
      }
      
      if(questao8.equals("3")){
          H ="Correto";
          p8=1;
      }else{
          H = "Errado";
           p8=0;
      }
      
      if(questao9.equals("4")){
         I ="Correto";
         p9=1;
      }else{
         I = "Errado";
         p9=0;
      }
      
      if(questao10.equals("5")){
         R ="Correto";
         p10=1;
      }else{
         R = "Errado";
         p10=0;
      }
      
      
      
      
    String usuario = (String) session.getAttribute("nome");
        
       int scoreFinal = p1+p2+p3+p4+p5+p6+p7+p8+p9+p10; 
          
         GerenciaDados dadosDb = new GerenciaDados();
         
         
          dadosDb.setNome(usuario);
          dadosDb.setScore(scoreFinal);
          dadosDb.create();
          
           
         
            
        
         
            
        Connection con  = GerenciaJogo.getConnection();
       PreparedStatement stmt = null;
       String nomeRetorno;
       String scoreRetorno, dataid ;
       String dataRetorno = null;
      ArrayList <String> Saida = new ArrayList<>();
       try{
        stmt = con.prepareStatement("SELECT * FROM dados ORDER BY score DESC LIMIT 10;");
       ResultSet resultado = stmt.executeQuery();
       
                  
       while(resultado.next()){ 
         
           nomeRetorno = resultado.getString("nome");
           scoreRetorno = resultado.getString("Score");
           dataRetorno = resultado.getString("data");
           dataid = resultado.getString("id");
           Saida.add(nomeRetorno + " " +scoreRetorno);
                
         
       } 
       }catch (SQLException ex){
          
       }
       
 //------------------------------------------------------------------------------------
       
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Gerenciador</title>");             
            out.println("<link rel='stylesheet' type='text/css' href='http://localhost:8080/PacotesJogo/principal.css'/>");  
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='CorpoServ'>");
            out.println("<div id='Conteiner'>");
            out.println("<div id='Dados' class='subScore'>");
            out.println("<h1>"+ usuario + " seus Acertos: " +scoreFinal+"</h1>");
           out.println("<h3>" +"Olhe quais você Acertou"+ "</br>"+"A "+A+ "</br>"+" B "+B+ "</br>"+" C "+C + "</br>"+" D "+D+ "</br>"+" E "+E+ "</br>"+" F "+F + "</br>"+" G "+G+ "</br>"+" H "+H+ "</br>"+" I "+ I + "</br>"+ "J" + R +"</h3>");
            
            
            
            
            out.println("</div>");
            out.print("<div id='RankGeral' class='subScore'>");
           
            out.print("<h1>"+usuario+" Melhor Pontuação</h1>");
            dadosDb.Leitura();
            Saida.stream().forEach((Saida1) -> {
                out.print("<h3>Jogador: " + Saida1 + "</h3>");
            }); //out.print(Saida);
           
           
           out.print("</br>");
           
           out.println("</div>");
           out.println("<div id='imgScore'>");
           out.println("<figcaption>");
           
           out.print("<a href='index.jsp'><p>VOLTAR A JOGAR</a>");
           
           out.println("</figcaption>");           
           out.println("<figure>");
           out.println("<img src='gifScore.gif'>");
           out.println("<figure>");
           
           
           out.println("</div>");
           
           out.println("</div>");
           out.println("</div>");
           out.println("<body>");
           out.println("</html>");
        }
    }
          
                             
                              
                            
 // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
   
}


