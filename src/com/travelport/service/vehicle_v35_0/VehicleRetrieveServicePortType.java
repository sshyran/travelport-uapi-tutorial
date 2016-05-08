package com.travelport.service.vehicle_v35_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-09T16:25:52.030-07:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/vehicle_v35_0", name = "VehicleRetrieveServicePortType")
@XmlSeeAlso({com.travelport.schema.common_v35_0.ObjectFactory.class, com.travelport.schema.vehicle_v35_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VehicleRetrieveServicePortType {

    @WebResult(name = "VehicleRetrieveRsp", targetNamespace = "http://www.travelport.com/schema/vehicle_v35_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/VehicleService")
    public com.travelport.schema.vehicle_v35_0.VehicleRetrieveRsp service(
        @WebParam(partName = "parameters", name = "VehicleRetrieveReq", targetNamespace = "http://www.travelport.com/schema/vehicle_v35_0")
        com.travelport.schema.vehicle_v35_0.VehicleRetrieveReq parameters
    ) throws VehicleFaultMessage;
}
