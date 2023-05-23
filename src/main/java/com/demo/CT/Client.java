package com.demo.CT;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;


public class Client {
    private static String projectKey = "sunrisedata-new";
    private static   String client_id = "doUUzpEkBigxoeDI14mOoIN6";
    private static String client_secret = "sYKNydnylQVr6wBJdijHB_JI7boDqWuz";
    public static ProjectApiRoot createApiClient() {
        final ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId(client_id)
                                .withClientSecret(client_secret)
                                .build(),
                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build(projectKey);

        return apiRoot;
    }
}
		