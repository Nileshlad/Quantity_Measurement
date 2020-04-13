package com.quantitymeasurement;

public enum Unit {
    FEET(12),
    INCH(1),
    YARD(36);

    private double unitValue;

    Unit(double i) {
        unitValue = i;
    }

    public double convertor(double value) {
        return this.unitValue * value;
    }
}