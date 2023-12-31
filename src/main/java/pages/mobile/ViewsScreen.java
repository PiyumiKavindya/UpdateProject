package pages.mobile;

import driver.DriverManager;
import pages.mobile.enums.ViewsScreenMenuItemType;
import utils.PageActionsHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ViewsScreen {

  public ViewsScreen() {
    PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
  }

  @iOSXCUITFindBy(xpath = "")
  @AndroidFindBy(accessibility = "WebView")
  private WebElement textboxEmail;

  private static final String VIEW_SCREEN_ELEMENT = "%s";

  public void clickOnViewScreenElement(ViewsScreenMenuItemType element) throws InterruptedException {
    By accessibilityId = AppiumBy.accessibilityId(String.format(VIEW_SCREEN_ELEMENT, element.getName()));
    PageActionsHelper.scrollForMobile(textboxEmail);
    PageActionsHelper.waitAndClick(accessibilityId);
  }

}
