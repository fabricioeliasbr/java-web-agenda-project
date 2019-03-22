package com.agenda.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastroUsuarioService;

public class CadastroUsuarioServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("nome");
		request.getParameter("tel");
/*		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("tel"));*/
		
		Pessoa pessoa;
		pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setTelefone(request.getParameter("tel"));
		pessoa.setCelular(request.getParameter("cel"));
		pessoa.setEndereco(request.getParameter("end"));
		
		CadastroUsuarioService service = new CadastroUsuarioService();
		
		service.cadastra(pessoa);
		
	}
} 