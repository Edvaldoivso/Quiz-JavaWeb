<%-- 
    Document   : VerificaUser
    Created on : 24/05/2020, 19:31:56
    Author     : edval
--%>
<%@page import="Classes.GerenciaDados"%> <!--Importação das Classes Java-->
<%@page errorPage="erros.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Que Bicho é esse ?</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <link rel="stylesheet" type="text/css" href="principal.css" />
    </head> 
    
    
    
    
    
        
       <%
          //Salva os dados para Cookies da Página e na Session Variavel
            
            String usuario = request.getParameter("nome");
           
            if(usuario != null){
            Cookie cookie = new Cookie("Usuario",usuario);//Istanciou o Cookie
             cookie.setMaxAge(60*60);//Definindo a permanencia  no Storange
             response.addCookie(cookie);//Salvou o Cookie
             session.setAttribute("nome",usuario);
               
             
        }
            
            
               
               
            
             GerenciaDados dados = new GerenciaDados();
            if(usuario != null){
                
              dados.setNome(usuario);
            }else{
                dados.setNome("Jogador");
            }
            
            
        
      %>
     
  
        <body>
        <div id="Corpo">   
        
                       
            <div id="Jogo">
                <div id="Imagem">
                    
               
                </div>  
                
                <div id="Questoes">
                    <h2>REGRAZZZZZZZ</H2>
                    <p>Apenas 1 questão é correta</p>
                    <p>Não Pode passar sem responde</p>
                    <p>No Final você vai encontrar o Score geral e Seus pontos</p>
                                       
                    <form>
                        
                        <p id="Mensagem">Agora Vai JOGAR !</p>
                    </form>
                </div>
                
                <div id="Next">
                    <figure >
                        <img src="next.png" class="next" alt="Proxima QuestÃ£o" onclick="NextPage() , Questao()">
                    </figure>
                    
                    
                    
                    
                    
                </div>
                
                
            </div>
        
        
        
        
        
        
        
        
        
        
        
        </div>
        
        
        
    
        
        
         <script>
                        
                                   
               function NextPage(){
                       console.log("Next Press");
                        window.location.href = "Pag01.jsp";
                       
               }
               
                             
               
                    </script>
        
        
    </body>
        
        
        
        
        
</html>
