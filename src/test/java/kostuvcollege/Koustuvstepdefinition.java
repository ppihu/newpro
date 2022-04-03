package kostuvcollege;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kostuvcollege.Faculty;
import kostuvcollege.KoustuvHomepage;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Koustuvstepdefinition {
    String driverPath = "drivers/chromedriver";
    WebDriver driver ;

    Faculty objf;
    KoustuvHomepage objk;

    @Before
    public void setup() {

        // Initialize the webdriver and open the browser
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://koustuvgroup.ac.in/websitelist/kisd/index.php");
    }


    @Given("User Loads the proper URL")
    public void loadkoustuvhomepage()
    {
        objk =new KoustuvHomepage(driver);
    }

    @When("The page is loaded properly")
    public void loadkoustuvdone()
    {
       Assert.assertTrue(objk.homepage());
    }

    @When( "User clicks faculty" )
    public void clickkworks()
        {
          objf = objk.clickFaculties();

        }

    @Then("User is redirected to faculty page")
    public void loadKS()
    {
        Assert.assertTrue(objf.fpagetest());
    }

    @Then("HOD name is displayed")
    public void hodnamed()
    {
        objf.clickfaculty();
        Assert.assertTrue(objf.getname().contains("PRADHAN"));
    }
    @After
    public void close() {

        // Close the browser
        driver.close();
    }
}
