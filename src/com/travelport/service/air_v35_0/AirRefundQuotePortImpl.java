
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v35_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-02T16:26:42.098-07:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirRefundQuotePort",
                      targetNamespace = "http://www.travelport.com/service/air_v35_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/air_v35_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v35_0.AirRefundQuotePortType")
                      
public class AirRefundQuotePortImpl implements AirRefundQuotePortType {

    private static final Logger LOG = Logger.getLogger(AirRefundQuotePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v35_0.AirRefundQuotePortType#service(com.travelport.schema.air_v35_0.AirRefundQuoteReq  parameters )*
     */
    public com.travelport.schema.air_v35_0.AirRefundQuoteRsp service(com.travelport.schema.air_v35_0.AirRefundQuoteReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v35_0.AirRefundQuoteRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
