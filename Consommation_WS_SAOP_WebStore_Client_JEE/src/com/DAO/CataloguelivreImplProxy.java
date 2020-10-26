package com.DAO;

public class CataloguelivreImplProxy implements com.DAO.CataloguelivreImpl {
  private String _endpoint = null;
  private com.DAO.CataloguelivreImpl cataloguelivreImpl = null;
  
  public CataloguelivreImplProxy() {
    _initCataloguelivreImplProxy();
  }
  
  public CataloguelivreImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCataloguelivreImplProxy();
  }
  
  private void _initCataloguelivreImplProxy() {
    try {
      cataloguelivreImpl = (new com.DAO.CataloguelivreImplServiceLocator()).getCataloguelivreImplPort();
      if (cataloguelivreImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cataloguelivreImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cataloguelivreImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cataloguelivreImpl != null)
      ((javax.xml.rpc.Stub)cataloguelivreImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.DAO.CataloguelivreImpl getCataloguelivreImpl() {
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl;
  }
  
  public void commande(com.DAO.Command arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.commande(arg0);
  }
  
  public void ajouterlivre(com.DAO.Livre arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.ajouterlivre(arg0);
  }
  
  public com.DAO.Livre afficher(int arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.afficher(arg0);
  }
  
  public com.DAO.Livre afficherparnom(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.afficherparnom(arg0);
  }
  
  public void ajouterClient(com.DAO.Client arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.ajouterClient(arg0);
  }
  
  public com.DAO.Client isvalidlogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.isvalidlogin(arg0, arg1);
  }
  
  public java.lang.String[] afficherimage1(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.afficherimage1(arg0);
  }
  
  public java.lang.String afficherimage(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.afficherimage(arg0);
  }
  
  public com.DAO.Livre[] affichier_livre(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.affichier_livre(arg0);
  }
  
  public com.DAO.Livre[] afficherTLivre(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.afficherTLivre(arg0);
  }
  
  public com.DAO.Client[] afficherTClint(java.lang.String arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.afficherTClint(arg0);
  }
  
  public void ajouterLivre(com.DAO.Panier arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.ajouterLivre(arg0);
  }
  
  public void vider_panier() throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.vider_panier();
  }
  
  public com.DAO.Panier[] alllivres() throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    return cataloguelivreImpl.alllivres();
  }
  
  public void deleteliv(int arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.deleteliv(arg0);
  }
  
  public void deleteClient(int arg0) throws java.rmi.RemoteException{
    if (cataloguelivreImpl == null)
      _initCataloguelivreImplProxy();
    cataloguelivreImpl.deleteClient(arg0);
  }
  
  
}