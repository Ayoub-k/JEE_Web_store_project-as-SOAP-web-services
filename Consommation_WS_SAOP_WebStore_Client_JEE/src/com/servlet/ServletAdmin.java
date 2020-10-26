package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CataloguelivreImplProxy;
import com.DAO.Client;
import com.DAO.Livre;


@WebServlet("/ServletAdmin")
public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletAdmin() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
		
		Client listeClient[] =	proxy.afficherTClint("");
		Livre listeLivre[] =proxy.afficherTLivre("");
		
		for (Client livre : listeClient) {
			System.out.println(livre.getNom());
		}
		
		request.setAttribute("listeClient", listeClient);
		request.setAttribute("listeLivre", listeLivre);
		
		
		request.getRequestDispatcher("/Admin.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
