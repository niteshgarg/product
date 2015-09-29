/**
 * Y_HS_TEST_104_255BImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Y_HS_TEST_104_255BImpl implements mc_style.functions.soap.sap.document.sap_com.Y_HS_TEST104_255{
    public java.lang.String YWmTest102255(java.lang.String IEingabe) throws java.rmi.RemoteException {
    	String response = "ERROR";
        if (IEingabe.equals("1")) {
        	response = "104;01-02-03;10894839;Leitschaufel Stufe 1;1";
        } else if (IEingabe.equals("2")) {
        	response = "104;01-02-03;10894526;Druckbegrenzer;6";
        }else if (IEingabe.equals("3")) {
        	response = "104;01-02-03;10894527;Leitschaufel Stufe 1;5";
        }else if (IEingabe.equals("4")) {
        	response = "104;01-02-03;10894528;Druckbegrenzer;1";
        }else if (IEingabe.equals("5")) {
        	response = "104;01-02-03;10894529;Druckbegrenzer;6";
        }else if (IEingabe.equals("6")) {
        	response = "104;01-02-03;10894830;Leitschaufel Stufe 2;1";
        }else if (IEingabe.equals("7")) {
        	response = "104;01-02-03;10894833;Leitschaufel Stufe 1;2";
        }else if (IEingabe.equals("8")) {
        	response = "104;01-02-03;10894835;Leitschaufel Stufe 1;1";
        }else if (IEingabe.equals("9")) {
        	response = "104;01-02-03;10894838;Druckbegrenzer;9";
        }else if (IEingabe.equals("B")) {
        	response = "Nachster TA- Show next TO";
        }else if (IEingabe.equals("C")) {
        	response = "TA_quittiert-TO Confirmed";
        }
        
        return response;
    }

}
