package pages;
import java.util.List;

public class PaginaPlan extends BasePage{

    private String planDropDown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";
    
    public PaginaPlan(){
        super(driver);
    }

    public List<String> returnPlanDropDown(){
        return getValueDropDown(planDropDown);
    }

}
