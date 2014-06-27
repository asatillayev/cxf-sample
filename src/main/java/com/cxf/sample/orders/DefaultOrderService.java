package com.cxf.sample.orders;

import com.cxf.sample.schema.orders.*;
import org.springframework.stereotype.Service;

/**
 * User: Jamshid Asatillayev
 * Date: 5/25/2014
 * Time: 13:48 PM
 */
@Service
public class DefaultOrderService implements OrderService {
    @Override
    public OrderInquiryResponseType processOrder(int uniqueOrderId, int orderQuantity, int accountId, long ean13) {
        ObjectFactory factory = new ObjectFactory();
        final OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
        final AccountType account = factory.createAccountType();
        final OrderInquiryType orderItem = factory.createOrderInquiryType();
        final BookType book = factory.createBookType();
        book.setEan13(ean13);
        book.setTitle("some book from cxf");
        account.setAccountId(accountId);

        return response;
    }
}
