package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CataloguelivreImplProxy;
import com.DAO.Client;
import com.DAO.Command;
import com.DAO.Panier;

/**
 * Servlet implementation class Commandservlet
 */
@WebServlet("/Commandservlet")
public class Commandservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Commandservlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		HttpSession sessio = request.getSession(true);
		Client client=(Client)sessio.getAttribute("connectedUser");
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();

		Command c = new Command();
		Panier[] listes_paniers=proxy.alllivres();
		if(listes_paniers!=null) {
			for (Panier panier : listes_paniers) {
				c.setNomlivre(panier.getNom_livre());
				c.setEmailclient(client.getEmail());
				c.setQ(1);
				proxy.commande(c);
			}
			
			proxy.vider_panier();
			this.getServletContext().getRequestDispatcher("/command.jsp").forward(request, response);
		}else {
			this.getServletContext().getRequestDispatcher("/les_livrespanier(1).jsp").forward(request, response);
		}
		
		
		

	
		}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
