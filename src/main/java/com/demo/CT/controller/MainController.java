package com.demo.CT.controller;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.product.Product;
import com.demo.CT.Client;
import com.demo.CT.CustomerService;
import com.demo.CT.Details;
import com.demo.CT.mail.MailService;
import com.demo.CT.mail.SendMailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@Controller
public class MainController {

    static CustomerService customerService = new CustomerService();

    ProjectApiRoot projectApiRoot = new Client().createApiClient();

    @Autowired
    SendMailService sendMailService;



    @Autowired
    MailService mailService;


    @RequestMapping(value="/beta")
    public String home()
    {
        System.out.println("This is home page");
        return "mr";
    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String showForm(Model model)
    {
        Details details = new Details();
        model.addAttribute("form",details);
        return "form";
    }
    @RequestMapping(value = "/qwerty",method = RequestMethod.POST)
    public String saveForm(@Valid @ModelAttribute("form") Details details, BindingResult result,Model model)
    {
        if (result.hasErrors()) {
//            model.addAttribute("form", details);
            return "form";
        }
            // Return appropriate response or redirect to an error page
//            model.addAttribute("error",result.getFieldError());
        Customer customer =  customerService.createCustomer(details);
//        customerService.sentMail();
//        sendMailService.sendMail();
        System.out.println(customer.getId());
        model.addAttribute("id",customer.getId());
        return "success";

    }

    @GetMapping("/getCus")
    String getAllCustomer(Model model)
    {
        List<Customer> customer = projectApiRoot.customers().get().executeBlocking().getBody().getResults();
        model.addAttribute("count",customer.stream().count());
        model.addAttribute("cus",customer);
        return "customer";
    }

    /*@RequestMapping(value = "/index")
    public String index() {
        return "index";
    }*/
    @RequestMapping("/Product")
    public String getProduct(Model model)
    {
//        Product product = customerService.getProduct("ec6399a2-8ea7-4fae-8c2c-5204691e7cbe");
        List<Product> product = projectApiRoot.products().get().executeBlocking().getBody().getResults();

        model.addAttribute("pd",product.get(0).getMasterData().getCurrent().getName().get("en"));
        model.addAttribute("img",product);

        return "product";
//        return product.getMasterData().getCurrent().getVariants().get(0).getImages();
//        return "Hey, ComeOn to onboarding Process";
    }
    @RequestMapping("/Product/{id}")
    public String getProductById(Model model, @PathVariable String id)
    {
        Product product = customerService.getProduct(id);
//        List<Product> product = projectApiRoot.products().get().executeBlocking().getBody().getResults();
        try {
            model.addAttribute("pdsById", product.getMasterData().getCurrent().getMasterVariant().getImages().get(0).getUrl());
            model.addAttribute("pdSku", product.getMasterData().getCurrent().getMasterVariant().getSku());
            model.addAttribute("name", product.getMasterData().getCurrent().getName().get(Locale.ENGLISH));
            model.addAttribute("price", product.getMasterData().getCurrent().getMasterVariant().getPrices().get(0).getValue().getCentAmount());
//        System.out.println(product.getMasterData().getCurrent().getMasterVariant().getPrice().getValue().getCentAmount());

            return "pdp";
        } catch (Exception e) {
            return "product";
        }
//        return product.getMasterData().getCurrent().getVariants().get(0).getImages();
//        return "Hey, ComeOn to onboarding Process";
    }
}
