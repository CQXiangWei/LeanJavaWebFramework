package org.xvol.chapter3.controller;

import org.xvol.chapter3.model.Customer;
import org.xvol.chapter3.service.CustomerService;
import org.xvol.framework.annotation.Action;
import org.xvol.framework.annotation.Controller;
import org.xvol.framework.annotation.Inject;
import org.xvol.framework.bean.Data;
import org.xvol.framework.bean.Param;
import org.xvol.framework.bean.View;
import org.xvol.framework.helper.ConfigHelper;

import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param) {
        return new View("customer.jsp").addModel("customerList", customerService.getCustomerList());
    }

    @Action("get:/customer_show")
    public View show(Param param) {
        return new View("customer_show.jsp").addModel("customer", customerService.getCustomer(param.getLong("id")));
    }

    @Action("get:/customer_create")
    public View create(Param param) {
        return new View("customer_create.jsp");
    }

    @Action("post:/customer_create")
    public Data createSubmit(Param param) {
        Map<String, Object> fieldMap = param.getMap();
        boolean result = customerService.createCustomer(fieldMap);
        return new Data(result);
    }

    @Action("get:/customer_edit")
    public View edit(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_edit.jsp").addModel("customer", customer);
    }

    @Action("post:/customer_edit")
    public Data editSubmit(Param param) {
        long id = param.getLong("id");
        Map<String, Object> fieldMap = param.getMap();
        fieldMap.remove("id");
        boolean result = customerService.updateCustomer(id, fieldMap);
        return new Data(result);
    }

    @Action("get:/customer_delete")
    public Data delete(Param param) {
        long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        return new Data(result);
    }
}
