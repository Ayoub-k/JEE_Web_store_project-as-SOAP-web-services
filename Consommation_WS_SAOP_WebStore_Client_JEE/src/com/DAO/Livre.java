/**
 * Livre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DAO;

public class Livre  implements java.io.Serializable {
    private java.lang.String nom;

    private java.lang.String nbrpage;

    private java.lang.String langue;

    private java.lang.String prix;

    private java.lang.String autheur;

    private java.lang.String annee;

    private java.lang.String path;

    private java.lang.String nomcatalogue;

    private int id;

    public Livre() {
    }

    public Livre(
           java.lang.String nom,
           java.lang.String nbrpage,
           java.lang.String langue,
           java.lang.String prix,
           java.lang.String autheur,
           java.lang.String annee,
           java.lang.String path,
           java.lang.String nomcatalogue,
           int id) {
           this.nom = nom;
           this.nbrpage = nbrpage;
           this.langue = langue;
           this.prix = prix;
           this.autheur = autheur;
           this.annee = annee;
           this.path = path;
           this.nomcatalogue = nomcatalogue;
           this.id = id;
    }


    /**
     * Gets the nom value for this Livre.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Livre.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the nbrpage value for this Livre.
     * 
     * @return nbrpage
     */
    public java.lang.String getNbrpage() {
        return nbrpage;
    }


    /**
     * Sets the nbrpage value for this Livre.
     * 
     * @param nbrpage
     */
    public void setNbrpage(java.lang.String nbrpage) {
        this.nbrpage = nbrpage;
    }


    /**
     * Gets the langue value for this Livre.
     * 
     * @return langue
     */
    public java.lang.String getLangue() {
        return langue;
    }


    /**
     * Sets the langue value for this Livre.
     * 
     * @param langue
     */
    public void setLangue(java.lang.String langue) {
        this.langue = langue;
    }


    /**
     * Gets the prix value for this Livre.
     * 
     * @return prix
     */
    public java.lang.String getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Livre.
     * 
     * @param prix
     */
    public void setPrix(java.lang.String prix) {
        this.prix = prix;
    }


    /**
     * Gets the autheur value for this Livre.
     * 
     * @return autheur
     */
    public java.lang.String getAutheur() {
        return autheur;
    }


    /**
     * Sets the autheur value for this Livre.
     * 
     * @param autheur
     */
    public void setAutheur(java.lang.String autheur) {
        this.autheur = autheur;
    }


    /**
     * Gets the annee value for this Livre.
     * 
     * @return annee
     */
    public java.lang.String getAnnee() {
        return annee;
    }


    /**
     * Sets the annee value for this Livre.
     * 
     * @param annee
     */
    public void setAnnee(java.lang.String annee) {
        this.annee = annee;
    }


    /**
     * Gets the path value for this Livre.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this Livre.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the nomcatalogue value for this Livre.
     * 
     * @return nomcatalogue
     */
    public java.lang.String getNomcatalogue() {
        return nomcatalogue;
    }


    /**
     * Sets the nomcatalogue value for this Livre.
     * 
     * @param nomcatalogue
     */
    public void setNomcatalogue(java.lang.String nomcatalogue) {
        this.nomcatalogue = nomcatalogue;
    }


    /**
     * Gets the id value for this Livre.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Livre.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livre)) return false;
        Livre other = (Livre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.nbrpage==null && other.getNbrpage()==null) || 
             (this.nbrpage!=null &&
              this.nbrpage.equals(other.getNbrpage()))) &&
            ((this.langue==null && other.getLangue()==null) || 
             (this.langue!=null &&
              this.langue.equals(other.getLangue()))) &&
            ((this.prix==null && other.getPrix()==null) || 
             (this.prix!=null &&
              this.prix.equals(other.getPrix()))) &&
            ((this.autheur==null && other.getAutheur()==null) || 
             (this.autheur!=null &&
              this.autheur.equals(other.getAutheur()))) &&
            ((this.annee==null && other.getAnnee()==null) || 
             (this.annee!=null &&
              this.annee.equals(other.getAnnee()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.nomcatalogue==null && other.getNomcatalogue()==null) || 
             (this.nomcatalogue!=null &&
              this.nomcatalogue.equals(other.getNomcatalogue()))) &&
            this.id == other.getId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getNbrpage() != null) {
            _hashCode += getNbrpage().hashCode();
        }
        if (getLangue() != null) {
            _hashCode += getLangue().hashCode();
        }
        if (getPrix() != null) {
            _hashCode += getPrix().hashCode();
        }
        if (getAutheur() != null) {
            _hashCode += getAutheur().hashCode();
        }
        if (getAnnee() != null) {
            _hashCode += getAnnee().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getNomcatalogue() != null) {
            _hashCode += getNomcatalogue().hashCode();
        }
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO.com/", "livre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbrpage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbrpage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("langue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "langue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autheur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autheur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomcatalogue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomcatalogue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
