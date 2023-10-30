import org.junit.*;

public class TestMain {
    
    @Test
    public void testSteps10(){
        Collatz test = new Collatz(10);
        Assert.assertEquals(7, test.steps());
    }

    @Test
    public void testSteps100(){
        Collatz test = new Collatz(100);
        Assert.assertEquals(26, test.steps());
    }

    @Test
    public void testSequence10(){
        Collatz test = new Collatz(10);
        Assert.assertArrayEquals(new int[]{10, 5, 16, 8, 4, 2, 1}, test.sequence());
    }

    @Test
    public void testSequence100(){
        Collatz test = new Collatz(100);
        Assert.assertArrayEquals(new int[]{100, 50, 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}, test.sequence());
    }

    @Test
    public void testMainValue100(){
        Collatz test = new Collatz(100);
        Assert.assertEquals(100, test.maxValue());
    }

    @Test
    public void testMainValue10(){
        Collatz test = new Collatz(10);
        Assert.assertEquals(16, test.maxValue());
    }
    
    @Test
    public void testMinOddValue10(){
        Collatz test = new Collatz(10);
        Assert.assertEquals(5, test.minOddValue());
    }

    @Test
    public void testMinOddValue100(){
        Collatz test = new Collatz(100);
        Assert.assertEquals(5, test.minOddValue());
    }

    @Test
    public void testOddValues10(){
        Collatz test = new Collatz(10);
        Assert.assertArrayEquals(new int[]{5, 1}, test.oddValues());
    }

    @Test
    public void testOddValues100(){
        Collatz test = new Collatz(100);
        Assert.assertArrayEquals(new int[]{25, 19, 29, 11, 17, 13, 5, 1}, test.oddValues());
    }

    @Test
    public void testSumValues10(){
        Collatz test = new Collatz(10);
        Assert.assertEquals(46, test.sumValues());
    }

    @Test
    public void testSumValues100(){
        Collatz test = new Collatz(100);
        Assert.assertEquals(808, test.sumValues());
    }
}
