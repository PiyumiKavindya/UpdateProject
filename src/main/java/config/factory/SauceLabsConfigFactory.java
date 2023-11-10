package config.factory;

import config.SauceLabsConfig;
import org.aeonbits.owner.ConfigCache;

public final class SauceLabsConfigFactory {

  private SauceLabsConfigFactory() {
  }

  public static SauceLabsConfig getConfig() {
    return ConfigCache.getOrCreate(SauceLabsConfig.class);
  }
}
