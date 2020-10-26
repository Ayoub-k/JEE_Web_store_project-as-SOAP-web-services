/**
 * Panier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DAO;

public class Panier  implements java.io.Serializable {
    private int id;

    private java.lang.String nom_livre;

    private java.lang.Double prix_livre;

    public Panier() {
    }

    public Panier(
           int id,
           java.lang.String nom_livre,
           java.lang.Double prix_livre) {
           this.id = id;
           this.nom_livre = nom_livre;
           this.prix_livre = prix_livre;
    }


    /**
     * Gets the id value for this Panier.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Panier.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nom_livre value for this Panier.
     * 
     * @return nom_livre
     */
    public java.lang.String getNom_livre() {
        return nom_livre;
    }


    /**
     * Sets the nom_livre value for this Panier.
     * 
     * @param nom_livre
     */
    public void setNom_livre(java.lang.String nom_livre) {
        this.nom_livre = nom_livre;
    }


    /**
     * Gets the prix_livre value for this Panier.
     * 
     * @return prix_livre
     */
    public java.lang.Double getPrix_livre() {
        return prix_livre;
    }


    /**
     * Sets the prix_livre value for this Panier.
     * 
     * @param prix_livre
     */
    public void setPrix_livre(java.lang.Double prix_livre) {
        this.prix_livre = prix_livre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Panier)) return false;
        Panier other = (Panier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nom_livre==null && other.getNom_livre()==null) || 
             (this.nom_livre!=null &&
              this.nom_livre.equals(other.getNom_livre()))) &&
            ((this.prix_livre==null && other.getPrix_livre()==null) || 
             (this.prix_livre!=null &&
              this.prix_livre.equals(other.getPrix_livre())));
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
        _hashCode += getId();
        if (getNom_livre() != null) {
            _hashCode += getNom_livre().hashCode();
        }
        if (getPrix_livre() != null) {
            _hashCode += getPrix_livre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Panier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO.com/", "panier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom_livre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom_livre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix_livre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix_livre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
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
