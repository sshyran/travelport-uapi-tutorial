
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.hotel_v17_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-05-05T13:55:28.533+02:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelService",
                      portName = "HotelRetrieveServicePort",
                      targetNamespace = "http://www.travelport.com/service/hotel_v17_0",
                      wsdlLocation = "http://localhost:8080/kestrel/HotelService?wsdl",
                      endpointInterface = "com.travelport.service.hotel_v17_0.HotelRetrieveServicePortType")
                      
public class HotelRetrieveServicePortTypeImpl implements HotelRetrieveServicePortType {

    private static final Logger LOG = Logger.getLogger(HotelRetrieveServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.hotel_v17_0.HotelRetrieveServicePortType#service(com.travelport.schema.hotel_v17_0.HotelRetrieveReq  parameters )*
     */
    public com.travelport.schema.hotel_v17_0.HotelRetrieveRsp service(com.travelport.schema.hotel_v17_0.HotelRetrieveReq parameters) throws HotelFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.hotel_v17_0.HotelRetrieveRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new HotelFaultMessage("HotelFaultMessage...");
    }

}
