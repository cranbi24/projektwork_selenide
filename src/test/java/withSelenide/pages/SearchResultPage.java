package withSelenide.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultPage extends BasePage {


    //@FindBy(xpath = "//*[@id=\"product-list\"]/div[2]/div[3]/div/div[1]/div[1]/div/strong[2]")
    //WebElement searchResultCount;
    SelenideElement searchResultCount = $(Selectors.byXpath("//*[@id=\\\"product-list\\\"]/div[2]/div[3]/div/div[1]/div[1]/div/strong[2]"));

    @FindBy(xpath = "//*[@id=\"results\"]/h1")
    WebElement searchResultString;

    public SearchResultPage() {
        this.createSelenideConfig();
    }

    public void searchProduct(String toSearchFor) {
        assertTrue(searchResultString.getText().contains("" + toSearchFor));
    }

    public void searchItemCount(String toSearchFor) {
        //assertTrue(isLoaded());
        assertTrue(searchResultCount.getText().contains("" + toSearchFor));
    }

    /*public boolean isLoaded() {
        boolean isLoaded = isLoaded(searchResultCount);
        return isLoaded;
    }*/

    public void isLoaded() {
        searchResultCount.shouldBe(visible).shouldBe(enabled);
    }
}
