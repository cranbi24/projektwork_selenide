package withSelenide.pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class BasePage {

    /*
        protected static WebDriver driver;
        protected static WebDriverWait wait;

        public BasePage(WebDriver inputDriver) {
            this.driver = inputDriver;
            this.wait = new WebDriverWait(inputDriver, Duration.ofSeconds(1));
            PageFactory.initElements(inputDriver, this);
        }

        protected boolean isLoaded(WebElement element) {
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        }
    */
    @BeforeEach
    public void createSelenideConfig() {

        Configuration.timeout = 15000;   //millisec
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://bevasarlas.tesco.hu/groceries/hu-HU";
    }


}


