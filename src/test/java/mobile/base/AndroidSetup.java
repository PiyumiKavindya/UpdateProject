package mobile.base;

import driver.Driver;
import enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AndroidSetup {

    /*
    Please check MobileSetup
     */

  @BeforeEach
  public void setUp() {
    Driver.initDriverForMobile(MobilePlatformType.ANDROID);
  }

  @AfterEach
  public void tearDown() {
    Driver.quitDriver();
  }
}
