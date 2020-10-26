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

/**
 * Servlet implementation class Servletclient
 */
@WebServlet("/servletclient")
public class Servletclient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletclient() {
        super();
    	
    	}

    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {

    		
    		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
    		String nom = (String) request.getParameter("nom");
    		String prenom = (String) request.getParameter("prenom");
    		String nombre = (String) request.getParameter("nombre");
    		String email = (String) request.getParameter("email");
    		String password = (String) request.getParameter("password");
    		if(nom!="" && prenom!="" && nombre!="" && email!="" && password!="") {
    			Client c = new Client();
        		c.setNom(nom);
        		c.setPrenom(prenom);
        		c.setPhone(nombre);
        		c.setEmail(email);
        		c.setPassword(password);
        		this.getServletContext().getRequestDispatcher("/buy.jsp").forward(request, response);
        		proxy.ajouterClient(c);
        		
    		}else {
    			this.getServletContext().getRequestDispatcher("/buy.jsp").forward(request, response);
    		}
    		

    		System.out.println("connetsd");

    		
    	}

    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {

    		String login = request.getParameter("textemail");
    		String password = request.getParameter("textpassword");

    		request.setAttribute("login", login);
    		request.setAttribute("password", password);
    		
    		
    		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();

    		Client connectedUser = proxy.isvalidlogin(login, password);
    		
    		if (connectedUser != null) {

    			
    			HttpSession session = request.getSession(true);
    			session.setAttribute("connectedUser", connectedUser);
    			if(connectedUser.getEmail().equals("olephina@gmail.com")) {
    				request.getRequestDispatcher("/ServletAdmin").forward(request, response);
    			}else {
    				HttpSession s = request.getSession();
        			if(s.getAttribute("typecategorie")!=null)
        				request.getRequestDispatcher("/les_livres.jsp?idcatalogue="+s.getAttribute("typecategorie")+"").forward(request, response);
        			else
        				request.getRequestDispatcher("/les_livres.jsp?idcatalogue=Science").forward(request, response);
    			}	
    		} else {

    			request.setAttribute("errorMessage", "Bad identity");
    			request.getRequestDispatcher("/buy.jsp").forward(request, response);

    		}
    	}
    	
    }