package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginMaps {
    @AndroidFindBy(accessibility = "inputEmail")
    protected WebElement inpEmail;

    @AndroidFindBy(accessibility = "inputPassword")
    protected WebElement inpPassword;

    @AndroidFindBy(accessibility = "Entrar")
    protected WebElement btnEntrar;

    @AndroidFindBy(accessibility = "emailError")
    protected WebElement txtEmailError;

    @AndroidFindBy(accessibility = "authErrorEmail")
    protected WebElement txtAuthErrorEmail;

    @AndroidFindBy(accessibility = "passwordError")
    protected WebElement txtPasswordError;

    @AndroidFindBy(accessibility = "authErrorPassword")
    protected  WebElement txtAuthErrorPassword;

    @AndroidFindBy(accessibility = "naoTemConta_text")
    protected WebElement linkNaoTemConta;
}
