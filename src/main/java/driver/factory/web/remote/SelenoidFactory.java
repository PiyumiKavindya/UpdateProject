package driver.factory.web.remote;


import driver.manager.web.remote.selenoid.SelenoidChromeManager;
import driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {

  private SelenoidFactory() {
  }

  private static final Map<BrowserType, Supplier<WebDriver>> MAP =
    new EnumMap<>(BrowserType.class);

  static {
    MAP.put(BrowserType.CHROME, SelenoidChromeManager::getDriver);
    MAP.put(BrowserType.FIREFOX, SelenoidFirefoxManager::getDriver);
  }

  public static WebDriver getDriver(BrowserType browserType) {
    return MAP.get(browserType).get();
  }
}
