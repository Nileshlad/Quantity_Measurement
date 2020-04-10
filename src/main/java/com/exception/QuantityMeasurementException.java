package com.exception;

public class QuantityMeasurementException extends Exception {
    public enum Type {Null_check}

    ;
    public Type type;

    public QuantityMeasurementException(String message, Type type) {
        super(message);
        this.type = type;
    }
}
