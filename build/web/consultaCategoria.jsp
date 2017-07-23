
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h1>Pesquisa Categoria</h1>
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

      <c:forEach items="${categoria}" var="categoria">
        <tr>
          <td><c:out value="categoria.id_Categoria"></td>
          <td><c:out value="categoria.nome"></td>
          <td><a href="ManterCategoriaController?acao=prepararEditar&codCliente=<c:out value="${cliente.codCliente}"/>">Editar</a></td>
          <td><a href="ManterCategoriaController?acao=prepararExcluir&codCliente=<c:out value="${cliente.codCliente}"/>">Excluir</a></td>
        </tr>
      </c:forEach>


    </table>
    <form class="" action="ManterCategoriaController?acao=prepararIncluir" method="post">
      <input type="submit" name="btnIncluir" value="Incluir">
    </form>
  </body>
</html>
