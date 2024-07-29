package pages;

public class PaginaCursos extends BasePage{
    
    private String fundamentoTestingLink= "//h3[normalize-space()='Fundamentos del Testing']";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentoTestLink(){
        clickElement(fundamentoTestingLink);
    }
    
}
