import org.junit.Assert;
import org.junit.Test;
import yoTest.MainClass;

public class MainClassTest {
    @Test
    public void testGetLocalNumber()
        {
            MainClass mainClass = new MainClass();
            int result = mainClass.getLocalNumber();
            Assert.assertEquals(result, 14);
    }
    private  void assertFail()
    {
        Assert.fail("This message will be printed");
    }
}
