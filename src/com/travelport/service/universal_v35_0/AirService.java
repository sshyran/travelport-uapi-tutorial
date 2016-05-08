package com.travelport.service.universal_v35_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-08T13:24:25.927-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "AirService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v35_0") 
public class AirService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v35_0", "AirService");
    public final static QName AirCreateReservationPort = new QName("http://www.travelport.com/service/universal_v35_0", "AirCreateReservationPort");
    public final static QName AirMerchandisingFulfillmentPort = new QName("http://www.travelport.com/service/universal_v35_0", "AirMerchandisingFulfillmentPort");
    public final static QName AirCancelPort = new QName("http://www.travelport.com/service/universal_v35_0", "AirCancelPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AirService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AirService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AirService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AirService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AirService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AirService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AirService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AirCreateReservationPortType
     */
    @WebEndpoint(name = "AirCreateReservationPort")
    public AirCreateReservationPortType getAirCreateReservationPort() {
        return super.getPort(AirCreateReservationPort, AirCreateReservationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirCreateReservationPortType
     */
    @WebEndpoint(name = "AirCreateReservationPort")
    public AirCreateReservationPortType getAirCreateReservationPort(WebServiceFeature... features) {
        return super.getPort(AirCreateReservationPort, AirCreateReservationPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirMerchandisingFulfillmentPortType
     */
    @WebEndpoint(name = "AirMerchandisingFulfillmentPort")
    public AirMerchandisingFulfillmentPortType getAirMerchandisingFulfillmentPort() {
        return super.getPort(AirMerchandisingFulfillmentPort, AirMerchandisingFulfillmentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirMerchandisingFulfillmentPortType
     */
    @WebEndpoint(name = "AirMerchandisingFulfillmentPort")
    public AirMerchandisingFulfillmentPortType getAirMerchandisingFulfillmentPort(WebServiceFeature... features) {
        return super.getPort(AirMerchandisingFulfillmentPort, AirMerchandisingFulfillmentPortType.class, features);
    }


    /**
     *
     * @return
     *     returns AirCancelPortType
     */
    @WebEndpoint(name = "AirCancelPort")
    public AirCancelPortType getAirCancelPort() {
        return super.getPort(AirCancelPort, AirCancelPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirCancelPortType
     */
    @WebEndpoint(name = "AirCancelPort")
    public AirCancelPortType getAirCancelPort(WebServiceFeature... features) {
        return super.getPort(AirCancelPort, AirCancelPortType.class, features);
    }

}
