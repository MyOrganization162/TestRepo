package com.authentication.exception.signup;

public class TokenDoesNotExistException extends Exception {
    public TokenDoesNotExistException(String message) {
        super(message);
    }
}
