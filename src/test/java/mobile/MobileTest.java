package mobile;

import mobile.base.MobileSetUp;
import pages.mobile.HomeScreen;
import pages.mobile.IosHomeScreen;
import annotations.AndroidTest;
import annotations.IosTest;

import static pages.mobile.enums.ViewsScreenMenuItemType.WEB_VIEW;

class MobileTest extends MobileSetUp {

  @AndroidTest
  void testLoginAndroid() throws InterruptedException {
    HomeScreen.getHomeScreenInstance()
      .navigateToViewsScreen()
      .clickOnViewScreenElement(WEB_VIEW);
    //assertion
  }

  @IosTest
  void testLoginIos() {
    IosHomeScreen.getInstance()
      .addANewTask();

    //add assertion
  }

  @AndroidTest
  @IosTest
  void testLoginBoth() throws InterruptedException {
    HomeScreen.getHomeScreenInstance()
      .navigateToViewsScreen()
      .clickOnViewScreenElement(WEB_VIEW);
    //assertion
  }
}
