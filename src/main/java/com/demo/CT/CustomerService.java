package com.demo.CT;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerDraftImpl;
import com.commercetools.api.models.product.Product;

public class CustomerService {
    private CustomerDataProvider customerDataProvider=new CustomerDataProvider();

    public Customer getCustomerById(String id) {
       return customerDataProvider.getCustomerById(id);

    }

    public Product getProduct(String id) {
       return customerDataProvider.getProduct(id);
    }

    public Customer createCustomer(Details details) {
       CustomerDraft newCustomerDraft = new CustomerDraftImpl();
        newCustomerDraft.setCustomerNumber(details.getCustomerId());
        newCustomerDraft.setExternalId(details.getExternalId());
        newCustomerDraft.setTitle(details.getTitle());
        newCustomerDraft.setFirstName(details.getFirstName());
        newCustomerDraft.setLastName(details.getLastName());
        newCustomerDraft.setEmail(details.getEmail());
        newCustomerDraft.setPassword(details.getPassword());
        newCustomerDraft.setCompanyName(details.getCompany());
        return customerDataProvider.createCustomer(newCustomerDraft);


    }

    public void sentMail() {


    }
}
