package com;

import com.exception.QuantityMeasurementException;

import java.util.Objects;

public class Inch {
    double inchValue;

    public Inch(double inchValue) {
        this.inchValue = inchValue;
    }

    //constructor method to exception
    public Inch(Double aDouble) throws QuantityMeasurementException {
        try {
            this.inchValue = inchValue;
        } catch (NullPointerException n) {
            throw new QuantityMeasurementException(n.getMessage(), QuantityMeasurementException.Type.Null_check);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inch)) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.inchValue, inchValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inchValue);
    }
}
