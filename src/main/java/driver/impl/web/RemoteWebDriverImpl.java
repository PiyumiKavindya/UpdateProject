package driver.impl.web;

import driver.IWebDriver;
import driver.entity.WebDriverData;
import driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
  @Override
  public WebDriver getDriver(WebDriverData driverData) {
    return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
  }
}
