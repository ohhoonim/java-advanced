package com.ohhoonim.java.advanced.exceptions;

public class MyNumberException extends RuntimeException {
    public MyNumberException() {
        super();
    }

    public MyNumberException(String message) {
        super(message);
    }

    public MyNumberException(Throwable cause) {
        super(cause);
    }

    public MyNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
