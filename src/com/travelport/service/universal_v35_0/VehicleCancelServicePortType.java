package com.travelport.service.universal_v35_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-15T12:42:01.364-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v35_0", name = "VehicleCancelServicePortType")
@XmlSeeAlso({com.travelport.schema.air_v35_0.ObjectFactory.class, com.travelport.schema.rail_v35_0.ObjectFactory.class, com.travelport.schema.passive_v35_0.ObjectFactory.class, com.travelport.schema.cruise_v35_0.ObjectFactory.class, com.travelport.schema.hotel_v35_0.ObjectFactory.class, com.travelport.schema.common_v35_0.ObjectFactory.class, com.travelport.schema.universal_v35_0.ObjectFactory.class, com.travelport.schema.vehicle_v35_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VehicleCancelServicePortType {

    @WebResult(name = "VehicleCancelRsp", targetNamespace = "http://www.travelport.com/schema/universal_v35_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/VehicleService")
    public com.travelport.schema.universal_v35_0.VehicleCancelRsp service(
        @WebParam(partName = "parameters", name = "VehicleCancelReq", targetNamespace = "http://www.travelport.com/schema/universal_v35_0")
        com.travelport.schema.universal_v35_0.VehicleCancelReq parameters,
        @WebParam(partName = "supportedVersions", name = "SupportedVersions", targetNamespace = "http://www.travelport.com/schema/universal_v35_0", header = true)
        com.travelport.schema.universal_v35_0.SupportedVersions supportedVersions
    ) throws VehicleFaultMessage;
}
