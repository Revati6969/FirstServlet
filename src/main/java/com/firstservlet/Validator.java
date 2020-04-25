package com.firstservlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    String userNamePattern = "^[A-Z][a-z]{2,}$";
    String passwordPattern = "^(?=.{8})(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$";

    public boolean validator(String pattern, String input) {
        Pattern patterns = Pattern.compile(pattern);
        Matcher matcher = patterns.matcher(input);
        return matcher.matches();
    }

    public boolean userNameValidation(String username) {
        return validator(userNamePattern, username);
    }

    public boolean passwordValidation(String password){
        if(validator(passwordPattern, password))
            return true;
        return false;
    }
}
