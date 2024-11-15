package pages;

import java.util.List;

public class paginaDeRegistro extends BasePage{

    private String PlanDropDonw ="//select[@id='cart_cart_item_attributes_plan_with_interval']";
    public paginaDeRegistro(){
        super(driver);
    }

    public List<String> retournPlanDropDownValues(){
        return getDropdownValues(PlanDropDonw);

    }


}
