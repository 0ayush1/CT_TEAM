package com.demo.CT;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.project.Project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.CT.Client;
@SpringBootApplication
public class DemoCtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCtApplication.class, args);
		ProjectApiRoot apiRoot = Client.createApiClient();

// Make a get call to the Project
		Project myProject = apiRoot
				.get()
				.executeBlocking()
				.getBody();

// Output the Project name
		System.out.println(myProject.getName());


	}

}
