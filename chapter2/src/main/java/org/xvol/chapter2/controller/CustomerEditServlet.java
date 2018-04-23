package org.xvol.chapter2.controller;

import org.xvol.chapter2.model.Customer;
import org.xvol.chapter2.service.CustomerService;
import org.xvol.chapter2.util.CastUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {
    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        super.init();
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = customerService.getCustomer(CastUtil.castLong(req.getAttribute("id"), 0));
        if (customer != null) {
            req.setAttribute("customer", customer);
            req.getRequestDispatcher("/WEB-INF/view/customer_edit.jsp").forward(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "无效的玩家ID");
        }
//        int id = ;
//        if (id != 0) {
//            req.setAttribute();
//        }
        //req.setAttribute("customer", customerService.getCustomer(req.getAttribute()));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
