import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;

public class GuessTest {

    @Test
    public void test_guess_game () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Pas url aan
        driver.get("http://localhost:8080/Les3_get_params_automation_war_exploded/");

        WebElement startLink = driver.findElement(By.linkText("Click here to start guessing"));
        startLink.click();

        WebElement myGuess = driver.findElement(By.id("myGuess"));
        myGuess.clear();
        myGuess.sendKeys("4");

        WebElement guessButton = driver.findElement(By.id("guessButton"));
        guessButton.click();

        String guessedText = driver.findElement(By.id("result")).getText();
        assertEquals("You guessed 4...",guessedText);

        driver.quit();
    }

}