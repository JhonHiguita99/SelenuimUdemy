package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CursosFRT;
import pages.PaginaPrincipal;
import pages.paginaDeRegistro;

import java.util.Arrays;
import java.util.List;

public class FreeRangeCursos {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    CursosFRT curso = new CursosFRT();
    paginaDeRegistro registro = new paginaDeRegistro();

    @Given("navegar a free www.freerangetesters.com")
    public void iNavegateTOFRT(){
        paginaPrincipal.NavigateToFreeRangeTester();
    }

    @When("Seleccionar en el Navigate bar Cursos")
    public void clickNavegarACursos()
    {
        paginaPrincipal.clickCursos();

    }
    @And("Seleccionar Fundamentos Testing")
    public void validarCurso(){
        curso.clickFundamentosTesting();
    }

}
