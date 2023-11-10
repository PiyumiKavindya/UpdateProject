package mobile;

import mobile.base.IosSetup;
import pages.mobile.IosHomeScreen;
import org.junit.jupiter.api.Test;

class IosTest extends IosSetup {

    /*
    Please refer mobile test
     */

  @Test
  void testLoginIos() {
    IosHomeScreen.getInstance()
      .addANewTask();

    //add assertion
  }

}
