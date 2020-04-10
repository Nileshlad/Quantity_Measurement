package com.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    //variable
    double feetValue;

    public QuantityMeasurement(double feetValue) {
        this.feetValue = feetValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuantityMeasurement)) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feetValue, feetValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feetValue);
    }

    public static void main(String[] args) {
    }
}