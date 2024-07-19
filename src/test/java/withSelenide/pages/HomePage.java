package withSelenide.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {

    /*@FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement cookieButton;*/
    SelenideElement cookieButton = $(Selectors.byXpath("//*[@id=\\\"sticky-bar-cookie-wrapper\\\"]/span/div/div/div[2]/form[1]/button"));

    /*@FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement searchField;*/
    SelenideElement searchField = $(Selectors.byXpath("//*[@id=\\\"search-input\\\"]"));

    /*@FindBy(xpath = "//*[@id=\"search-form\"]/button")
    WebElement searchButton;*/
    SelenideElement searchButton = $(Selectors.byXpath("//*[@id=\\\"search-form\\\"]/button"));

    /*@FindBy(xpath = "//*[@id=\"utility-header-language-switch-link\"]")
    WebElement languageFlag;*/
    SelenideElement languageFlag = $(Selectors.byXpath("//*[@id=\\\"utility-header-language-switch-link\\\"]"));

    /*@FindBy(xpath = "//*[@id=\"utility-header-registration-link\"]/span")
    WebElement checkLanguageElement;*/
    SelenideElement checkLanguageElement = $(Selectors.byXpath("//*[@id=\\\"utility-header-registration-link\\\"]/span"));

    private final String registrationInEnglish = "Register";
    private final String registrationInHungarian = "Regisztráció";

    public HomePage() {
        //super(inputDriver);
        this.createSelenideConfig();
    }


    public void acceptCookies() {
        cookieButton.click();
    }

    public void searchVisible() {
        searchField.shouldBe(visible).shouldBe(enabled);
    }

    public SearchResultPage search(String searchWord) {
        searchField.sendKeys(searchWord);
        searchButton.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.isLoaded();
        return searchResultPage;
    }


}

