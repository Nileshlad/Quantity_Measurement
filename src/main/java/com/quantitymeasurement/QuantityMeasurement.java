package com.quantitymeasurement;

import com.exception.QuantityMeasurementException;

import java.util.Objects;

public class QuantityMeasurement {

    //variable
    double feetValue;

    //constructor of feet
    public QuantityMeasurement(double feetValue) {
        this.feetValue = feetValue;
    }

    //constructor method to exception
    public QuantityMeasurement(Double aDouble) throws QuantityMeasurementException {
        try {
            this.feetValue = feetValue;
        } catch (NullPointerException n) {
            throw new QuantityMeasurementException(n.getMessage(), QuantityMeasurementException.Type.Null_check);
        }
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