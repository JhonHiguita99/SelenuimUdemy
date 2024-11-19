package pages;

import org.openqa.selenium.WebDriver;

public class paginaRecursos extends BasePage{

    public paginaRecursos(){
        super(driver);
    }
    private String seleccionarSandBox="/html[1]/body[1]/div[1]/div[5]/div[1]/section[1]/div[3]/div[1]/div[1]/section[1]/div[1]/a[1]/img[1]";

    public void clickEnAutomationSanbox(){
        clickElement(seleccionarSandBox);
    }

}
