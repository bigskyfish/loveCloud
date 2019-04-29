package com.floatCloud.loveLearn.common.utils;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BeanValidator implements ConstraintValidator<ValidatorParam, String> {

    private String value;

    public void initialize(ValidatorParam validatorParam) {
        this.value = validatorParam.value();
    }

    /*校验方法*/
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null) {
            return true;
        }
        if (s.length() > 3) {
            return true;
        } else {
            return false;
        }
    }

}
