package com.demo.CT.validator;

import com.demo.CT.Details;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class DetailsValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Details.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Details details = new Details();
        String firstName = details.getFirstName();

        if(StringUtils.isBlank(firstName)){
            errors.rejectValue("firstName" , "First Name not be empty");
        }

    }
}
