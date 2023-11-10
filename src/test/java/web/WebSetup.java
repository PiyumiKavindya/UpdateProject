package web;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import driver.Driver;
import org.testng.annotations.*;


public class WebSetup {

  @BeforeClass
  public static void beforeAll() {
    FixtureFactoryLoader.loadTemplates("fixtures");
  }

  @BeforeMethod
  public void setUp() {
    Driver.initDriverForWeb();
  }

  @AfterMethod
  public void tearDown() {
    Driver.quitDriver();
  }
}
