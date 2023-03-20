package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runners.RunnerTest;

import static suports.Utils.findEmail;
import static suports.Utils.waitElementPresent;

public class LoginPage extends RunnerTest {
    private static By elementButton= By.xpath("//*[@id=\"mc_embed_signup\"]/form/div/div/button");
    private static By elementB= By.xpath("/html/body/div[3]/div/div[6]/button[1]");
    public static void acessarTelar(){
        driver.get( "http://automationpratice.com.br/#search");
    }

    public static void enviarEmail(){
        driver.findElement(By.cssSelector("#mc_embed_signup > form > div > input")).sendKeys(findEmail());
    }

    public static void clickButton(){
        waitElementPresent(elementButton,20);
        driver.findElement(By.xpath("//*[@id=\"mc_embed_signup\"]/form/div/div/button")).sendKeys(Keys.RETURN);
    }

    public static void verificarMensagem(){
        String mensagemText =driver.findElement(By.cssSelector("#swal2-title")).getText();
        Assert.assertEquals("mensagem não encontrada","Success",mensagemText);
    }

    public static void clickButtonBox(){
        waitElementPresent(elementB,20);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
    }
}
