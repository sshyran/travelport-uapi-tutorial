
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v18_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-04-23T10:42:56.678+02:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "SeatMapPort",
                      targetNamespace = "http://www.travelport.com/service/air_v18_0",
                      wsdlLocation = "http://localhost:8080/kestrel/AirService?wsdl",
                      endpointInterface = "com.travelport.service.air_v18_0.SeatMapPortType")
                      
public class SeatMapPortTypeImpl implements SeatMapPortType {

    private static final Logger LOG = Logger.getLogger(SeatMapPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v18_0.SeatMapPortType#service(com.travelport.schema.air_v18_0.SeatMapReq  parameters )*
     */
    public com.travelport.schema.air_v18_0.SeatMapRsp service(com.travelport.schema.air_v18_0.SeatMapReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v18_0.SeatMapRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
