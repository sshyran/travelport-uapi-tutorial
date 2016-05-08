package com.travelport.service.air_v35_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-02T16:26:42.323-07:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v35_0", name = "AirRefundQuotePortType")
@XmlSeeAlso({com.travelport.schema.air_v35_0.ObjectFactory.class, com.travelport.schema.rail_v35_0.ObjectFactory.class, com.travelport.schema.common_v35_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirRefundQuotePortType {

    @WebResult(name = "AirRefundQuoteRsp", targetNamespace = "http://www.travelport.com/schema/air_v35_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    public com.travelport.schema.air_v35_0.AirRefundQuoteRsp service(
        @WebParam(partName = "parameters", name = "AirRefundQuoteReq", targetNamespace = "http://www.travelport.com/schema/air_v35_0")
        com.travelport.schema.air_v35_0.AirRefundQuoteReq parameters
    ) throws AirFaultMessage;
}
