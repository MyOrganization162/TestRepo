package com.authentication.exception.signup;

public class UserAlreadyValidated extends Exception {
    public UserAlreadyValidated(String message) {
        super(message);
    }
}
