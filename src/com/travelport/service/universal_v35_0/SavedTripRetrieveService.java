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
 * 2016-05-15T12:42:02.510-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "SavedTripRetrieveService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v35_0") 
public class SavedTripRetrieveService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v35_0", "SavedTripRetrieveService");
    public final static QName SavedTripRetrieveServicePort = new QName("http://www.travelport.com/service/universal_v35_0", "SavedTripRetrieveServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SavedTripRetrieveService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SavedTripRetrieveService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SavedTripRetrieveService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SavedTripRetrieveService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SavedTripRetrieveService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SavedTripRetrieveService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SavedTripRetrieveService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SavedTripRetrieveServicePortType
     */
    @WebEndpoint(name = "SavedTripRetrieveServicePort")
    public SavedTripRetrieveServicePortType getSavedTripRetrieveServicePort() {
        return super.getPort(SavedTripRetrieveServicePort, SavedTripRetrieveServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SavedTripRetrieveServicePortType
     */
    @WebEndpoint(name = "SavedTripRetrieveServicePort")
    public SavedTripRetrieveServicePortType getSavedTripRetrieveServicePort(WebServiceFeature... features) {
        return super.getPort(SavedTripRetrieveServicePort, SavedTripRetrieveServicePortType.class, features);
    }

}
