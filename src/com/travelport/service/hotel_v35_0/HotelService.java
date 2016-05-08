package com.travelport.service.hotel_v35_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-09T16:22:43.869-07:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "HotelService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/hotel_v35_0/Hotel.wsdl",
                  targetNamespace = "http://www.travelport.com/service/hotel_v35_0") 
public class HotelService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelService");
    public final static QName HotelKeywordsServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelKeywordsServicePort");
    public final static QName HotelMediaLinksServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelMediaLinksServicePort");
    public final static QName HotelRetrieveServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelRetrieveServicePort");
    public final static QName HotelSearchServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelSearchServicePort");
    public final static QName HotelRulesServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelRulesServicePort");
    public final static QName HotelDetailsServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelDetailsServicePort");
    public final static QName HotelSuperShopperServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelSuperShopperServicePort");
    public final static QName HotelSearchAvailabilityAsynchServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelSearchAvailabilityAsynchServicePort");
    public final static QName RetrieveHotelSearchAvailabilityServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "RetrieveHotelSearchAvailabilityServicePort");
    public final static QName HotelUpsellSearchServicePort = new QName("http://www.travelport.com/service/hotel_v35_0", "HotelUpsellSearchServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/hotel_v35_0/Hotel.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/hotel_v35_0/Hotel.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HotelService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HotelService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HotelService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HotelKeywordsServicePortType
     */
    @WebEndpoint(name = "HotelKeywordsServicePort")
    public HotelKeywordsServicePortType getHotelKeywordsServicePort() {
        return super.getPort(HotelKeywordsServicePort, HotelKeywordsServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelKeywordsServicePortType
     */
    @WebEndpoint(name = "HotelKeywordsServicePort")
    public HotelKeywordsServicePortType getHotelKeywordsServicePort(WebServiceFeature... features) {
        return super.getPort(HotelKeywordsServicePort, HotelKeywordsServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelMediaLinksServicePortType
     */
    @WebEndpoint(name = "HotelMediaLinksServicePort")
    public HotelMediaLinksServicePortType getHotelMediaLinksServicePort() {
        return super.getPort(HotelMediaLinksServicePort, HotelMediaLinksServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelMediaLinksServicePortType
     */
    @WebEndpoint(name = "HotelMediaLinksServicePort")
    public HotelMediaLinksServicePortType getHotelMediaLinksServicePort(WebServiceFeature... features) {
        return super.getPort(HotelMediaLinksServicePort, HotelMediaLinksServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelRetrieveServicePortType
     */
    @WebEndpoint(name = "HotelRetrieveServicePort")
    public HotelRetrieveServicePortType getHotelRetrieveServicePort() {
        return super.getPort(HotelRetrieveServicePort, HotelRetrieveServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelRetrieveServicePortType
     */
    @WebEndpoint(name = "HotelRetrieveServicePort")
    public HotelRetrieveServicePortType getHotelRetrieveServicePort(WebServiceFeature... features) {
        return super.getPort(HotelRetrieveServicePort, HotelRetrieveServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelSearchServicePortType
     */
    @WebEndpoint(name = "HotelSearchServicePort")
    public HotelSearchServicePortType getHotelSearchServicePort() {
        return super.getPort(HotelSearchServicePort, HotelSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelSearchServicePortType
     */
    @WebEndpoint(name = "HotelSearchServicePort")
    public HotelSearchServicePortType getHotelSearchServicePort(WebServiceFeature... features) {
        return super.getPort(HotelSearchServicePort, HotelSearchServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelRulesServicePortType
     */
    @WebEndpoint(name = "HotelRulesServicePort")
    public HotelRulesServicePortType getHotelRulesServicePort() {
        return super.getPort(HotelRulesServicePort, HotelRulesServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelRulesServicePortType
     */
    @WebEndpoint(name = "HotelRulesServicePort")
    public HotelRulesServicePortType getHotelRulesServicePort(WebServiceFeature... features) {
        return super.getPort(HotelRulesServicePort, HotelRulesServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelDetailsServicePortType
     */
    @WebEndpoint(name = "HotelDetailsServicePort")
    public HotelDetailsServicePortType getHotelDetailsServicePort() {
        return super.getPort(HotelDetailsServicePort, HotelDetailsServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelDetailsServicePortType
     */
    @WebEndpoint(name = "HotelDetailsServicePort")
    public HotelDetailsServicePortType getHotelDetailsServicePort(WebServiceFeature... features) {
        return super.getPort(HotelDetailsServicePort, HotelDetailsServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelSuperShopperServicePortType
     */
    @WebEndpoint(name = "HotelSuperShopperServicePort")
    public HotelSuperShopperServicePortType getHotelSuperShopperServicePort() {
        return super.getPort(HotelSuperShopperServicePort, HotelSuperShopperServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelSuperShopperServicePortType
     */
    @WebEndpoint(name = "HotelSuperShopperServicePort")
    public HotelSuperShopperServicePortType getHotelSuperShopperServicePort(WebServiceFeature... features) {
        return super.getPort(HotelSuperShopperServicePort, HotelSuperShopperServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelSearchAvailabilityAsynchServicePortType
     */
    @WebEndpoint(name = "HotelSearchAvailabilityAsynchServicePort")
    public HotelSearchAvailabilityAsynchServicePortType getHotelSearchAvailabilityAsynchServicePort() {
        return super.getPort(HotelSearchAvailabilityAsynchServicePort, HotelSearchAvailabilityAsynchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelSearchAvailabilityAsynchServicePortType
     */
    @WebEndpoint(name = "HotelSearchAvailabilityAsynchServicePort")
    public HotelSearchAvailabilityAsynchServicePortType getHotelSearchAvailabilityAsynchServicePort(WebServiceFeature... features) {
        return super.getPort(HotelSearchAvailabilityAsynchServicePort, HotelSearchAvailabilityAsynchServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns RetrieveHotelSearchAvailabilityServicePortType
     */
    @WebEndpoint(name = "RetrieveHotelSearchAvailabilityServicePort")
    public RetrieveHotelSearchAvailabilityServicePortType getRetrieveHotelSearchAvailabilityServicePort() {
        return super.getPort(RetrieveHotelSearchAvailabilityServicePort, RetrieveHotelSearchAvailabilityServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RetrieveHotelSearchAvailabilityServicePortType
     */
    @WebEndpoint(name = "RetrieveHotelSearchAvailabilityServicePort")
    public RetrieveHotelSearchAvailabilityServicePortType getRetrieveHotelSearchAvailabilityServicePort(WebServiceFeature... features) {
        return super.getPort(RetrieveHotelSearchAvailabilityServicePort, RetrieveHotelSearchAvailabilityServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelUpsellSearchServicePortType
     */
    @WebEndpoint(name = "HotelUpsellSearchServicePort")
    public HotelUpsellSearchServicePortType getHotelUpsellSearchServicePort() {
        return super.getPort(HotelUpsellSearchServicePort, HotelUpsellSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelUpsellSearchServicePortType
     */
    @WebEndpoint(name = "HotelUpsellSearchServicePort")
    public HotelUpsellSearchServicePortType getHotelUpsellSearchServicePort(WebServiceFeature... features) {
        return super.getPort(HotelUpsellSearchServicePort, HotelUpsellSearchServicePortType.class, features);
    }

}
