package pages.web;

import org.openqa.selenium.By;

import static utils.PageActionsHelper.waitAndClick;
import static utils.PageActionsHelper.waitAndSendKeys;

public class LoginPage {

  private static final By USER_NAME_TEXT_BOX = By.name("j_username_cc");
  private static final By PASSWORD_TEXT_BOX = By.name("j_password_cc");
  private static final By LOGIN_BUTTON = By.xpath("//button[contains(@class, 'btn btn-primary btn-login')]");

  private LoginPage setUserNameTextBox(String userName) throws InterruptedException {
      waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
    return this;
  }

  private LoginPage setPasswordTextBox(String password) throws InterruptedException {
      waitAndSendKeys(PASSWORD_TEXT_BOX, password);
    return this;
  }

  private void setLoginButton() throws InterruptedException {
    waitAndClick(LOGIN_BUTTON);
    new HomePage();
  }

  public void loginToApplication(String userName, String password) throws InterruptedException {
     setUserNameTextBox(userName)
            .setPasswordTextBox(password)
            .setLoginButton();


  }

//  public void loginToApplication(String jsonBody) {
//  }
}
