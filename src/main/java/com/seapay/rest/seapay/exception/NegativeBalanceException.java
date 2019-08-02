package com.seapay.rest.seapay.exception;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super();
    }

    public NegativeBalanceException(String message) {
        super(message);
    }

    public NegativeBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
