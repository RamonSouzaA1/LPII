<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib url="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h1>Pesquisa genero</h1>
    <table>
      <tr>
        <td>Cod.</td>
      </tr>
      <tr>
        <td>Nome</td>
      </tr>
      <tr>
        <td>Ação</td>
      </tr>

      <c:forEach items="${genero}" var="genero">
        <tr>
          <td><c:out value="genero.codGenero"></td>
          <td><c:out value="genero.nome"></td>
          <td><a href="ManterGeneroController?acao=prepararEditar&codGenero=<c:out value="${cliente.codGenero}"/>">Editar</a></td>
          <td><a href="ManterGeneroController?acao=prepararExcluir&codGenero=<c:out value="${cliente.codGenero}"/>">Excluir</a></td>
        </tr>
      </c:forEach>


    </table>
    <form class="" action="ManterGeneroController?acao=prepararIncluir" method="post">
      <input type="submit" name="btnIncluir" value="Incluir">
    </form>
  </body>
</html>
