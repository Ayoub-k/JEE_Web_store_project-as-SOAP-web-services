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
import com.DAO.Panier;

/**
 * Servlet implementation class Addpanier
 */
@WebServlet("/Addpanier")
public class Addpanier extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Addpanier() {
        super();   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
		int id =Integer.parseInt(request.getParameter("id"));
		
		Livre livre=proxy.afficher(id);
		
		String nom=request.getParameter("nom");
		double prix=Double.parseDouble(livre.getPrix());
		System.out.println(nom+prix+id);
		Panier p= new Panier(id,livre.getNom(),prix);
		if(p!=null)
		proxy.ajouterLivre(p);
		HttpSession s = request.getSession();
		request.getRequestDispatcher("/les_livres.jsp?idcatalogue="+s.getAttribute("typecategorie")+"").forward(request, response);	
//        request.getRequestDispatcher("les_livrespanier.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}


























//String idnom =request.getParameter("idnom");
//CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
//Panier_OpProxy proxy_panier=new Panier_OpProxy();
//Livre livre1=  proxy.afficherparnom(idnom);
//
////System.out.println(livre1.afficherlivre() +"le livre"+ livre1);
//
//Panier.Livre livre_panier= new Panier.Livre();
//livre_panier.setNom(livre1.getNom());
//livre_panier.setNbrpage(livre1.getNbrpage());
//livre_panier.setPrix(livre1.getPrix());
//livre_panier.setAutheur(livre1.getAutheur());
//livre_panier.setAnnee(livre1.getAnnee());
//livre_panier.setPath(livre1.getPath());
//livre_panier.setNomcatalogue(livre1.getNomcatalogue());
//HttpSession s = request.getSession();
//
//String op =(String) request.getParameter("op");
//System.out.println(op);
//if (request.getSession().getAttribute("panier") == null)
//	request.getSession().setAttribute("panier", proxy_panier.newPanier());
////Object p=proxy_panier.newPanier();
//Object   p = request.getSession().getAttribute("panier");
//
//
//if (op.equals("plus") ) {		
//	proxy_panier.addLivre(livre_panier);				
//	System.out.println(proxy_panier.toString());
//	request.getSession().setAttribute("panier", p);
//	if(op.contentEquals("plus"))
//	    request.getRequestDispatcher("/Panier.jsp").forward(request, response);
//	else
//		request.getRequestDispatcher("/les_livres.jsp?idcatalogue="+s.getAttribute("typecategorie")+"").forward(request, response);				
//}
//else if (op.equals("sous")) {		
//	proxy_panier.sousLivre(livre_panier);
//	request.getSession().setAttribute("panier", p);
//	request.getRequestDispatcher("/Panier.jsp").forward(request, response);
//}
//else if (op.equals("elim")) {
//	proxy_panier.removeLivre(livre_panier);
//	request.getSession().setAttribute("panier", p);
//	request.getRequestDispatcher("/Panier.jsp").forward(request, response);	
//}