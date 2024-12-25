import CodeWars.NumberUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUtilsTest {
    @Test
    public void testIsSumLessThan100() {
        NumberUtils numberUtils = new NumberUtils();

        // Test cases where the sum is less than 100
        Assert.assertTrue(numberUtils.isSumLessThan100(30, 50), "Expected true for 30 + 50");
        Assert.assertTrue(numberUtils.isSumLessThan100(0, 99), "Expected true for 0 + 99");

        // Test cases where the sum is exactly 100
        Assert.assertFalse(numberUtils.isSumLessThan100(50, 50), "Expected false for 50 + 50");
        Assert.assertFalse(numberUtils.isSumLessThan100(100, 0), "Expected false for 100 + 0");

        // Test cases where the sum is greater than 100
        Assert.assertFalse(numberUtils.isSumLessThan100(60, 50), "Expected false for 60 + 50");
        Assert.assertFalse(numberUtils.isSumLessThan100(101, 1), "Expected false for 101 + 1");
    }
}
