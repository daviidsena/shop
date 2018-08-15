package org.mypackage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mypackage.dao.NameHandlerDao;
import org.mypackage.dao.exception.DaoException;
import org.mypackage.dao.impl.NameHandlerDaoImpl;
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
		NameHandler nameBean = new NameHandler();
		nameBean.setName(name);
		nameBean.setCpf(cpf);
		HttpSession session = request.getSession();
		session.setAttribute("nameBean", nameBean);

		NameHandlerDao nameHandlerDao = new NameHandlerDaoImpl();
		try {
			NameHandler bean = nameHandlerDao.create(nameBean);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
