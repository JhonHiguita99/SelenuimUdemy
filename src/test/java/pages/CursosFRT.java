package pages;

public class CursosFRT extends BasePage{
private String locatorCursos = "//h3[normalize-space()='Fundamentos del Testing']";
    public CursosFRT(){
        super(driver);
    }
    public void clickFundamentosTesting(){
        clickElement(locatorCursos);
    }
}
