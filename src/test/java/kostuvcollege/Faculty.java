package kostuvcollege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faculty {

    WebDriver koustuv;
    @FindBy(xpath = "(//div[@class='accord-btn'])[5]/h4")
    WebElement faculty;
    @FindBy(xpath = "((//div[@class='accordion accordion-block'])[5]/div[@class='accord-content']/div)[1]")
    WebElement name;
    @FindBy(xpath ="//div[@class='sec-title']/h1")
    WebElement fpage;

    public Faculty(WebDriver koustuv)
    {
        this.koustuv = koustuv;
        PageFactory.initElements(koustuv, this);
    }

    public void clickfaculty()
    {
        faculty.click();
    }
    public String getname()
    {
        return name.getText();
    }
    public boolean fpagetest()
    {
        return fpage.isDisplayed();
    }

}
