package com.travelport.service.air_v18_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-04-23T10:42:56.871+02:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v18_0", name = "AirFareRulesPortType")
@XmlSeeAlso({com.travelport.schema.hotel_v17_0.ObjectFactory.class, com.travelport.schema.common_v15_0.ObjectFactory.class, com.travelport.schema.passive_v14_0.ObjectFactory.class, com.travelport.schema.rail_v12_0.ObjectFactory.class, com.travelport.schema.universal_v16_0.ObjectFactory.class, com.travelport.schema.vehicle_v17_0.ObjectFactory.class, com.travelport.schema.air_v18_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirFareRulesPortType {

    @WebResult(name = "AirFareRulesRsp", targetNamespace = "http://www.travelport.com/schema/air_v18_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    public com.travelport.schema.air_v18_0.AirFareRulesRsp service(
        @WebParam(partName = "parameters", name = "AirFareRulesReq", targetNamespace = "http://www.travelport.com/schema/air_v18_0")
        com.travelport.schema.air_v18_0.AirFareRulesReq parameters
    ) throws AirFaultMessage;
}
