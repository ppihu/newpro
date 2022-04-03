package kostuvcollege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoustuvHomepage {

    WebDriver koustuv;
    @FindBy(xpath = "//div[@class='pull-left']")
    WebElement homepage;
    @FindBy(xpath = "//a[@href='faculty.php']")
    WebElement faculties;

    @FindBy(xpath = "(//ul[@class='navigation']/li)[2]")
    WebElement aboutUs;


    public KoustuvHomepage(WebDriver koustuv)
    {
        this.koustuv = koustuv;
        PageFactory.initElements(koustuv, this);
    }

    public Boolean homepage()
    {
        return homepage.isDisplayed();
    }

    public Faculty clickFaculties()
    {

        Actions action = new Actions(koustuv);
        action.moveToElement(aboutUs);
        action.click().build().perform();
        faculties.click();
        return new Faculty(koustuv);
    }
}
