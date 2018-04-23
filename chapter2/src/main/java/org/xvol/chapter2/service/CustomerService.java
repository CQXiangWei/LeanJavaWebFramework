package org.xvol.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xvol.chapter2.helper.DatabaseHelper;
import org.xvol.chapter2.model.Customer;

import java.util.*;

public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        return DatabaseHelper.queryEntityList(Customer.class, "select * from customer");
    }

    public  Customer getCustomer(long id) {
        return DatabaseHelper.queryEntity(Customer.class, "select * from customer where id =" + id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
