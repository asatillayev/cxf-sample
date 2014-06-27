package com.cxf.sample.orders;

import com.cxf.sample.schema.orders.OrderInquiryResponseType;
import org.springframework.stereotype.Service;

/**
 * User: Jamshid Asatillayev
 * Date: 5/25/2014
 * Time: 13:45 PM
 */

public interface OrderService {
    OrderInquiryResponseType processOrder(int uniqueOrderId, int orderQuantitiy,
                                          int accountId, long ean13);
}
