import CodeWars.EvenOrOdd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOrOddTest {

    @Test
   public void testEvenOrOdd(){
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        Assert.assertEquals(evenOrOdd.evenOrOdd(6), "Even");
    }
}
