package com.demo.CT;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.product.Product;

public class CustomerDataProvider {
   ProjectApiRoot apiRoot=Client.createApiClient();

    public Customer getCustomerById(String id) {
        return apiRoot.customers().withId(id).get().executeBlocking().getBody();
    }

    public Product getProduct(String id) {
        return apiRoot.products().withId(id).get().executeBlocking().getBody();
    }


    public Customer createCustomer(CustomerDraft newCustomerDraft) {
        return apiRoot.customers().post(newCustomerDraft).executeBlocking().getBody().getCustomer();
    }

  /*  public Customer reyu(Details details) {
        return apiRoot.customers().post((CustomerDraft) details).executeBlocking().getBody().getCustomer();
    }*/
}
