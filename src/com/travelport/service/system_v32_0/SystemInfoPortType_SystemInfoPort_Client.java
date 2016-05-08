
package com.travelport.service.system_v32_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-02T16:28:27.250-07:00
 * Generated source version: 3.1.5
 * 
 */
public final class SystemInfoPortType_SystemInfoPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/system_v32_0", "SystemService");

    private SystemInfoPortType_SystemInfoPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SystemService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SystemService ss = new SystemService(wsdlURL, SERVICE_NAME);
        SystemInfoPortType port = ss.getSystemInfoPort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.system_v32_0.SystemInfoReq _service_parameters = new com.travelport.schema.system_v32_0.SystemInfoReq();
        try {
            com.travelport.schema.system_v32_0.SystemInfoRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (SystemFaultMessage e) { 
            System.out.println("Expected exception: SystemFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
