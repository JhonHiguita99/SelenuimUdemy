package pages;

public class PaginaPrincipal extends BasePage {
    private String Pagina = "https://www.freerangetesters.com";
    private String buttonElegirplan ="//a[normalize-space()='Elegir Plan']";

    private String selecionarCursos= "/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/a[1]";
    public PaginaPrincipal(){
        super(driver);
    }

    public void NavigateToFreeRangeTester(){

        NavigateTo(Pagina);
    }
    public void clickEligePlan(){
        clickElement(buttonElegirplan);
    }

    public  void  clickCursos(){
        clickElement(selecionarCursos);
    }
}
