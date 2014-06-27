package com.cxf.sample.orders;

import com.cxf.sample.schema.orders.AccountType;
import com.cxf.sample.schema.orders.ObjectFactory;
import com.cxf.sample.schema.orders.OrderInquiryResponseType;
import com.cxf.sample.schema.orders.OrderInquiryType;
import com.cxf.sample.service.orders.Orders;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * User: Jamshid Asatillayev
 * Date: 5/25/2014
 * Time: 13:23 PM
 */
@WebService(portName = "OrdersSOAP", serviceName = "Orders",
        endpointInterface = "com.cxf.sample.service.orders.Orders",
        targetNamespace = "http://sample.cxf.com/schema/Orders/")
public class DefaultOrdersEndpoint implements Orders {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {
        ObjectFactory factory = new ObjectFactory();
        final OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
        final AccountType account = factory.createAccountType();
        account.setAccountId(1);
        response.setAccount(account);
        return response;
    }

}
