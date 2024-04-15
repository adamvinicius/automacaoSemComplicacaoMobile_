package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.ProdutosMaps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProdutosPage extends ProdutosMaps {

    public ProdutosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public String getTxtTituloProdutos(){
        return txtTituloProdutos.getText();
    }

    public void clickPacoteCurso(){
        btnPacoteCursos.click();
    }

}










