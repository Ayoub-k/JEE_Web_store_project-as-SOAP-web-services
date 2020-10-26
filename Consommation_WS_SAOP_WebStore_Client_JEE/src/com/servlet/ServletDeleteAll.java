package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CataloguelivreImplProxy;


@WebServlet("/ServletDeleteAll")
public class ServletDeleteAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletDeleteAll() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		int    ID=Integer.parseInt(request.getParameter("id"));
		String typeSupprimer=request.getParameter("type");
		
		CataloguelivreImplProxy proxy=new CataloguelivreImplProxy();
		
		switch (typeSupprimer) {
		case "Client":
			
			proxy.deleteClient(ID);
			break;
			
		case "livre":
			
			proxy.deleteliv(ID);
			break;
			
		default:
			break;
		}
		
		request.getRequestDispatcher("/ServletAdmin").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
