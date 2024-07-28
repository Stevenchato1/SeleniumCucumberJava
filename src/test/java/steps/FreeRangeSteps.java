package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    
    
    @Given("I navigate to www.freerangertesters.com")
    public void iNavigateToFRT(){
        paginaPrincipal.navigateToFreeRangerTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void goToSectionBar(String section){
        paginaPrincipal.navigateToLinks(section);
    }

}
