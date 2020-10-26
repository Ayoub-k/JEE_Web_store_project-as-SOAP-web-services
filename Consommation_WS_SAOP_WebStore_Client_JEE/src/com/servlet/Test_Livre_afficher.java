package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CataloguelivreImplProxy;
import com.DAO.Livre;


@WebServlet("/Test_Livre_afficher")
public class Test_Livre_afficher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Test_Livre_afficher() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
		Livre[] listes_livre=proxy.affichier_livre("Programming");
		
			listes_livre=proxy.affichier_livre("Programming");
			for (Livre livre : listes_livre) {
				System.out.println(livre.getNom());
			}
			request.setAttribute("listes_livre",listes_livre);
			this.getServletContext().getRequestDispatcher("/les_livres_listes.jsp").forward(request, response);
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
