package pages.web;

import pages.web.pagecomponents.adduserspage.SearchComponent;
import pages.web.pagecomponents.adduserspage.UserListComponent;

public class SystemUserPage {

  private final SearchComponent searchComponent;
  private final UserListComponent userListComponent;

  public SystemUserPage() {
    this.userListComponent = new UserListComponent();
    this.searchComponent = new SearchComponent();
  }

  public UserListComponent getUserListComponent() {
    return userListComponent;
  }


}
