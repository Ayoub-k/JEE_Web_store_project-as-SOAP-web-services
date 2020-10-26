package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CataloguelivreImplProxy;
import com.DAO.Livre;

@WebServlet("/aficherlivre")
public class Aficherlivre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Aficherlivre() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
		if(session.getAttribute("connectedUser")!=null) {
			Livre livre1 = new Livre();
			int id = Integer.parseInt((String) request.getParameter("id"));
			livre1 = proxy.afficher(id);

			request.setAttribute("Livre", livre1);

			System.out.println(id);
			this.getServletContext().getRequestDispatcher("/achterlivre.jsp").forward(request, response);
		}else {
			this.getServletContext().getRequestDispatcher("/buy.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Livre livre1 = new Livre();
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();

		int id = Integer.parseInt((String) request.getParameter("id"));
		livre1 = proxy.afficher(id);

		request.setAttribute("Livre", livre1);

		System.out.println(id);
		this.getServletContext().getRequestDispatcher("/achterlivre.jsp").forward(request, response);
	}

}
