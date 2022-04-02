package test;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.quit();
    }

}