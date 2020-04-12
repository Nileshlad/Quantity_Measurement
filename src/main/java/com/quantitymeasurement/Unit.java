package com.quantitymeasurement;

public enum Unit {

    FEET {
        @Override
        public double convertor(double value) {
            return value * 12;
        }
    },
    INCH {
        @Override
        public double convertor(double value) {
            return value;
        }
    };

    public abstract double convertor(double value);
}