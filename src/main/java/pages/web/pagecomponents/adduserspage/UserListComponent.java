package pages.web.pagecomponents.adduserspage;

import utils.PageActionsHelper;
import org.openqa.selenium.By;

public class UserListComponent {

  private static final By ADD_BUTTON = By.id("btnAdd");

  public AddUserComponent setAddButton() throws InterruptedException {
    PageActionsHelper.waitAndClick(ADD_BUTTON);
    return new AddUserComponent();
  }
}
