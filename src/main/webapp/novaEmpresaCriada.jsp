<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		 Empresa <%= nomeEmpresa %> cadastrada com sucesso!
	</body>
	<p>
		clique aqui para ver as empresas cadastradas:<a href="/">Lista</a>
	</p>
</html>