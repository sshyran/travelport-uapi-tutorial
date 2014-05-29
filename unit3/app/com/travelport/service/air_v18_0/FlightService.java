package com.travelport.service.air_v18_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2012-04-23T10:42:57.036+02:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "FlightService", 
                  wsdlLocation = "http://localhost:8080/kestrel/AirService?wsdl",
                  targetNamespace = "http://www.travelport.com/service/air_v18_0") 
public class FlightService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/air_v18_0", "FlightService");
    public final static QName FlightDetailsPort = new QName("http://www.travelport.com/service/air_v18_0", "FlightDetailsPort");
    public final static QName FlightInfoPort = new QName("http://www.travelport.com/service/air_v18_0", "FlightInfoPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/kestrel/AirService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FlightService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/kestrel/AirService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FlightService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FlightService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns FlightDetailsPortType
     */
    @WebEndpoint(name = "FlightDetailsPort")
    public FlightDetailsPortType getFlightDetailsPort() {
        return super.getPort(FlightDetailsPort, FlightDetailsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightDetailsPortType
     */
    @WebEndpoint(name = "FlightDetailsPort")
    public FlightDetailsPortType getFlightDetailsPort(WebServiceFeature... features) {
        return super.getPort(FlightDetailsPort, FlightDetailsPortType.class, features);
    }
    /**
     *
     * @return
     *     returns FlightInfoPortType
     */
    @WebEndpoint(name = "FlightInfoPort")
    public FlightInfoPortType getFlightInfoPort() {
        return super.getPort(FlightInfoPort, FlightInfoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightInfoPortType
     */
    @WebEndpoint(name = "FlightInfoPort")
    public FlightInfoPortType getFlightInfoPort(WebServiceFeature... features) {
        return super.getPort(FlightInfoPort, FlightInfoPortType.class, features);
    }

}
