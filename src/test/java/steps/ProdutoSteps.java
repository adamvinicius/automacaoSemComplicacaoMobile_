package steps;

import core.Driver;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ProdutosPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoSteps {
    ProdutosPage produtosPage;

    @Entao("valido que exibe a tela de produtos")
    public void validoQueExibeATelaDeProdutos() {
        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTxtTituloProdutos());
    }

    @Quando("seleciono o pacote de cursos")
    public void selecionoOPacoteDeCursos() {
        Driver.swipe(0, 0, "down", 1.0);
        produtosPage.clickPacoteCurso();
    }

}









