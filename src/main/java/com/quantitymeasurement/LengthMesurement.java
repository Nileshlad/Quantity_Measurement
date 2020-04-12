package com.quantitymeasurement;

import com.exception.QuantityMeasurementException;

public class LengthMesurement {
    public enum Unit {
        FEET, INCH
    }

    Unit unit;
    double measure;

    public LengthMesurement(Unit unit, double measure) throws QuantityMeasurementException {
        try {
            this.unit = unit;
            this.measure = measure;
        } catch (NullPointerException n) {
            throw new QuantityMeasurementException(n.getMessage(), QuantityMeasurementException.Type.Null_check);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthMesurement that = (LengthMesurement) o;
        if (measure == 0 && that.measure == 0)
            return true;
        return Double.compare(that.measure, measure) == 0 &&
                this.unit == that.unit;
    }
}