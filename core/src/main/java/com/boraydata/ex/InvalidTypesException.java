package com.boraydata.ex;

public class InvalidTypesException extends InvalidProgramException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new exception with no message.
     */
    public InvalidTypesException() {
        super();
    }

    /**
     * Creates a new exception with the given message.
     *
     * @param message The exception message.
     */
    public InvalidTypesException(String message) {
        super(message);
    }

    public InvalidTypesException(String message, Throwable e) {
        super(message, e);
    }
}

