package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DataUtil;

import static utils.PageActionsHelper.*;

public class UserManagementPage extends DataUtil {




    private static final By ADMINISTRATION = By.xpath("//*[contains(@class,'fa fa-gear')]");
    private static final By USER_MANAGEMENT_PAGE = By.xpath("//a[text()='User Management']");
    private static final By CREATE_FIRST_NAME = By.id("firstName");
    private static final By CREATE_LAST_NAME = By.id("lastName");
    private static final By CREATE_MOBILE_NUMBER = By.id("mobileNo");
    private static final By CREATE_EMAIL = By.id("email");
    private static final By CREATE_EMPLOYEE_NO =By.id("employeeNo");
    private static final By USER_NAME= By.id("username");

    private static final By RADIO_BUTTON=By.id("ROLE_AGENT");

    private static final By CHOOSE_IMAGE= By.id("profilePicFile");
    private static final By USER_SAVE = By.name("create");
    private static final By CONFIRM_MSG= By.xpath("//div[contains(@class,'alert alert-success fade in')]");

    private static final By CONFIRM_ERROR_MSG=By.xpath("//div[contains(@class,'alert alert-block alert-danger fade in')]");
    public WebElement chooseImageButton;
    //public WebElement chooseImageButton;
    // public WebElement chooseImageButton;


    public UserManagementPage setFirstName(String firstName) throws InterruptedException {
        waitAndSendKeys(CREATE_FIRST_NAME, firstName);
        return this;
    }

    public UserManagementPage setLastName(String lastName) throws InterruptedException {
        waitAndSendKeys(CREATE_LAST_NAME, lastName);
        return this;


    }
    public UserManagementPage setMobileNumber(String mobileNumber) throws InterruptedException {
        waitAndSendKeys(CREATE_MOBILE_NUMBER , mobileNumber);
        return this;
    }
    public UserManagementPage setEmail(String email) throws InterruptedException {
        waitAndSendKeys(CREATE_EMAIL , email);
        return this;
    }
    public UserManagementPage setEmployeeNo(String empNo) throws InterruptedException {
        waitAndSendKeys(CREATE_EMPLOYEE_NO ,empNo);
        return this;
    }

    public UserManagementPage setUserName2(String userName2) throws InterruptedException {
        waitAndSendKeys(USER_NAME ,userName2);
        return this;
    }
    public UserManagementPage setRadioButton(String radioButton) throws InterruptedException {
        waitAndSendKeys(RADIO_BUTTON ,radioButton);
        return this;
    }
//    public UserManagementPage clickImage() throws InterruptedException {
//        waitAndClick(CHOOSE_IMAGE);
//
//        return this;
//    }


    public UserManagementPage clickSave() throws InterruptedException {
        waitAndClick(USER_SAVE);
        return this;
    }
    public UserManagementPage chooseImageButton(String chooseImage) throws InterruptedException{
        waitAndSendKeys(CHOOSE_IMAGE, chooseImage);
        return this;
    }


    private void click(By userSave) {
        driver.findElement(userSave).click();

    }

    public String setConfirmMsg()  {

        return getElementText(CONFIRM_MSG);
    }

    public UserManagementPage navigateToUserMgt() throws InterruptedException {
        waitAndClick(ADMINISTRATION);
        waitAndClick(USER_MANAGEMENT_PAGE);
        return this;
    }




























}
