import com.Inch;
import com.exception.QuantityMeasurementException;
import com.quantitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    //TEST CASE 1.1 EQUAL METHOD
    @Test
    public void toChecktheEqualValueTrue() throws QuantityMeasurementException {
        QuantityMeasurement qualityMeasurement = new QuantityMeasurement(0);
        QuantityMeasurement qualityMeasurement1 = new QuantityMeasurement(0);
        boolean areEqual = qualityMeasurement.equals(qualityMeasurement1);
        Assert.assertEquals(true, areEqual);
    }

    //TEST CASE 1.2 EQUAL OPERATOR
    @Test
    public void toChecktheNotEqualValueFalse() throws QuantityMeasurementException {
        QuantityMeasurement qualityMeasurement = new QuantityMeasurement(0);
        QuantityMeasurement qualityMeasurement1 = new QuantityMeasurement(0);
        boolean areEqual = (qualityMeasurement == qualityMeasurement1);
        Assert.assertEquals(false, areEqual);
    }

    //TEST CASE 1.3 NULL CHECK
    @Test
    public void givenNullMeasure_shouldReturnException() {
        try {
            QuantityMeasurement qualityMeasurement = new QuantityMeasurement(null);
            QuantityMeasurement qualityMeasurement1 = new QuantityMeasurement(null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.Type.Null_check, e.type);
        }
    }

    //TEST CASE 1.4 REF CHECK TO EQUAL METHOD
    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqualTrue() throws QuantityMeasurementException {
        QuantityMeasurement qualityMeasurement = new QuantityMeasurement(0.0);
        Assert.assertTrue(qualityMeasurement.equals(qualityMeasurement));

    }

    //TEST CASE 1.5 REF CHECK TO EQUAL OPERATOR
    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqualOperatorTrue() throws QuantityMeasurementException {
        QuantityMeasurement qualityMeasurement = new QuantityMeasurement(0.0);
        Assert.assertTrue(qualityMeasurement == qualityMeasurement);

    }

    //TEST CASE 1.6 VALUE CHECK EQUALITY AND EQUAL METHOD

    @Test
    public void givenValueCheckOfFeet_shouldReturnEqualOperatorUseTrue() {
        QuantityMeasurement qualityMeasurement1 = new QuantityMeasurement(11);
        QuantityMeasurement qualityMeasurement2 = new QuantityMeasurement(11);
        Assert.assertTrue(qualityMeasurement1.equals(qualityMeasurement2));
    }

    //TEST CASE 1.7 VALUE CHECK EQUALITY AND EQUAL OPERATOR
    @Test
    public void givenValueCheckOfFeet_shouldReturnEqualOperatorUseFalse() {
        QuantityMeasurement qualityMeasurement1 = new QuantityMeasurement(11);
        QuantityMeasurement qualityMeasurement2 = new QuantityMeasurement(11);
        Assert.assertFalse(qualityMeasurement1 == qualityMeasurement2);
    }

    //TEST CASE IN INCHES
    //TEST CASE 1.8 EQUAL METHOD
    @Test
    public void toCheckInchValuetheEqualValueTrue() throws QuantityMeasurementException {
        Inch inch = new Inch(0);
        Inch inch1 = new Inch(0);
        boolean areEqual = inch.equals(inch1);
        Assert.assertEquals(true, areEqual);

    }
}
