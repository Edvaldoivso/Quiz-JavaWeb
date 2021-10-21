<%@page import="Classes.GerenciaDados"%> <!--Importação das Classes Java-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="erros.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="principal.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&display=swap" rel="stylesheet">
        <title>Score Final do Jogo</title>
    </head>
    <body>
        
         <div id="Home"> 
            <p id="mensagem">Olha como tu sabes das coisas !</p>
        
         <div id="Jogo">
             
             <%
             
          //String pontos = request.getParameter("Pontos");
          //Float Pontuacao = Float.parseFloat(pontos) ;
          
          String usuario = request.getParameter("nome"); 
          GerenciaDados gerencia = new GerenciaDados();           
          String score = request.getParameter("pontos");
           //int Pontuacao = Integer.parseInt(score);
         int Pontuacao=20;  
          
         
          
          GerenciaDados dados = new GerenciaDados();
          
          dados.setNome(usuario);
          dados.setScore(Pontuacao);
          dados.create();
          dados.Leitura();
          
          
          


%>   
            <div id="ScoreFinal">
               <%
                            
                              String questao1 = (String) session.getAttribute("questao1");
                              String questao2 = (String) session.getAttribute("questao2");
                              String questao3 = (String) session.getAttribute("questao3");
                              String questao4 = (String) session.getAttribute("questao4");
                              String questao5= (String) session.getAttribute("questao5");
                              String questao6 = (String) session.getAttribute("questao6");
                              String questao7= (String) session.getAttribute("questao7");
                              String questao8= (String) session.getAttribute("questao8");
                              String questao9 = (String) session.getAttribute("questao9");
                              
                             int A =Integer.parseInt(questao1);
                             int B= Integer.parseInt(questao2);
                             int C =Integer.parseInt(questao3);
                             int D= Integer.parseInt(questao4);
                             int E =Integer.parseInt(questao5);
                             int F= Integer.parseInt(questao6);
                             int G =Integer.parseInt(questao7);
                             int H= Integer.parseInt(questao8);
                             int I =Integer.parseInt(questao9);
                             
                             int scoreFinal = A+B+C+D+E+F+G+H+I;
                              out.print("Aqui os valores das questoes"+"A "+A+" B "+B+" C "+C+" D "+D+" E "+E+" F "+F +" G "+G+" H "+H+" I "+I);
                              out.print("-------------------------------");
                              out.print(scoreFinal + "Score Final");
                            
                            
                            %>
                    </div>
            </div>
              </br>
              </br>
           <a href="index.jsp">JOGAR NOVAMENTE !</a>
           
        
         </div>
              
             
             
    </body>
</html>
