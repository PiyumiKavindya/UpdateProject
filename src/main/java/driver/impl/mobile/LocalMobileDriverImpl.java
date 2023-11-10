package driver.impl.mobile;

import driver.IMobileDriver;
import driver.entity.MobileDriverData;
import driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

  @Override
  public WebDriver getDriver(MobileDriverData driverData) {
    return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
  }
}
