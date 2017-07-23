
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>

  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
 
  <body>
    <h1>Pesquisa Filme</h1>
    
      <tr>
        <td>Cod.</td>
      </tr>
      <tr>
        <td>Nome</td>
      </tr>
      <tr>
        <td>Ação</td>
      </tr>

      <c:forEach items="${filme}" var="filme">
        <tr>
          <td><c:out value="filme.id_filme"></c:out></td>
          <td><c:out value="filme.titulo"></c:out></td>
          <td><a href="ManterFilmeController?acao=prepararEditar&codFilme=<c:out value="${filme.id_filme}>"></c:out>"Editar</a></td>
          <td><a href="ManterFilmeController?acao=prepararExcluir&codFilme=<c:out value="${filme.id_filme}>"></c:out>"Excluir</a></td>
        </tr>
      </c:forEach>
        
      <form class="" action="ManterFilmeController?acao=prepararIncluir" method="post">
        <input type="submit" name="btnIncluir" value="Incluir">
      </form>
  </body>
</html>