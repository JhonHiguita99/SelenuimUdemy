package pages;

import java.util.List;

public class paginaDeRegistro extends BasePage{

    private String PlanDropDonw ="//*[@id=\"cart_cart_item_attributes_plan_with_interval\"]/option[4]";
    public paginaDeRegistro(){
        super(driver);
    }

    public List<String> retournPlanDropDownValues(){
        return getDropdownValues(PlanDropDonw);

    }


}
