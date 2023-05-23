package com.demo.CT.controller;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.product.Product;
import com.demo.CT.CustomerService;
import com.demo.CT.Details;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class TestController {
   static CustomerService cs = new CustomerService();


    @RequestMapping("/enjoy")
    public String firstHandler()
    {
        return "Hey, welcome to onboarding Process";
    }
    @RequestMapping("/customer")
    public static Details getCustomerById(final Details details)
    {
        Customer customer = cs.getCustomerById("2674c410-b664-47fd-a60b-03f129fad9fc");
        details.setId(customer.getId());
        details.setCustomerId(customer.getCustomerNumber());
        details.setExternalId(customer.getExternalId());
        details.setTitle(customer.getTitle());
        details.setFirstName(customer.getFirstName());
        details.setLastName(customer.getLastName());
        details.setEmail(customer.getEmail());
//        String ye = customer.getFirstName();
        return details;

    }
    @RequestMapping(value = "/aayu",method = RequestMethod.GET)
    public String secondHandler()
    {
        return "Hey, ComeOn to onboarding Process";
    }

    @RequestMapping("/aayuProduct")
    public List getProduct()
    {
      Product product = cs.getProduct("f3c3d3d7-9a0c-409a-b651-dd23231ab565");
       return product.getMasterData().getCurrent().getVariants().get(0).getImages();
//        return "Hey, ComeOn to onboarding Process";
    }
}
