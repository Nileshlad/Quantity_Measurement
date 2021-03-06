package com.quantitymeasurement;

public enum Unit {
    //all unit converter
    FEET(UnitType.LENGTH, 12),
    INCH(UnitType.LENGTH, 1),
    YARD(UnitType.LENGTH, 36),
    CM(UnitType.LENGTH, 1 / 2.54),
    LITER(UnitType.LIQUID_WEIGHT, 1000),
    GALLON(UnitType.LIQUID_WEIGHT, 3780),
    ML(UnitType.LIQUID_WEIGHT, 0.001),
    KG(UnitType.SOLID_WEIGHT,1),
    GRAMS(UnitType.SOLID_WEIGHT,0.001),
    TON(UnitType.SOLID_WEIGHT,1000),
    FAHRENHEIT(UnitType.TEMPERATURE, 1),
    CELSIUS(UnitType.TEMPERATURE, 2.12);


    public double unitValue;
    public UnitType unitType;
    Unit(UnitType unitType, double value) {
        this.unitType = unitType;
        this.unitValue = value;
    }
}