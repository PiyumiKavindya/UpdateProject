package pages.mobile;

import utils.PageActionsHelper;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class IosHomeScreen {

  // Java client version > 8.x
  private static final By ADD_TASK = AppiumBy.accessibilityId("plus.circle");

  private IosHomeScreen() {
  }

  public static IosHomeScreen getInstance() {
    return new IosHomeScreen();
  }

  public void addANewTask() {
    PageActionsHelper.waitAndClick(ADD_TASK, ADD_TASK);
  }
}
