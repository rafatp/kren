/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uminho.di.kren;

/**
 *
 * @author DI
 */

/**
 * KEGG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
public interface KEGG extends javax.xml.rpc.Service {
    public java.lang.String getKEGGPortAddress();

    public keggapi.KEGGPortType getKEGGPort() throws javax.xml.rpc.ServiceException;

    public keggapi.KEGGPortType getKEGGPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}