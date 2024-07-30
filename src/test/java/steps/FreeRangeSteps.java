package steps;

import java.util.List;

import org.testng.Assert;

import java.util.Arrays;
import java.util.stream.Collectors;
import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPlan;
import pages.PaginaPrincipal;
import java.nio.charset.StandardCharsets;

public class FreeRangeSteps {

  PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
  PaginaCursos paginaCursos = new PaginaCursos();
  PaginaFundamentosTesting paginaFundamentosTesting = new PaginaFundamentosTesting();
  PaginaPlan paginaPlan = new PaginaPlan();

  @Given("I navigate to www.freerangertesters.com")
  public void iNavigateToFRT() {
    paginaPrincipal.navigateToFreeRangerTesters();
  }

  @When("I go to {word} using the navigation bar")
  public void goToSectionBar(String section) {
    paginaPrincipal.navigateToLinks(section);
  }

  @When("I select Elegir plan")
  public void iSelectElegirPlan() {
    paginaPrincipal.clickElegirPlan();
  }

  @And("I should see the section")
  public void seeSection() {
    paginaCursos.clickFundamentoTestLink();
    paginaFundamentosTesting.clickIntroduccionTesting();
  }

  @Then("I validate dropDown")
  public void validateDropwn() {
    List<String> listaObtenida = paginaPlan.returnPlanDropDown();
    List<String> listaEsperada = Arrays.asList(
        "Academia: $16.99 / mes • 13 productos",
        "Academia: $176 / año • 13 productos",
        "Free: Gratis • 3 productos"
    );
 
    List<String> listaObtenidaS = listaObtenida.stream()
        .map(this::fixEncoding)
        .toList();
 
    Assert.assertEquals(listaObtenidaS, listaEsperada);
  }

  private String fixEncoding(String input) {
    byte[] bytes = input.getBytes(StandardCharsets.ISO_8859_1);
    return new String(bytes, StandardCharsets.UTF_8);
}
}
