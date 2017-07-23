<html>
<head>
	<meta charset="UTF-8"/>
	<title>Cadastro de Filmes</title>

</head>
<body>
	<h2>Cadastro de Filmes</h2>
	<form>
		Título <input type="text" id="titulo" /><br/>
		Título original <input type="text" id=""/>
		Código <input type="text" id="codigo" /><br/>
		Cód. Cópia <input type="text" id="cópia" /><br/>
		Mídia <input type="text" id="midia" /><br/>
		Custo <input type="text" id="custo" /><br/>
		
		Categoria <select>
				<option value="default">Selecione</option>
  				<option value="Lanç">Lançamento</option>
  				<option value="Norm">Normal</option>
  				<option value="Ant">Antigo</option>
			</select><br/>

		Gênero <select>
				<option value="default">Selecione</option>
  				<option value="Av">Aventura</option>
  				<option value="Ação">Ação</option>
  				<option value="Romance">Romance</option>
			</select><br/>	

		Diretor(a) <input type="text" id="diretor" /><br/>
		Ator Principal <input type="text" id="ator" /><br/>
		Premiações <input type="text" id="premiações" /><br/>	
		
		
		Ano de Produção <input type="date" id=""/>
		Ano de Lançamento <input type="date" id=""/>		
		Fornecedor <input type="text" id="fornecedor" /><br/>
		
		<br/>
		<br/>
		<input type="reset" value="Cancelar" />
		<input type="submit" value=" Enviar " />


	</form>

</body>


</html>
