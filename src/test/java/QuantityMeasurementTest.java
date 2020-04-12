import com.exception.QuantityMeasurementException;
import com.quantitymeasurement.LengthMesurement;
import com.quantitymeasurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    //TEST CASE 1.1 EQUAL METHOD
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqualTrue() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    //TEST CASE 1.2
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqualfalse() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0.1);
        boolean lengthEql = first.equals(second);
        Assert.assertEquals(false, lengthEql);
    }

    //TEST CASE 1.4 NULL CHECK
    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnExceptionTrue()throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 1);
    }

    //TEST CASE 1.6 REF CHECK
    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqualTrue() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    //INCHES TEST CASE
    //TEST CASE 1.7
    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqualTrue() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0.0);
        LengthMesurement second = new LengthMesurement(Unit.INCH, 0.0);
        Assert.assertEquals(first, second);
    }

    //TEST CASE 1.8
    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqualfalse() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0.0);
        LengthMesurement second = new LengthMesurement(Unit.INCH, 0.1);
        boolean lengthEql = first.equals(second);
        Assert.assertEquals(false, lengthEql);
    }

   //TEST CASE 1.9
   @Test
    public void givenSameTypeSameValueInInch_shouldReturnExceptionTrue()throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement second = new LengthMesurement(Unit.INCH, 1);
       Assert.assertEquals(first, second);

   }

    //TEST CASE 1.10 REF CHECK
    @Test
    public void givenSameReferenceOfInch_shouldReturnEqualTrue() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    //FEET AND INCH TEST CASES
    //TEST CASE 1.11 CHECK FEET AND INCH EQUAL
    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }

    //TEST CASE 1.12 CHECK FEET AND INCH EQUAL
    @Test
    public void givenOneFeetAndOneInch_shouldReturnNotEquals() throws QuantityMeasurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 2);
        Assert.assertNotEquals(first, second);
    }

    //TEST CASE 1.13
    @Test
    public void givenOneInchAndOneFeet_shouldReturnNotEquals() throws QuantityMeasurementException {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        Assert.assertNotEquals(inch, feet);
    }
}