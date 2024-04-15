package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.LoginMaps;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class LoginPage extends LoginMaps {

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarLogin(String email, String senha) {
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(senha);
        btnEntrar.click();
    }

    public String getTxtEmailError(){
        try {
            return txtEmailError.getText();
        }catch (Exception e){
            return txtAuthErrorEmail.getText();
        }

    }

    public String getTxtPasswordError(){
        try {
            return txtPasswordError.getText();
        }catch (Exception e){
            return txtAuthErrorPassword.getText();
        }
    }

    public void clickLinkNaoTemConta(){
        linkNaoTemConta.click();
    }
}















