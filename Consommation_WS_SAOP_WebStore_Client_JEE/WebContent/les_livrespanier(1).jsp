<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.DAO.CataloguelivreImplProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.DAO.*"%>

<%
	CataloguelivreImplProxy proxy = new CataloguelivreImplProxy();
	Client client = (Client) session.getAttribute("connectedUser");
	request.setAttribute("client", client);
	String id = request.getParameter("id");
	Panier[] tab = proxy.alllivres();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link rel="stylesheet" type="text/css" href="static/css/mystyle.css" />

<link rel='stylesheet' type='text/css' href='FichierCss/panie.css'>
<style type="text/css">
a {
	text-decoration: none;
}

.foter {
	background-color: #282828;
	background-position: center center;
	text-shadow: rgb(31, 23, 22) 20px 35px 50px;
	height: 150px;
}

div ul {
	display: inline-block;
}
</style>
<script src="scripts/javascript.js"></script>
</head>
<body>


<nav class="navbar">
		<header>
			<ul class="ulheader">
				<li><a
					href="/Consommation_Web_Store/les_livres.jsp?idcatalogue=Science">Science
				</a></li>
				<li><a href="les_livres.jsp?idcatalogue=History"> History </a></li>
				<li><a
					href="/Consommation_Web_Store/les_livres.jsp?idcatalogue=Programming">Programming
				</a></li>
				<li><a href="les_livres.jsp?idcatalogue=art"> Art </a></li>
				<li><a href="les_livres.jsp?idcatalogue=Anime"> Anime </a></li>
				<li><a href="les_livres.jsp?idcatalogue=Novels"> Novels </a></li>
				<li><a href="les_livres.jsp?idcatalogue=Economie"> Economie
				</a></li>
				<li><a href="les_livres.jsp?idcatalogue=Various"> Various </a></li>
				<li><a href="les_livres.jsp?idcatalogue=religion ">Religion
				</a></li>
			</ul>
		</header>
	</nav>



	<div>
		<img src="static/images/background/6.jpg" alt="" id="slide"
			style="width: 100%; height: 550px; border-radius: 10px; background-position: center center; background-size: cover; position: static;">
	</div>
	<script>
		var imgs = [ "static/images/background/1.jpg",
				"static/images/background/2.jpg",
				"static/images/background/3.jpg",
				"static/images/background/4.jpg",
				"static/images/background/5.jpg",
				"static/images/background/6.jpg" ]
		var k = 0
		function slides() {
			document.getElementById("slide").src = imgs[k];
			k++;
			if (k > 5)
				k = 0
		}
		setInterval(slides, 2000)
	</script>
	
	
	
	<div
		style="background-color: DarkCyan; width: 92%; margin-left: 60px; border-radius: 40px;">
		<p style="text-align: center; font-size: 30px;">Votre Panier:</p>
	</div>
	<table border="0.5" align="center" width="91%"
		style="background-color: #C0C0C0; margin-top: 2cm;">
		<tr>

			<th>Nom</th>
			<th>Prix</th>
			<th>Supprimer</th>

		</tr>
		<tr>
			<%
				if (tab != null) {
					for (int i = 0; i < tab.length; i++) {
			%>
		</tr>
		<tr>

			<th><%=tab[i].getNom_livre()%></th>
			<th><%=tab[i].getPrix_livre()%></th>
			<th><a href="">Supprimer</a></th>

			<td></td>


		</tr>
		<%
			}
			} else {
				
			}
		%>



	</table>



	<div class="divbtn" style="padding-top: 1cm; text-align: center;">
		



		<div
			style="background-color: #C0C0C0; width: 92%; margin-left: 60px; border-radius: 40px;">
			<p style="text-align: center; font-size: 30px;">Prix_totale:</p>
		</div>
		<h1 style="text-align: center; font-size: 30px;">
			<% if(tab!=null){
			double s = 0.0;
			for (Panier p : tab) {
				s = s + p.getPrix_livre();
			}
			
		%>

		</h1>
		<%=s%>
		<%}else{ %>

		<%} %>
		
		<form method='get' action="Commandservlet">
			<input type="submit" name="btne" value="Confirmer" class="btn" />
		</form>
	</div>
	
	


	<footer>
		<div class="foter">
			<p style="color: white; padding-top: 0.3cm;">User: ${client.nom}
				${client.prenom}</p>
			<p style="color: white;">Email: ${client.email}</p>
			<p style="color: white;">
				Panier: <a href="/Consommation_Web_Store/les_livrespanier(1).jsp"
					style="color: aqua">Panier</a>
			</p>
			<p style="color: white;">
				Deconnection: <a href="/Consommation_Web_Store/Deconnexion"
					style="color: aqua">Deconnecxion</a>
			</p>
		</div>
	</footer>

</body>
</html>