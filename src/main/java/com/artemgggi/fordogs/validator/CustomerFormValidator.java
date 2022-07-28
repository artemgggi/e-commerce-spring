package com.artemgggi.fordogs.validator;

import com.artemgggi.fordogs.form.CustomerForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component
public class CustomerFormValidator {

    //private EmailValidator emailValidator = EmailValidator.getInstance();

    // This validator only checks for the CustomerForm.

    public boolean supports(Class<?> clazz) {
        return clazz == CustomerForm.class;
    }


    public void validate(Object target, Errors errors) {
        CustomerForm custInfo = (CustomerForm) target;

        // Check the fields of CustomerForm.
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.customerForm.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.customerForm.email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.customerForm.address");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "NotEmpty.customerForm.phone");

        //if (!emailValidator.isValid(custInfo.getEmail())) {
           // errors.rejectValue("email", "Pattern.customerForm.email");
        }
}