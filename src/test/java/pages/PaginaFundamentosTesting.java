package pages;


public class PaginaFundamentosTesting extends BasePage{

    private String introduccionTestingLink = "//header[@class='sc-huvEkS lAAPw']/a/h4[contains(text(),'ISTQB')]";
    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroduccionTesting(){
        clickElement(introduccionTestingLink);
    }
    

}