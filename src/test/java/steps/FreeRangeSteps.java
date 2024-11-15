package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CursosFRT;
import pages.PaginaPrincipal;
import pages.paginaDeRegistro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FreeRangeSteps {
    PaginaPrincipal  paginaPrincipal = new PaginaPrincipal();
    CursosFRT curso = new CursosFRT();
    paginaDeRegistro registro = new paginaDeRegistro();

   @Given("I navigate to www.freerangetesters.com")
    public void iNavegateTOFRT(){
        paginaPrincipal.NavigateToFreeRangeTester();
    }

    @When("I select Elegir Plan")
    public void clickButtonEligePlan(){
        paginaPrincipal.clickEligePlan();
    }
    @Then("I can validate the options in the chechout page")
    public void validarChechOutPlan(){
        List<String>Lista = registro.retournPlanDropDownValues();
        List<String> ListaEsperada = Arrays.asList("Academia: $16.99 / mes • 12 productos","Academia: $176 / año • 12 productos","Free: Gratis • 1 producto");


        Assert.assertEquals(ListaEsperada,Lista);
    }
}
