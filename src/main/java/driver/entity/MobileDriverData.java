package driver.entity;

import enums.MobilePlatformType;
import enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {

  private MobilePlatformType mobilePlatformType;
  private MobileRemoteModeType mobileRemoteModeType;
}
