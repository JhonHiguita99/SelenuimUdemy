package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CursosFRT;
import pages.PaginaPrincipal;
import pages.paginaDeRegistro;
import pages.paginaRecursos;

public class FreeRangeRecursos {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    paginaRecursos recursos = new paginaRecursos();
    paginaDeRegistro registro = new paginaDeRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavegateTOFRT(){
        paginaPrincipal.NavigateToFreeRangeTester();
    }

    @When("Selecciona recursos")
    public void clickNavegarARecursos()
    {
        paginaPrincipal.clickRecursos();

    }
    @And("seleccionar el Automation Sandbox")
    public void validarClickSandBox(){
        recursos.clickEnAutomationSanbox();

    }

}
