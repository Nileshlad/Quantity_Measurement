import com.quantitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    //TEST CASE 1.1
    @Test
    public void toChecktheEqualValueTrue() {
        QuantityMeasurement qualityMeasurement = new QuantityMeasurement(0);
        QuantityMeasurement qualityMeasurement1 = new QuantityMeasurement(0);
        boolean areEqual = qualityMeasurement.equals(qualityMeasurement1);
        Assert.assertEquals(true, areEqual);
    }

}
