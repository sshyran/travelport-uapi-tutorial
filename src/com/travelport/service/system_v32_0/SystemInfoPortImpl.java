
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.system_v32_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-02T16:28:27.365-07:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "SystemService",
                      portName = "SystemInfoPort",
                      targetNamespace = "http://www.travelport.com/service/system_v32_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/system_v32_0/System.wsdl",
                      endpointInterface = "com.travelport.service.system_v32_0.SystemInfoPortType")
                      
public class SystemInfoPortImpl implements SystemInfoPortType {

    private static final Logger LOG = Logger.getLogger(SystemInfoPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.system_v32_0.SystemInfoPortType#service(com.travelport.schema.system_v32_0.SystemInfoReq  parameters )*
     */
    public com.travelport.schema.system_v32_0.SystemInfoRsp service(com.travelport.schema.system_v32_0.SystemInfoReq parameters) throws SystemFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.system_v32_0.SystemInfoRsp _return = new com.travelport.schema.system_v32_0.SystemInfoRsp();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new SystemFaultMessage("SystemFaultMessage...");
    }

}
