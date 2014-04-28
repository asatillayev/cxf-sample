package com.cxf.sample.service.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-04-27T23:50:21.679-07:00
 * Generated source version: 2.7.11
 */
@WebService(targetNamespace = "http://sample.cxf.com/service/Orders/", name = "Orders")
@XmlSeeAlso({com.cxf.sample.schema.orders.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Orders {

    @WebResult(name = "orderInquiryResponse", targetNamespace = "http://sample.cxf.com/schema/Orders/", partName = "orderInquiryResponse")
    @WebMethod(operationName = "ProcessOrderPlacement", action = "http://sample.cxf.com/service/Orders/NewOperation")
    public com.cxf.sample.schema.orders.OrderInquiryResponseType processOrderPlacement(
            @WebParam(partName = "orderInquiry", name = "orderInquiry", targetNamespace = "http://sample.cxf.com/schema/Orders/")
            com.cxf.sample.schema.orders.OrderInquiryType orderInquiry
    );
}
