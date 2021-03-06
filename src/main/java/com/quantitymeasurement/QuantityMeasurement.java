package com.quantitymeasurement;

public class QuantityMeasurement {
    Unit unit;
    double measurement;

    public QuantityMeasurement(Unit unit, double measurement) {
        this.unit = unit;
        this.measurement = measurement;
    }

    public void convertor(QuantityMeasurement... measurement) {
        for (int i = 0; i < measurement.length; i++) {
            measurement[i].measurement = Math.round(measurement[i].measurement * measurement[i].unit.unitValue);
            measurement[i].unit = Unit.INCH;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        if (this.unit.unitType != (that.unit.unitType)) {
            return false;
        }
        convertor(this, that);
        return Double.compare(that.measurement, measurement) == 0;
    }


    public double getAddition(QuantityMeasurement that) {
        convertor(this, that);
        return this.measurement + that.measurement;
    }
}