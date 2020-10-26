package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CataloguelivreImplProxy;


@WebServlet("/Deconnexion")
public class Deconnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Deconnexion() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
		HttpSession session = request.getSession(true);
		if(session.getAttribute("connectedUser")!=null) {
			session.invalidate();
			proxy.vider_panier();
			this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
		}else {
			proxy.vider_panier();
			this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
