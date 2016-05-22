
package com.travelport.service.universal_v35_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-15T12:41:59.657-06:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v35_0")
public class VehicleFaultMessage extends Exception {
    
    private com.travelport.schema.common_v35_0.ErrorInfo errorInfo;

    public VehicleFaultMessage() {
        super();
    }
    
    public VehicleFaultMessage(String message) {
        super(message);
    }
    
    public VehicleFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleFaultMessage(String message, com.travelport.schema.common_v35_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public VehicleFaultMessage(String message, com.travelport.schema.common_v35_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v35_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}
