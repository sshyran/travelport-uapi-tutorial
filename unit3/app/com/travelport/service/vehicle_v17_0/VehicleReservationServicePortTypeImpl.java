
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v17_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-05-05T19:47:19.462+02:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleReservationServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v17_0",
                      wsdlLocation = "http://localhost:8080/kestrel/VehicleService?wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v17_0.VehicleReservationServicePortType")
                      
public class VehicleReservationServicePortTypeImpl implements VehicleReservationServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleReservationServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v17_0.VehicleReservationServicePortType#service(com.travelport.schema.vehicle_v17_0.VehicleCreateReservationReq  parameters ,)com.travelport.schema.universal_v16_0.SupportedVersions  supportedVersions )*
     */
    public com.travelport.schema.vehicle_v17_0.VehicleCreateReservationRsp service(com.travelport.schema.vehicle_v17_0.VehicleCreateReservationReq parameters,com.travelport.schema.universal_v16_0.SupportedVersions supportedVersions) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        System.out.println(supportedVersions);
        try {
            com.travelport.schema.vehicle_v17_0.VehicleCreateReservationRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}
