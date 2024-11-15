package pages;

public class PaginaPrincipal extends BasePage {
    private String Pagina = "https://www.freerangetesters.com";
    private String buttonElegirplan ="//a[normalize-space()='Elegir Plan']";
    public PaginaPrincipal(){
        super(driver);
    }

    public void NavigateToFreeRangeTester(){

        NavigateTo(Pagina);
    }
    public void clickEligePlan(){
        clickElement(buttonElegirplan);
    }
}
