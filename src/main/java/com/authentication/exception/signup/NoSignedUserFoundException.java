package com.authentication.exception.signup;

public class NoSignedUserFoundException extends Throwable {
    public NoSignedUserFoundException(String message) {
        super(message);
    }
}
