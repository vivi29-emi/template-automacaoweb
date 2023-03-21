package suports;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.RunnerTest;

public class Utils extends RunnerTest {

    public static void waitElementPresent(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(driver,tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String findEmail(String email) {
        return email;
    }


}
