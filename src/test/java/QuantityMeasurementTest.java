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

}
