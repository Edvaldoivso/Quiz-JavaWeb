<%-- 
    Document   : VerificaUser
    Created on : 24/05/2020, 19:31:56
    Author     : edval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="erros.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Que Bicho é esse ?</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <link rel="stylesheet" type="text/css" href="principal.css" />
        <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    </head>     
        
        
  
        <body>
        <div id="Corpo">   
        
              <p id="titulo">Que bicho é este</p>         
            <div id="Jogo">
                <div id="Imagem">
                    
                     <figure>
                        <img src="05.jpg">                 
                    </figure>
                    
                </div>  
                
                <div id="Questoes">
                            
                    
                            </br>
                         
                            <form id="lista" method="post" action="Pag05.jsp">
                            <input type="checkbox" id="valor1" name="valor" value="1">
                            <label for="valor1">
                                ESCARAVELHO
                            </label>
                            </br>
                            </br>
                            <input type="checkbox" id="valor2" name="valor" value="2">
                            <label for="valor2">
                                BESOURO IMPERADOR
                            </label>
                            </br>
                            </br>
                            <input type="checkbox" id="valor3" name="valor" value="3">
                            <label for="valor3">
                                CIGARRA GIGANTE
                            </label>
                            </br>
                            </br>
                            <input type="checkbox" id="valor4" name="valor" value="4">
                            <label for="valor4">
                               BESOURO ELEFANTE
                            </label>
                            </br>
                            </br>
                            <input type="checkbox" id="valor5" name="valor" value="5">
                            <label for="valor5">
                               HERCULES
                            </label>
                                
                                                  
                            </br>
                            </br>
                            </br>
                            </br>
                            <input type="submit" class="btn btn-light btn btn-primary btn-md" value="PROXIMO ANIMAL">
                            
                            
                            </form>
                               
                            
                              <%
             String questao5 = request.getParameter("valor");                             
                if(questao5 != null){           
               session.setAttribute("questao5",questao5);
               response.sendRedirect("Pag06.jsp");
           }
        
        
        
        
        %>
        
                </div>
                
                
                    
                    
                </div>
                
                
            </div>
        
        
        
        
        
        
        
        
        
        
        
        </div>
        
        
        
    
        
        
         <script>
                        
                                   
               function NextPage(){
                       console.log("Next Press");
                        window.location.href = "Pag06.jsp";
                       
               }
               
                             
               
                    </script>
        
        
        
        
        
        
    </body>
        
        
        
        
        
</html>
