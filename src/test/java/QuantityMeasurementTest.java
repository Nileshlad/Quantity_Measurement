import com.exception.QuantityMeasurementException;
import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    //TEST CASE 1.1 EQUAL METHOD
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqualTrue() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    //TEST CASE 1.2
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqualfalse() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 0.1);
        boolean lengthEql = first.equals(second);
        Assert.assertEquals(false, lengthEql);
    }

    //TEST CASE 1.4 NULL CHECK
    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnExceptionTrue() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
    }

    //TEST CASE 1.6 REF CHECK
    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqualTrue() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    //INCHES TEST CASE
    //TEST CASE 1.7
    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqualTrue() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        Assert.assertEquals(first, second);
    }

    //TEST CASE 1.8
    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqualfalse() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 0.1);
        boolean lengthEql = first.equals(second);
        Assert.assertEquals(false, lengthEql);
    }

    //TEST CASE 1.9
    @Test
    public void givenSameTypeSameValueInInch_shouldReturnExceptionTrue() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 1);
        Assert.assertEquals(first, second);

    }

    //TEST CASE 1.10 REF CHECK
    @Test
    public void givenSameReferenceOfInch_shouldReturnEqualTrue() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    //FEET AND INCH TEST CASES
    //TEST CASE 1.11 CHECK FEET AND INCH EQUAL
    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }

    //TEST CASE 1.12 CHECK FEET AND INCH EQUAL
    @Test
    public void givenOneFeetAndOneInch_shouldReturnNotEquals() throws QuantityMeasurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 2);
        Assert.assertNotEquals(first, second);
    }

    //TEST CASE 1.13
    @Test
    public void givenOneInchAndOneFeet_shouldReturnNotEquals() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        Assert.assertNotEquals(inch, feet);
    }

    //TEST CASE 1.14 ONE FEET AND 12 INCH EQUAL
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12);
        Assert.assertEquals(feet, inch);
    }

    //TEST CASE 1.15 ONE INCH AND 12 INCH
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12);
        Assert.assertEquals(inch, feet);
    }

    //TEST CASE 1.16 3 FEET AND 1 YARD
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(feet, yard);
    }

    //TEST CASE 1.17 1 FEET AND 1 YARD
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertNotEquals(feet, yard);
    }

    //TEST CASE 1.18 1 YARD 36 INCH
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(yard, feet);
    }

    //TEST CASE 1.19 1 YARD 36 INCH
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(yard, inch);
    }

    //TEST CASE 1.20
    @Test
    public void given2InchAnd5Centimeter_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 5);
        Assert.assertEquals(inch, cm);
    }

    //USE CASE 4
    //TEST CASE 1.21 ADDITION OF TWO INCH
    @Test
    public void givenTwoLengthValue_shouldReturnAddition() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(4, totalValue, 0);
    }

    //TEST CASE 1.22  ADDITION OF TWO  FEET
    @Test
    public void given1FeetAnd1Fet_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(24, totalValue, 0);
    }

    //TEST CASE 1.23 ADDITION OF 1 INCH AND CM
    @Test
    public void given2InchAndCentimeter_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.CM, 2.5);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(3, totalValue, 0);
    }

    //TEST CASE 1.24 ADDITION 1 FEET AND 2 INCH
    @Test
    public void given1FeetAnd2Inch_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(14, totalValue, 0);
    }

    //use case 5
    //TEST CASE 1.25 GALLON AND LITER COMPARE
    @Test
    public void given1GallonAnd3Liters780ml_shouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement liter = new QuantityMeasurement(Unit.LITER, 3.78);
        Assert.assertEquals(gallon, liter);
    }

    //TEST CASE 1.26 1 LITER 1000 MILLILITER
    @Test
    public void given1LiterAnd1000MilliLiter_shouldReturnAdditionInLiter() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.LITER, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.ML, 1000);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(2, totalValue, 0);
    }

    //USE CASE 6
    //TEST CASE 1.27 1KG TO 1000 GRAMS COMPARE
    @Test
    public void given1KGAnd1000Grams_shouldReturnEqual() {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1000);
        Assert.assertEquals(kg, grams);
    }

    //TEST CASE 1.28 1000KGS TO 1 TON
    @Test
    public void given1TonAnd1000Kgs_shouldReturnEqual(){
        QuantityMeasurement kg= new QuantityMeasurement(Unit.TON, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.KG, 1000);
        Assert.assertEquals(kg, grams);
    }

    //USE CASE 7
    //TEST CASE 1.29 1TON + 1000GRAM = 1001KG
    @Test
    public void given1TonAnd1000Grams_shouldReturnAdditionInKG(){
        QuantityMeasurement kg= new QuantityMeasurement(Unit.TON, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1000);
        double addition = kg.getAddition(grams);
        Assert.assertEquals(1001,addition,0);
    }
}