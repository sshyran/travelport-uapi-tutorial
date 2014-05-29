package com.travelport.service.air_v18_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-04-23T10:42:57.008+02:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v18_0", name = "FlightInfoPortType")
@XmlSeeAlso({com.travelport.schema.hotel_v17_0.ObjectFactory.class, com.travelport.schema.common_v15_0.ObjectFactory.class, com.travelport.schema.passive_v14_0.ObjectFactory.class, com.travelport.schema.rail_v12_0.ObjectFactory.class, com.travelport.schema.universal_v16_0.ObjectFactory.class, com.travelport.schema.vehicle_v17_0.ObjectFactory.class, com.travelport.schema.air_v18_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface FlightInfoPortType {

    @WebResult(name = "FlightInformationRsp", targetNamespace = "http://www.travelport.com/schema/air_v18_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/FlightService")
    public com.travelport.schema.air_v18_0.FlightInformationRsp service(
        @WebParam(partName = "parameters", name = "FlightInformationReq", targetNamespace = "http://www.travelport.com/schema/air_v18_0")
        com.travelport.schema.air_v18_0.FlightInformationReq parameters
    ) throws AirFaultMessage;
}
