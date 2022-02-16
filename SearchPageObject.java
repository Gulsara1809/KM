package lib.ui;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchPageObject extends MainPageObject
{
    private static final String CLICK_INIT_ELEMENT_1 = "//*[@resource-id='android:id/button1']";
    private static final String CLICK_INIT_ELEMENT_2 = "//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
    private static final String CLICK_INIT_ELEMENT_3 = "//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
    private static final String CLICK_INIT_ELEMENT_4 = "//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
    private static final String CLICK_INIT_ELEMENT_5 = "//*[@resource-id='kz.gamma.testsip:id/register']";
    private static final String LAST_NAME = "//*[@resource-id='kz.gamma.testsip:id/lastName']";
    private static final String FIRST_NAME = "//*[@resource-id='kz.gamma.testsip:id/firstName']";
    private static final String MIDDLE_NAME = "//*[@resource-id='kz.gamma.testsip:id/middleName']";
    private static final String LOGIN = "//*[@resource-id='kz.gamma.testsip:id/login']";
    private static final String CLICK_ADD = "//*[@resource-id='kz.gamma.testsip:id/additional']";
    private static final String EMAIL_LINE = "//*[@resource-id='kz.gamma.testsip:id/email']";
    private static final String SEND_REQUEST = "//*[@resource-id='kz.gamma.testsip:id/ok']";
    private static final String REGISTER_RESULT_1 = "//*[@resource-id='kz.gamma.testsip:id/confirm']";
    private static final String REGISTER_RESULT = "//*[@resource-id='kz.gamma.testsip:id/confirm']";
    private static final String REGISTER_RESULT_2 = "//*[@resource-id= 'kz.gamma.testsip:id/snackbar_text']";
    private static final String REGISTER_RESULT_3 = "//*[@resource-id= 'kz.gamma.testsip:id/snackbar_text']" ;
            //*[@text= '{ Необходимо заполнить все обязательные поля }']";



    public SearchPageObject (AppiumDriver driver)
    {
        super(driver);
    }
    /*TEMPLATES METHODS*/
  /*  private static String getResultSearchElement(String substring)
    {
        return SEARCH_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}", substring);
    }*/
    /*TEMPLATES METHODS*/
    public void initClickInput() {
        this.waitForElementAndClick(By.xpath(CLICK_INIT_ELEMENT_1), "Nebhodimo razreshenie", 5);
        this.waitForElementAndClick(By.xpath(CLICK_INIT_ELEMENT_2), "Разрешить приложению снимать фото и видео", 5);
        this.waitForElementAndClick(By.xpath(CLICK_INIT_ELEMENT_3), "Разрешить приложению записывать аудио", 5);
        this.waitForElementAndClick(By.xpath(CLICK_INIT_ELEMENT_4), "Разрешить приложению доступ к фото, мультимедиа и файлам на устройстве", 5);
    }
        public void initClick() {
        this.waitForElementAndClick(By.xpath(CLICK_INIT_ELEMENT_5), "Регистрация", 5);
        this.waitForElementAndClick(By.xpath(CLICK_ADD), "Дополнительно", 5);
    }
    public void typeLastNameLine (String lastName_line)
    {
        this.waitForElementAndSendKeys(By.xpath (LAST_NAME), lastName_line, "Фамиля", 5);

    }
    public void typeFirstNameLine (String first_name_line) {
    this.waitForElementAndSendKeys(By.xpath (FIRST_NAME),first_name_line, "Имя", 5);
    }


    public void typeMiddleName (String middle_name_line) {
        this.waitForElementAndSendKeys(By.xpath (MIDDLE_NAME), middle_name_line, "Очество", 5);
    }

    public void typeLogin (String login_line) {
        this.waitForElementAndSendKeys(By.xpath (LOGIN), login_line, "Очество", 5);
    }


    public void typeEmail (String email_line) {

        this.waitForElementAndSendKeys(By.xpath (EMAIL_LINE), email_line, "Электронная плочта", 5);
    }
    public void typeSendRequest (){

        this.waitForElementAndClick(By.xpath(SEND_REQUEST), "Дополнительно", 5);
    }

    public void RegisterResult ( )
 {
    this.waitForElementPresent(By.xpath(REGISTER_RESULT_1), "Окно регистрации", 5);

    }
        public void RegisterResult_1 ()
 {
     this.waitForElementPresent(By.xpath (REGISTER_RESULT_2), "Пользователь с таким именем уже существует", 5);
}

    public void RegisterResult_2 ()
    {
        this.waitForElementNotPresent(By.xpath (REGISTER_RESULT_3), "Необходимо заполнить все обязательные поля ", 5);
    }

}