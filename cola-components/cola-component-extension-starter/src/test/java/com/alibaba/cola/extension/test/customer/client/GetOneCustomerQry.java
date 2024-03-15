package com.alibaba.cola.extension.test.customer.client;

import com.alibaba.cola.dto.Query;
import lombok.Getter;
import lombok.Setter;

/**
 * GetOneCustomerQry
 *
 * @author Frank Zhang 2018-01-06 7:38 PM
 */
@Setter
@Getter
public class GetOneCustomerQry extends Query{
    private long customerId;
    private String companyName;
}
