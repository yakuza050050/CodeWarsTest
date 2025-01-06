import CodeWars.Coding1.Warmup1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testwarmup1 {

    @Test
    public void testWarmup1() {
        Warmup1 warmup1 = new Warmup1();
// Тестовые случаи для метода sleepIn
   //     Assert.warmup1.sleepIn(false, false), "Ожидалось, что мы будем спать (не будний день, не отпуск).");
//        assertEquals(
//                false, warmup1.sleepIn(true, false), "Ожидалось, что мы не будем спать (не будний день, отпуск).");
//        assertEquals(true, warmup1.sleepIn(false, true), "Ожидалось, что мы будем спать (не будний день, отпуск).");
//        assertEquals(true, warmup1.sleepIn(true, true), "Ожидалось, что мы будем спать (будний день, отпуск).");

        Assert.assertTrue(warmup1.sleepIn(false,false),"Ожидалось, что мы будем спать (не будний день, не отпуск).)");
        Assert.assertTrue(warmup1.sleepIn(true,true),"Ожидалось, что мы будем спать");
        Assert.assertFalse(warmup1.sleepIn(true,false),"Ожидалось, что мы будем спать(не будний день, отпуск).\")");
        Assert.assertTrue(warmup1.sleepIn(false,true),"Ожидалось, что мы будем спать(не будний день, отпуск).\")");



    }
}


