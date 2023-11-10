package baseClass;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class WebBaseClass {

    @BeforeAll
    public static void beforeAll() {
        FixtureFactoryLoader.loadTemplates("com.tmb.fixtures");
    }

    @BeforeEach
    public void setUp() {
        Driver.initDriverForWeb();
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
