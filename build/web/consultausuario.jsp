<html>
<head>
	<meta charset="UTF-8"/>
	<title>Consulta de Usuários</title>
</head>
<body>
<h3>Consulta de Usuário</h3>
<form>
	Usuario <input type="text"/>
	<input type="submit" value="Procurar"/>
	<input type="button" value="Editar"/>
	<input type="button" value="Excluir"/>
</form>

<table style="border-style:solid;">
	<tr>
		<td>Codigo</td><td>Nome </td><td>Telefone 1</td><td>Telefone 2</td><td>Celular</td><td>E-Mail</td>
	</tr>

	<tr>
		<td>- - - </td><td> </td><td> </td><td> </td><td></td> <td></td>
	</tr>

	<tr>
		<td>- - - </td><td> </td><td> </td><td> </td><td></td> <td></td>
	</tr>

	<tr>
		<td>- - - </td><td> </td><td> </td><td> </td><td></td> <td></td>
	</tr>

	<tr>
		<td>- - - </td><td> </td><td> </td><td> </td><td></td> <td></td>
	</tr>
</table>
<br/>
<input type="button" value="Consultar dados do funcionario"/>


<h3>Dados Pessoais</h3>

<form>
		CÃ³digo <input type="text" id="codigo" /><br/>
		Nome <input type="text" id=""/>
		Senha <input type="password" id=""/><br/>
		CPF <input type="text" id=""/>
		RG <input type="text" id=""/>
		Sexo <select>
				<option value="default">Selecione</option>
  				<option value="Masc">Masculino</option>
  				<option value="Fem">Feminino</option>
			</select><br/>

		Data de nascimento <input type="date" id=""/>
		Estado Civil
			<select>
				<option value="default">Selecione</option>
  				<option value="solt">Solteiro</option>
  				<option value="cas">Casado</option>
  				<option value="divor">Divorciado</option>
			</select><br/>

		CEP <input type="text" id="" /><br/>
		Logradouro <input type="text" id=""/>
		NÂº <input type="number" id=""/>
		Complemento <input type="text" id=""/><br/>
		Telefone 1 <input type="number" id=""/>
		Telefone 2 <input type="number" id=""/>
		Celular <input type="number" id=""/><br/>
		E-mail<input type="email" id="" />
		<br/>
		<br/>
		<input type="button" value=" Editar " />
	</form>




</body>
</html>