package mobile.base;

import driver.Driver;
import enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class IosSetup {

    /*
    Please check MobileSetup
     */

  @BeforeEach
  public void setUp() {
    Driver.initDriverForMobile(MobilePlatformType.IOS);
  }

  @AfterEach
  public void tearDown() {
    Driver.quitDriver();
  }
}
