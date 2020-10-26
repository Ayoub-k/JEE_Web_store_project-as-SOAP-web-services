
package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.Beans.Client;
import com.Beans.Command;
import com.Beans.Livre;
import com.Beans.Panier;

@WebService
public class CataloguelivreImpl {

//	@WebMethod(operationName = "getconnection")
	public static Connection getconnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			System.out.println("connection");
			return con;
		} catch (Exception e) {
			return null;
		}
	}

	@WebMethod
	public void ajouterlivre(@WebParam Livre l) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "");

			String query = "INSERT INTO Livre(nom,nbrpage,langue,prix,autheur,annee,path,nomcatalogue)values(?,?,?,?,?,?,?,?)";
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(query);
			if (l != null) {
				pr.setString(1, l.getNom());
				pr.setString(2, l.getNbrpage());
				pr.setString(3, l.getLangue());
				pr.setString(4, l.getPrix());
				pr.setString(5, l.getAutheur());
				pr.setString(6, l.getAnnee());
				pr.setString(7, l.getPath());
				pr.setString(8, l.getNomcatalogue());
				pr.execute();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass().getName());
		}
	}

	@WebMethod(operationName = "afficher")
	public Livre afficher(@WebParam int id) {
		Livre l = new Livre();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "");
			String query = "select * from Livre where id=?";
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(query);
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			if (rs.next()) {
				l.setNom(rs.getString("nom"));
				l.setNbrpage(rs.getString("nbrpage"));
				l.setLangue(rs.getString("langue"));
				l.setPrix(rs.getString("prix"));
				l.setAutheur(rs.getString("autheur"));
				l.setAnnee(rs.getString("annee"));
				l.setPath(rs.getString("path"));
				l.setNomcatalogue(rs.getString("nomcatalogue"));
			}
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass().getName());
		}
		return l;
	}

	@WebMethod(operationName = "afficherparnom")
	public Livre afficherparnom(@WebParam String nom) {
		Livre l = new Livre();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			String query = "select * from Livre where nom=?";
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(query);
			pr.setString(1, nom);
			ResultSet rs = pr.executeQuery();
			if (rs.next()) {
				l.setNom(rs.getString("nom"));
				l.setNbrpage(rs.getString("nbrpage"));
				l.setLangue(rs.getString("langue"));
				l.setPrix(rs.getString("prix"));
				l.setAutheur(rs.getString("autheur"));
				l.setAnnee(rs.getString("annee"));
				l.setPath(rs.getString("path"));
				l.setNomcatalogue(rs.getString("nomcatalogue"));
			}
			pr.close();
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass().getName());
		}
		return null;
	}

	@WebMethod
	public void ajouterClient(@WebParam Client c) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			String query = "INSERT INTO client(first_name,last_name,phone,email,password) values(?,?,?,?,?)";
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(query);
			pr.setString(1, c.getNom());
			pr.setString(2, c.getPrenom());
			pr.setString(3, c.getPhone());
			pr.setString(4, c.getEmail());
			pr.setString(5, c.getPassword());
			pr.execute();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//			

	@WebMethod(operationName = "isvalidlogin")
	public Client isValidLogin(@WebParam String email, @WebParam String password) {
		try  {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "");
			String strSql = "SELECT * FROM client WHERE email=? AND password=?";
			try (PreparedStatement statement = con.prepareStatement(strSql)) {
				statement.setString(1, email);
				statement.setString(2, password);
				try (ResultSet resultSet = statement.executeQuery()) {
					if (resultSet.next()) {
						return new Client(resultSet.getString("first_name"), resultSet.getString("last_name"),
								resultSet.getString("phone"), resultSet.getString("email"),
								resultSet.getString("password"));
					} else {
						return null;
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}

	}

	@WebMethod(operationName = "commande")
	public void command(@WebParam Command c) {

		String query = " INSERT INTO command(email,nomlivre,Q) values(?,?,?)";
		try (			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "");
				PreparedStatement pr = con.prepareStatement(query)) {

			pr.setString(1, c.getEmailclient());
			pr.setString(2, c.getNomlivre());
			pr.setInt(3, c.getQ());
			pr.execute();
			System.out.println("correct");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("null")
	@WebMethod(operationName = "afficherimage1")
	public ArrayList<String> afficherimage1(@WebParam String categorie) {
		ArrayList<String> path = null;
		String aide;

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			String query = "select path from Livre where nomcatalogue=?";
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, categorie);
			ResultSet re = pr.executeQuery();
			while (re.next()) {
				aide = (String) re.getString("path");
				path.add(aide);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return path;
	}

	@WebMethod(operationName = "afficherimage")
	public String afficherimage(@WebParam String categorie) {
		String path = null;

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			String query = "select path from Livre where nomcatalogue=?";
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, categorie);
			ResultSet re = pr.executeQuery();
			if (re.next())
				path = re.getString("path");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return path;

	}

	@WebMethod(operationName = "affichier_livre")
	public ArrayList<Livre> affichier_livre(@WebParam String nomcatalogue) {
//		ArrayList<Livre> liste_livre=null;
		ArrayList<Livre> liste_livre = new ArrayList<>();

		String query = "select * from Livre where nomcatalogue=?";
//		String query = "select * from Livre where nomcatalogue='"+nomcatalogue+"'";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, nomcatalogue);
			ResultSet rs = pr.executeQuery();
			while (rs.next()) {
				Livre l = new Livre();
				l.setNom(rs.getString("nom"));
				l.setNbrpage(rs.getString("nbrpage"));
				l.setLangue(rs.getString("langue"));
				l.setPrix(rs.getString("prix"));
				l.setAutheur(rs.getString("autheur"));
				l.setAnnee(rs.getString("annee"));
				l.setPath(rs.getString("path"));
				l.setNomcatalogue(rs.getString("nomcatalogue"));
				l.setId(rs.getInt("id"));
				liste_livre.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste_livre;
	}
	
	
//	-------------------------------------------------pour admin------------------------------------------------------------------------
	
	
	
	@WebMethod(operationName = "afficherTLivre")
	public ArrayList<Livre> afficherAll(@WebParam String nomcatalogue) {
//		ArrayList<Livre> liste_livre=null;
		ArrayList<Livre> liste_livre = new ArrayList<>();

		String query = "select * from Livre";
//		String query = "select * from Livre where nomcatalogue='"+nomcatalogue+"'";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			PreparedStatement pr = con.prepareStatement(query);
			ResultSet rs = pr.executeQuery();
			while (rs.next()) {
				Livre l = new Livre();
				l.setNom(rs.getString("nom"));
				l.setNbrpage(rs.getString("nbrpage"));
				l.setLangue(rs.getString("langue"));
				l.setPrix(rs.getString("prix"));
				l.setAutheur(rs.getString("autheur"));
				l.setAnnee(rs.getString("annee"));
				l.setPath(rs.getString("path"));
				l.setNomcatalogue(rs.getString("nomcatalogue"));
				l.setId(rs.getInt("id"));
				liste_livre.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste_livre;
	}
	
	@WebMethod(operationName = "afficherTClint")
	public ArrayList<Client> afficherTClint(@WebParam String nomcatalogue) {
//		ArrayList<Livre> liste_livre=null;
		ArrayList<Client> liste_client = new ArrayList<>();

		String query = "select * from client";
//		String query = "select * from Livre where nomcatalogue='"+nomcatalogue+"'";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			PreparedStatement pr = con.prepareStatement(query);
			ResultSet resultSet = pr.executeQuery();
			while (resultSet.next()) {
				Client client = new Client();
				client.setEmail(resultSet.getString("email"));
				
				client.setPrenom(resultSet.getString("first_name"));; 
				client.setNom(resultSet.getString("last_name"));;
				client.setPhone(resultSet.getString("phone")); 
				client.setPassword("VID >>H<< VIDE");
				client.setId(resultSet.getInt("id"));
				liste_client.add(client);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste_client;
	}
	
	
	
	

	/****************************************************
	 * panier
	 *****************************************************/

	// Ajouter au panier bien fait
	@WebMethod
	public void ajouterLivre(Panier a) {

		String sql = "insert into panier(nomlivre,prixlivre) values(?,?)";
		try (			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "");
) {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1, a.getNom_livre());
			pr.setDouble(2, a.getPrix_livre());
			pr.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	bien fait	
	@WebMethod
	public void vider_panier() {

		String sql = "TRUNCATE TABLE panier";
		try (			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
) {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	bien fait
	@WebMethod
	public ArrayList<Panier> Alllivres() {
		ArrayList<Panier> ps = new ArrayList<>();

		String sql = "select * from panier ";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			PreparedStatement pr = con.prepareStatement(sql);
			ResultSet rs = pr.executeQuery();
			while (rs.next()) {
				Panier l = new Panier();
				l.setId(rs.getInt("id"));
				l.setNom_livre(rs.getString("nomlivre"));
				l.setPrix_livre(rs.getDouble("prixlivre"));
				ps.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ps;

	}

	@WebMethod
	public void deleteliv(int id) {

		String sql = "delete from panier where id=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteClient(int id) {

		String sql = "delete from client where id=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book",  "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	panier

}


