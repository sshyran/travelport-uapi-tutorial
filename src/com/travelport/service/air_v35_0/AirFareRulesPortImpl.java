
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v35_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-15T10:10:02.663-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirFareRulesPort",
                      targetNamespace = "http://www.travelport.com/service/air_v35_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/air_v35_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v35_0.AirFareRulesPortType")
                      
public class AirFareRulesPortImpl implements AirFareRulesPortType {

    private static final Logger LOG = Logger.getLogger(AirFareRulesPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v35_0.AirFareRulesPortType#service(com.travelport.schema.air_v35_0.AirFareRulesReq  parameters )*
     */
    public com.travelport.schema.air_v35_0.AirFareRulesRsp service(com.travelport.schema.air_v35_0.AirFareRulesReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v35_0.AirFareRulesRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
