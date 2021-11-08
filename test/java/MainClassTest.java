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
    @Test
    public void testGetClassNumber()
    {
        MainClass mainClass = new MainClass();
        int result = mainClass.getClassNumber();
        Assert.assertTrue("Error, number is too low",result > 45);
    }
    @Test
    public void testGetClassString()
    {
        MainClass mainClass = new MainClass();
        String result = mainClass.getClassString();
        Assert.assertTrue("String contains substring", result.contains("hello") || result.contains("Hello") );
    }
}
