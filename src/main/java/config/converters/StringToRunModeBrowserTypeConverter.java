package config.converters;

import enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType> {
  @Override
  public RunModeType convert(Method method, String runMode) {
    return RunModeType.valueOf(runMode.toUpperCase());
  }
}
