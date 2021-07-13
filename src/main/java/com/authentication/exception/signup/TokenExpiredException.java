package com.authentication.exception.signup;

public class TokenExpiredException extends Throwable {
    public TokenExpiredException(String message) {
        super(message);
    }
}
