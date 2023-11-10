package driver;

import driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
  WebDriver getDriver(MobileDriverData driverData);
}
