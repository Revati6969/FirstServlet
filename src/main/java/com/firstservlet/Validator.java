package com.firstservlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    String userNamePattern = "^[A-Z][a-z]{2,}$";

    public boolean validator(String pattern, String input) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(input);
        return matcher.matches();
    }

    public boolean userName(String username) {
        return validator(userNamePattern, username);
    }
}
