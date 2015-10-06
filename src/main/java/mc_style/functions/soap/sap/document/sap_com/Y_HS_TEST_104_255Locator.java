/**
 * Y_HS_TEST_104_255Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Y_HS_TEST_104_255Locator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST_104_255 {

    public Y_HS_TEST_104_255Locator() {
    }


    public Y_HS_TEST_104_255Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Y_HS_TEST_104_255Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Y_HS_TEST_104_255B
    private java.lang.String Y_HS_TEST_104_255B_address = "http://localhost:8081/Product/services/Y_HS_TEST_104_255B";

    public java.lang.String getY_HS_TEST_104_255BAddress() {
        return Y_HS_TEST_104_255B_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Y_HS_TEST_104_255BWSDDServiceName = "Y_HS_TEST_104_255B";

    public java.lang.String getY_HS_TEST_104_255BWSDDServiceName() {
        return Y_HS_TEST_104_255BWSDDServiceName;
    }

    public void setY_HS_TEST_104_255BWSDDServiceName(java.lang.String name) {
        Y_HS_TEST_104_255BWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255 getY_HS_TEST_104_255B() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Y_HS_TEST_104_255B_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getY_HS_TEST_104_255B(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255 getY_HS_TEST_104_255B(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST_104_255BStub _stub = new mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST_104_255BStub(portAddress, this);
            _stub.setPortName(getY_HS_TEST_104_255BWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setY_HS_TEST_104_255BEndpointAddress(java.lang.String address) {
        Y_HS_TEST_104_255B_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST_104_255BStub _stub = new mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST_104_255BStub(new java.net.URL(Y_HS_TEST_104_255B_address), this);
                _stub.setPortName(getY_HS_TEST_104_255BWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Y_HS_TEST_104_255B".equals(inputPortName)) {
            return getY_HS_TEST_104_255B();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Y_HS_TEST_104_255");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Y_HS_TEST_104_255B"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Y_HS_TEST_104_255B".equals(portName)) {
            setY_HS_TEST_104_255BEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
