package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa em = new Empresa();
		em.setNome("Alura");
		
		Empresa em1 = new Empresa();
		em1.setNome("caelum");
		
		lista.add(em);
		lista.add(em1);
		
	}
	
	public static void adiciona(Empresa em) {
		Banco.lista.add(em);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
		
	}
	
}
