package mobile;

import mobile.base.AndroidSetup;
import pages.mobile.HomeScreen;
import org.junit.jupiter.api.Test;

import static pages.mobile.enums.ViewsScreenMenuItemType.WEB_VIEW;

class AndroidTest extends AndroidSetup {

    /*
    Please refer mobile test
     */

  @Test
  void testLoginAndroid() throws InterruptedException {
    HomeScreen.getHomeScreenInstance()
      .navigateToViewsScreen()
      .clickOnViewScreenElement(WEB_VIEW);
    //assertion
  }
}
