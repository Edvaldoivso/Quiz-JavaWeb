<!DOCTYPE html>
<!--
Jogo De Onde Vem?
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="erros.jsp" %>
<html>
    <head>
        <title>Que Bicho é esse?</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="principal.css" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    </head>
    <body>
        <div id="Corpo">   
        
            <div id="Home"> 
            
                <p id="Mensagem">Que Bicho &eacute; esse ?</p>
               <form method="POST" action="Jogo.jsp">  
               <label for="nome">COLOQUE SEU NOME AI DO LADO RECRUTA
                <input type="text" name="nome" id="nome" >  
                <input type="submit" class="btn btn-light btn btn-primary btn-md" value="COMEÇAR JÁ!">
           

                
                </form>
                
                <br/>
                 
                 
                 <br/>
               
                  
                <br/>
                <br/>
                <div id="Animacao">
                   <figure>
                    <img src="inicio2.jpg">
                </figure>
                </div>
                
               
                
            </div>
            
            
            
            
            
            <div id="Jogo">
                <div id="Imagem">
                    
                    
                    
                </div>  
                
                <div id="Questoes">
                    <form>
                        
                        <p>Vem o formulÃ¡rio</p>
                    </form>
                </div>
                
                <div id="Next">
                    <figure >
                        <img src="next.png" class="next" alt="Proxima QuestÃ£o" onclick="Next() , Questao()">
                    </figure>
                    
                    
                    
                    
                    
                </div>
                
                
            </div>
        
    <!--Verificação dos Dados em Cookie se existir ela já manda para o jogo-->    
        
         <%
         String usuario = request.getParameter("nome");//Pegou a string
         Cookie[] cookie = request.getCookies();//Criou um array de Cookie e valores
            for(Cookie atual : cookie){//Verifica cada um dos cookies 
                if(atual.getName().equals("Usuario")){//compara se existe algum oara o Usuário
                  usuario = atual.getValue();//Insere novamente na variavel o valor do Cookie
                    response.sendRedirect("Jogo.jsp");//Manda Direto para o Jogo
                    
                }
            }
           
                
          
            
      
        %>
        
        
        
        
        
        
        
        </div>
       
        
        
    
        
        
         <script>
                        
                     function Show(){
                         var ValNome = document.getElementById("Valor").value
                            if(ValNome == ""){
                                alert("Falta o Nome");
                             }else{
                           document.getElementById("Home").style.display = "none"; 
                           
                   } 
               }
               
               
               function Next(){
                       console.log("Next Press");
               }
               
                var numero=0;
              function Questao(){
                  
                  var imagem = ["Cavalo","Boi","Sapao","Kiwi","Lemure"];
                  
                  for(questao = 0; questao < 9; questao++){
                      
                    document.getElementById("Imagem").innerHTML = imagem;
                    
                    console.log(numero);
                  }
                   
                  if(numero >= 1){
                      window.location.href = "RespScore.jsp";
                      
                  }
                  numero++;
              }
               
               
               
               
                    </script>
        
        
        
        
        
        
    </body>
</html>
