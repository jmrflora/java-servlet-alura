package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cadastrando nova empresa");
		//pegando o parametro
		String nomeEmpresa = request.getParameter("nome");
		
		//criando o objeto empresa
		Empresa em = new Empresa();
		em.setNome(nomeEmpresa);
		
		//acessando o "banco"
		Banco bc = new Banco();
		Banco.adiciona(em);
		
//		List<Empresa> lista = bc.getEmpresas();
		
//		for(Empresa em1 : lista) {
//			System.out.println("nome da empresa:"+em1.getNome());
//		}
		
	 	RequestDispatcher rd =request.getRequestDispatcher("/novaEmpresaCriada.jsp");
	 	request.setAttribute("empresa", em.getNome());
	 	rd.forward(request, response);
		
	}

}
