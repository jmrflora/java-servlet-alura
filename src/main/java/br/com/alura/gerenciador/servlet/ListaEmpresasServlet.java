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
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco bc = new Banco();
		List<Empresa> lista = bc.getEmpresas();
		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><body>");
//		out.println("<ul>");
//		for(Empresa em: lista) {
//			out.println("<li>" + em.getNome() + "</li>");
//		}
//		out.println("</ul>");
//		out.println("</body</html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
		
		
		
	}

}
