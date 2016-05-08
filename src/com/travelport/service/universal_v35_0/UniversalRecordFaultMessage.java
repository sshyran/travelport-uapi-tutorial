
package com.travelport.service.universal_v35_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-08T13:24:24.760-06:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v35_0")
public class UniversalRecordFaultMessage extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.travelport.schema.common_v35_0.ErrorInfo errorInfo;

    public UniversalRecordFaultMessage() {
        super();
    }
    
    public UniversalRecordFaultMessage(String message) {
        super(message);
    }
    
    public UniversalRecordFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UniversalRecordFaultMessage(String message, com.travelport.schema.common_v35_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public UniversalRecordFaultMessage(String message, com.travelport.schema.common_v35_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v35_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}
