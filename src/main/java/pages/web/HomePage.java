package pages.web;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.openqa.selenium.*;
import org.testng.log4testng.Logger;
import pages.web.pagecomponents.homepage.TopMenuComponent;
import pages.web.topmenucomponent.MenuType;
import pages.web.topmenucomponent.SubMenuType;
import pages.web.validator.HomePageValidator;
import utils.PageActionsHelper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomePage {

  private final TopMenuComponent topMenuComponent;



 //protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
 //protected static Logger log = LogManager.getLogger();
  private static final By HEADER = By.xpath("//h1");

  private static final By TITLE = By.xpath("//h3");

  private static final By HEADER2 = By.xpath("//h2");


  private static final By CLASS = By.xpath("//*[contains(@class, 'nav toggle header')]");






  public HomePage() {
    this.topMenuComponent = new TopMenuComponent();
  }

  public SystemUserPage navigateToSystemUsersPage() throws InterruptedException {
    topMenuComponent.clickMenuItem(MenuType.ADMIN)
      .clickSubMenuItem(SubMenuType.USER_MANAGEMENT)
      .clickSubMenuItem(SubMenuType.USERS);
    return new SystemUserPage();
  }

  public HomePageValidator getHomePageValidator() {
    return HomePageValidator.builder()
      .isMarketplaceLinkPresent(topMenuComponent.isMarketPlaceLinkPresent())
      .logoSourceText(topMenuComponent.getLogoSourceString())
      .headerName(PageActionsHelper.getAttribute(HEADER, WebElement::getText))
      .build();
  }

  public String getTitle(){

    String text = PageActionsHelper.getElementText(TITLE);
    System.out.println(text);
    return text;



  }

//  public static WebDriver getDriver() {
//    return getDriver();
//  }


  public String getHeader(){
    String header2 =  PageActionsHelper.getElementText( HEADER2);
    System.out.println(header2);
    return header2;


  }
  public String getName(){
    String toggle = PageActionsHelper.getElementText(CLASS);
    System.out.println(toggle);
    return toggle;
  }
//  public void takeScreenshot(String screenshotName) {
//    TakesScreenshot screenshot = (TakesScreenshot) getDriver();
//    File file = screenshot.getScreenshotAs(OutputType.FILE);
//    try {
//      FileUtils.copyFile(file, new File("./failed_tests/"+screenshotName+".png"));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }


  }



