
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v35_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-09T16:25:51.739-07:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleLocationDetailServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v35_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/vehicle_v35_0/Vehicle.wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v35_0.VehicleLocationDetailServicePortType")
                      
public class VehicleLocationDetailServicePortImpl implements VehicleLocationDetailServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleLocationDetailServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v35_0.VehicleLocationDetailServicePortType#service(com.travelport.schema.vehicle_v35_0.VehicleLocationDetailReq  parameters )*
     */
    public com.travelport.schema.vehicle_v35_0.VehicleLocationDetailRsp service(com.travelport.schema.vehicle_v35_0.VehicleLocationDetailReq parameters) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.vehicle_v35_0.VehicleLocationDetailRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}
