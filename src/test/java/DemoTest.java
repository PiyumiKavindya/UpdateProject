import config.factory.ConfigFactory;
import org.testng.annotations.Test;


public class DemoTest {
    @Test
    public void testLogin(){
        System.out.println(ConfigFactory.getConfig().browser());
    }
}
