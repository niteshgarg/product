/**
 * Y_HS_TEST_104_255BSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Y_HS_TEST_104_255BSkeleton implements mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255, org.apache.axis.wsdl.Skeleton {
    private mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255 impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "IEingabe"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "char1"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("YWmTest102255", _params, new javax.xml.namespace.QName("", "EAntwort"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "char255"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "YWmTest102255"));
        _oper.setSoapAction("urn:sap-com:document:sap:soap:functions:mc-style:Y_HS_TEST104_255:YWmTest102255Request");
        _myOperationsList.add(_oper);
        if (_myOperations.get("YWmTest102255") == null) {
            _myOperations.put("YWmTest102255", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("YWmTest102255")).add(_oper);
    }

    public Y_HS_TEST_104_255BSkeleton() {
        this.impl = new mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST_104_255BImpl();
    }

    public Y_HS_TEST_104_255BSkeleton(mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255 impl) {
        this.impl = impl;
    }
    public java.lang.String YWmTest102255(java.lang.String IEingabe) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.YWmTest102255(IEingabe);
        return ret;
    }

}
