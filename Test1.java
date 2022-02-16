import lib.CoreTestCase;
//import lib.ui.ArticlePageObject;
import lib.ui.MainPageObject;
import lib.ui.SearchPageObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test1 extends CoreTestCase {
    private MainPageObject MainPageObject;
    protected Logger logger = LoggerFactory.getLogger(Test1.class);

    protected void setUp() throws Exception {
        super.setUp();
        MainPageObject = new MainPageObject(driver);
    }

    @Test
    public void testRegister_1() {


        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        logger.info("Нажатие на кнопку 'Разрешить'");
        SearchPageObject.initClickInput();
        logger.info("Нажатие на кнопку 'Регистрация'");
        SearchPageObject.initClick();
        logger.info("Заполнение поля 'Фамиля'");
        SearchPageObject.typeLastNameLine("Tesstovvv");
        logger.info("Заполнение поля 'Имя'");
        SearchPageObject.typeFirstNameLine("Tesstiing");
        logger.info("Заполнение поля 'Очество'");
        SearchPageObject.typeMiddleName("Tessstu");
        logger.info("Заполнение поля 'Имя пользователя'");
        SearchPageObject.typeLogin("test_1234509");
        logger.info("Заполнение поля 'email'");
        SearchPageObject.typeEmail("test12136@mail.ru");
        logger.info("Нажатие на кнопку 'Отправить'");
        SearchPageObject.typeSendRequest();

        SearchPageObject.RegisterResult();


    }

    @Test
    public void testRegister_2() {
//
//        String str=null;
//        try {
//            if (str.contains("123")) {
//
//            }
//        }catch (Exception e){
//            logger.error(e.getMessage());
//        }
        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.initClickInput();
        logger.info("Заполняем фамилию");
        SearchPageObject.typeLastNameLine("Tguakjpuo");
        logger.info("Заполняем имя");
        SearchPageObject.typeFirstNameLine("Sagoku");

        SearchPageObject.typeEmail("tarrkuop@mail.ru");
        SearchPageObject.typeSendRequest();
        //SearchPageObject. RegisterResult_2 ();

    }

    @Test

    public void testRegister_3() {
        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.initClickInput();
        SearchPageObject.typeFirstNameLine("Sagoku");
        SearchPageObject.typeLogin("takgjuu5_12345");
        SearchPageObject.typeEmail("takup@mail.ru");
        SearchPageObject.typeSendRequest();
        SearchPageObject.RegisterResult_2();
    }


}

