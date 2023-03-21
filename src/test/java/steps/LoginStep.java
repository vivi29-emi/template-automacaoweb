package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suports.Utils;

import static pages.LoginPage.*;

public class LoginStep  {

    private By elementButton= By.xpath("//*[@id=\"mc_embed_signup\"]/form/div/div/button");
    private By elementB= By.xpath("/html/body/div[3]/div/div[6]/button[1]");

    String mensagemText=null;
    @Dado("que acesso a tela inicial")
    public void que_acesso_a_tela_inicial() {
        acessarTelar();
    }


    @Quando("insiro meu e-mail {string}")
    public void insir_email(String email) {
        enviarEmail( email);
    }

    @Quando("dou um click no botao entrar")
    public void click_botao_entrar() throws InterruptedException {
        clickButton();
    }

    @Quando("recebo a mensagem de sucess")
    public void receber_mensagem_sucess() {
        verificarMensagem();
    }

    @Entao("click no botao ok")
    public void click_botao_ok() {
        clickButtonBox();
    }

}
