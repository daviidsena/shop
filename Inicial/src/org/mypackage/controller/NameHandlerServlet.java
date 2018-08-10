package org.mypackage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mypackage.hello.NameHandler;

/**
 * Servlet implementation class NameHandlerServlet
 */
@WebServlet("/NameHandlerServlet")
public class NameHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameHandlerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getParameter("name");
		String cpf = (String) request.getParameter("cpf");
		NameHandler nameHandlerBean = new NameHandler();
		nameHandlerBean.setName(name);
		nameHandlerBean.setCpf(cpf);
		request.setAttribute("name", name);
		request.setAttribute("cpf", cpf);
		response.sendRedirect("response.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
