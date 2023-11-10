package driver.factory.mobile.local;

import driver.manager.mobile.local.AndroidManager;
import driver.manager.mobile.local.IosManager;
import enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

  private LocalMobileDriverFactory() {
  }

  private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP =
    new EnumMap<>(MobilePlatformType.class);

  static {
    MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
    MAP.put(MobilePlatformType.IOS, IosManager::getDriver);
  }

  public static WebDriver getDriver(MobilePlatformType platformType) {
    return MAP.get(platformType).get();
  }

}
