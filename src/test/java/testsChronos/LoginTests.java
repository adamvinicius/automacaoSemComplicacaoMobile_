package testsChronos;

import core.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {
    LoginPage loginPage;
    ProdutosPage produtosPage;

    @Test
    public void imprimirNoConsole(){
        System.out.println("Primeiro teste!!");
    }

    @Test
    public void realizarLoginValido() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTxtTituloProdutos());
    }
}








