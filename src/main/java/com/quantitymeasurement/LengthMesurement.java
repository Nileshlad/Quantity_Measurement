package com.quantitymeasurement;

public class LengthMesurement {
    Unit unit;
    double measure;

    public LengthMesurement(Unit unit, double measure) {
        this.unit = unit;
        this.measure = measure;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthMesurement that = (LengthMesurement) o;
        double value1 = this.unit.convertor(measure);
        double value2 = that.unit.convertor(that.measure);
        if (measure == 0 && that.measure == 0)
            return true;
        if (value1 == value2)
            return true;
        return Double.compare(that.measure, measure) == 0 &&
                this.unit == that.unit;
    }
}