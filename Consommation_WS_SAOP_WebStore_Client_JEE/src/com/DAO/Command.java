/**
 * Command.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DAO;

public class Command  implements java.io.Serializable {
    private int id;

    private java.lang.String nomlivre;

    private java.lang.String emailclient;

    private java.lang.String lien;

    private int q;

    public Command() {
    }

    public Command(
           int id,
           java.lang.String nomlivre,
           java.lang.String emailclient,
           java.lang.String lien,
           int q) {
           this.id = id;
           this.nomlivre = nomlivre;
           this.emailclient = emailclient;
           this.lien = lien;
           this.q = q;
    }


    /**
     * Gets the id value for this Command.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Command.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nomlivre value for this Command.
     * 
     * @return nomlivre
     */
    public java.lang.String getNomlivre() {
        return nomlivre;
    }


    /**
     * Sets the nomlivre value for this Command.
     * 
     * @param nomlivre
     */
    public void setNomlivre(java.lang.String nomlivre) {
        this.nomlivre = nomlivre;
    }


    /**
     * Gets the emailclient value for this Command.
     * 
     * @return emailclient
     */
    public java.lang.String getEmailclient() {
        return emailclient;
    }


    /**
     * Sets the emailclient value for this Command.
     * 
     * @param emailclient
     */
    public void setEmailclient(java.lang.String emailclient) {
        this.emailclient = emailclient;
    }


    /**
     * Gets the lien value for this Command.
     * 
     * @return lien
     */
    public java.lang.String getLien() {
        return lien;
    }


    /**
     * Sets the lien value for this Command.
     * 
     * @param lien
     */
    public void setLien(java.lang.String lien) {
        this.lien = lien;
    }


    /**
     * Gets the q value for this Command.
     * 
     * @return q
     */
    public int getQ() {
        return q;
    }


    /**
     * Sets the q value for this Command.
     * 
     * @param q
     */
    public void setQ(int q) {
        this.q = q;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Command)) return false;
        Command other = (Command) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nomlivre==null && other.getNomlivre()==null) || 
             (this.nomlivre!=null &&
              this.nomlivre.equals(other.getNomlivre()))) &&
            ((this.emailclient==null && other.getEmailclient()==null) || 
             (this.emailclient!=null &&
              this.emailclient.equals(other.getEmailclient()))) &&
            ((this.lien==null && other.getLien()==null) || 
             (this.lien!=null &&
              this.lien.equals(other.getLien()))) &&
            this.q == other.getQ();
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
        if (getNomlivre() != null) {
            _hashCode += getNomlivre().hashCode();
        }
        if (getEmailclient() != null) {
            _hashCode += getEmailclient().hashCode();
        }
        if (getLien() != null) {
            _hashCode += getLien().hashCode();
        }
        _hashCode += getQ();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Command.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO.com/", "command"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomlivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nomlivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Emailclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lien");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lien"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Q"));
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
