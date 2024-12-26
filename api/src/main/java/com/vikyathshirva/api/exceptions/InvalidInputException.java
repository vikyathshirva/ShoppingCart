package com.vikyathshirva.api.exceptions;


/**
 * InvalidInputException
 */
public class InvalidInputException extends RuntimeException {

    public InvalidInputException(){};

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }
}
