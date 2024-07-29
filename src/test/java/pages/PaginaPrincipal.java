package pages;


public class PaginaPrincipal extends BasePage {
    private String sectionLink = "//a[@class='sc-ifyrTC hrRzR sc-eEPDDI sc-loAbOW LazBE fbbUVe'][normalize-space()='%s']";
    private String plan = "//a[normalize-space()='Elegir Plan']";

    public PaginaPrincipal() {
        super(driver);
    }

    private String btnEnter = "//a[@class='sc-euGpHm kwsRwv']";


    //Metido para navegar 
    public void navigateToFreeRangerTesters(){
        navigateTo("https://www.freerangetesters.com");
        //clickElement(btnEnter);
    }

    //Metodo para navegar a la seccion de recursos
    public void navigateToLinks(String section){
        //Reemplazaador marcadorde posicion
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }   

    public void clickElegirPlan(){
        clickElement(plan);
    }
  
    
}
