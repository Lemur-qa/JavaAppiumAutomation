import org.junit.Assert;
import org.junit.Test;
import yoTest.MainClass;

public class MainClassTest {
    @Test
    public void testGetClassString()
    {
        MainClass mainClass = new MainClass();
        String result = mainClass.getClassString();
        Assert.assertTrue("String contains substring", result.contains("hello") || result.contains("Hello") );
    }
}
