package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", // este es el directoria de nuestros archivos .features
        glue = "steps" , // ruta donde tenemos definidos los Steps
        plugin = {"pretty","html:target/cucumber-reports"},// ruta donde se generan los reportes de test ejecutados
        tags = "@Courses"
)
public class testRunner {
    @AfterClass
    public static void ClearDriver() {
        BasePage.closeBrowser();
    }



}


