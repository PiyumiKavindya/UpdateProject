package pages.web.pagecomponents.homepage;

import pages.web.topmenucomponent.MenuType;
import pages.web.topmenucomponent.SubMenuType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.PageActionsHelper.*;

public class TopMenuComponent {

  private static final String MENU = "//b[text()='%s']/parent::a";
  private static final String SUB_MENU = "//a[text()='%s']";
  private static final By LOGO = By.xpath("//img[@alt='OrangeHRM']");
  private static final By LINK_MARKET_PLACE = By.id("MP_link");

  public TopMenuComponent clickMenuItem(MenuType menuType) throws InterruptedException {
    String xpath = String.format(MENU, menuType.getName());
    waitAndClick(By.xpath(xpath));
    return this;
  }

  public TopMenuComponent clickSubMenuItem(SubMenuType subMenuType) throws InterruptedException {
    String xpath = String.format(SUB_MENU, subMenuType.getName());
    waitAndClick(By.xpath(xpath));
    return this;
  }

  public String getLogoSourceString() {
    return getAttribute(LOGO, e -> e.getAttribute("src"));
  }

  public boolean isMarketPlaceLinkPresent() {
    return isPresent(LINK_MARKET_PLACE, WebElement::isDisplayed);
  }
}
