import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class EqualsTest {

    @Test
    public void equals1 () {
        Integer a = 128;
        Integer b = 128;
        boolean result = a == b;
        Assert.assertEquals(result,false);
    }

    @Test
    public void equals2 () {
        Integer a = 127;
        Integer b = 127;
        boolean result = a == b;
        Assert.assertEquals(result,true);
    }

    @Test
    public void equals3 () {
        String a = "123";
        String b = "123";
        boolean result = a == b;
        Assert.assertEquals(result,true);
    }

    @Test
    public void equals4 () {
        String a = new String("123");
        String b = new String("123");
        boolean result = a == b;
        Assert.assertEquals(result,false);
    }



}
