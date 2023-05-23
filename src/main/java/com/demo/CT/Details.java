package com.demo.CT;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Details {
//    @NotBlank(message = "Company is required")
    public String company;

    public String Id;
//
    @NotBlank(message = "CustomerId is required")
    @Size(max = 7, message = "CustomerId must be less than or equal to 7 digit")
    public String customerId;

    @NotBlank(message = "ExternalId is required")
    @Size(max = 7, message = "ExternalId must be less than or equal to 7 digit")
    public String externalId;

//    @NotBlank(message = "Title is required")
    public String title;

    @NotBlank(message = "First Name is required")
    @Size(max = 10, message = "First Name should not exceed 10 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First Name should only contain alphabetic characters")
    public String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(max = 10, message = "Last Name should not exceed 10 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last Name should only contain alphabetic characters")
    public String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    public String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password should have at least 6 characters")
    public String password;


}
