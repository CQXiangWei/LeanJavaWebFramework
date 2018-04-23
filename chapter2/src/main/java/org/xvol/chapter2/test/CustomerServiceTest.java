package org.xvol.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.xvol.chapter2.model.Customer;
import org.xvol.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;

public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {

    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertTrue(customerList.size() > 0);
    }

    @Test
    public void getCustomerTest() throws Exception {
        Customer customer = customerService.getCustomer(1);
        Assert.assertTrue(customer.getId() == 1);
    }

    @Test
    public void createCustomerTest() throws Exception {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "lily");
        hashMap.put("contact", "telephone");
        hashMap.put("telephone","9090960");
        boolean result = customerService.createCustomer(hashMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("name", "Eric");
        boolean result = customerService.updateCustomer(1, hashMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() {
        boolean result = customerService.deleteCustomer(1);
        Assert.assertTrue(result);
    }
}
