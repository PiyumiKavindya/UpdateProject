package driver;

import driver.entity.MobileDriverData;
import driver.entity.WebDriverData;
import driver.factory.DriverFactory;
import enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;


import java.util.Objects;

import static config.factory.ConfigFactory.getConfig;

public final class Driver {

  private Driver() {
  }

  public static void initDriverForWeb() {
    if (Objects.isNull(DriverManager.getDriver())) {
      WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
      WebDriver driver = DriverFactory
              .getDriverForWeb(getConfig().browserRunMode())
              .getDriver(driverData);
      DriverManager.setDriver(driver);
      loadURL();
    }
  }

  public static void loadURL() {
    DriverManager.getDriver().get(getConfig().webUrl());
  }

  public static void initDriverForMobile(MobilePlatformType mobilePlatformType) {
    MobileDriverData driverData = new MobileDriverData(mobilePlatformType, getConfig().mobileRemoteMode());
    WebDriver driver = DriverFactory
            .getDriverForMobile(getConfig().mobileRunMode())
            .getDriver(driverData);
    DriverManager.setDriver(driver);
  }


  public static void quitDriver() {
    if (Objects.nonNull(DriverManager.getDriver())) {
      DriverManager.getDriver()
              .quit();
      DriverManager.unload();
    }
  }
}
