
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v35_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-02T16:26:42.083-07:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirUpsellSearchPort",
                      targetNamespace = "http://www.travelport.com/service/air_v35_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/air_v35_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v35_0.AirUpsellSearchPortType")
                      
public class AirUpsellSearchPortImpl implements AirUpsellSearchPortType {

    private static final Logger LOG = Logger.getLogger(AirUpsellSearchPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v35_0.AirUpsellSearchPortType#service(com.travelport.schema.air_v35_0.AirUpsellSearchReq  parameters )*
     */
    public com.travelport.schema.air_v35_0.AirUpsellSearchRsp service(com.travelport.schema.air_v35_0.AirUpsellSearchReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v35_0.AirUpsellSearchRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
