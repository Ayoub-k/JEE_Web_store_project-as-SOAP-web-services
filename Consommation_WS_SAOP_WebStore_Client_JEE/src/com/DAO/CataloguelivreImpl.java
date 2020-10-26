/**
 * CataloguelivreImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DAO;

public interface CataloguelivreImpl extends java.rmi.Remote {
    public void commande(com.DAO.Command arg0) throws java.rmi.RemoteException;
    public void ajouterlivre(com.DAO.Livre arg0) throws java.rmi.RemoteException;
    public com.DAO.Livre afficher(int arg0) throws java.rmi.RemoteException;
    public com.DAO.Livre afficherparnom(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ajouterClient(com.DAO.Client arg0) throws java.rmi.RemoteException;
    public com.DAO.Client isvalidlogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.String[] afficherimage1(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String afficherimage(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.DAO.Livre[] affichier_livre(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.DAO.Livre[] afficherTLivre(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.DAO.Client[] afficherTClint(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ajouterLivre(com.DAO.Panier arg0) throws java.rmi.RemoteException;
    public void vider_panier() throws java.rmi.RemoteException;
    public com.DAO.Panier[] alllivres() throws java.rmi.RemoteException;
    public void deleteliv(int arg0) throws java.rmi.RemoteException;
    public void deleteClient(int arg0) throws java.rmi.RemoteException;
}
