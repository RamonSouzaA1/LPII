<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h1>Pesquisa fornecedores</h1>
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

      <c:forEach items="${fornecedores}" var="fornecedores">
        <tr>
          <td><c:out value="fornecedores.id_fornecedores"></td>
          <td><c:out value="fornecedores.nome"></td>
          <td><a href="ManterFornecedoresController?acao=prepararEditar&codFornecedores=<c:out value="${fornecedores.codFornecedores}"/>">Editar</a></td>
          <td><a href="ManterFornecedoresController?acao=prepararExcluir&codFornecedores=<c:out value="${fornecedores.codFornecedores}"/>">Excluir</a></td>
        </tr>
      </c:forEach>


    </table>
    <form class="" action="ManterFornecedoresController?acao=prepararIncluir" method="post">
      <input type="submit" name="btnIncluir" value="Incluir">
    </form>
  </body>
</html>
