package pages;

public class CursosFRT extends BasePage{
private String locatorCursos = "/html[1]/body[1]/div[1]/div[6]/div[1]/section[1]/div[3]/div[1]/div[2]/section[1]/div[1]/a[1]/img[1]";
    public CursosFRT(){
        super(driver);
    }
    public void clickFundamentosTesting(){
        clickElement(locatorCursos);
    }
}
