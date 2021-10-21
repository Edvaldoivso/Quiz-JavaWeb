
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="principal.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&display=swap" rel="stylesheet">
        <title>OPS Algo errado !</title>
    </head>
    <body>
        
         <div id="Home"> 
             
             
             <%String usuario = (String) session.getAttribute("nome");%>
             <p>Putz <p><%= usuario %></p>lol.... deu um erro ai clica ali e tenta denovo, ou liga lá pro chefe ele resolve</p>
          
         <h2>Informa este erro ai ; )</h2>
         <h1> 
         
         <%=exception%>
             
         </h1>
         </br>
         </br>
         </br>
         </br>
         <a href='index.jsp'><p>VOLTAR A JOGAR</p>
         </div>
              
         
             
    </body>
</html>
