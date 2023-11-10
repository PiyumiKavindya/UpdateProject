package driver.impl.web;

import driver.IWebDriver;
import driver.entity.WebDriverData;
import driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

  @Override
  public WebDriver getDriver(WebDriverData driverData) {
    return LocalDriverFactory.getDriver(driverData.getBrowserType());
  }
}
