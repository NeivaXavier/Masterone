package MySteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworktestefinal.Elementos;
import frameworktestefinal.metodos;

public class Steps {
	String Autor;
	metodos Metodos = new metodos();
	Elementos el = new Elementos();

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		Metodos.abrirSite(site, "CHROME");
	}

	@Given("^clicar no link do livro$")
	public void clicar_no_link_do_livro() throws Throwable {
		Metodos.clicar(el.getBtnlivrosub());
		Metodos.pausa(10000);
		Metodos.clicar(el.getLivrosub());
	}

	@When("^verificando o autor do livro$")
	public void verificando_o_autor_do_livro() throws Throwable {
        Metodos.pausa(5000);
		Autor = Metodos.obterText(el.getAutorsub(), "pegando o texto");
		System.out.println(Autor);
	}

	@Given("^validar o autor americanas$")
	public void validar_o_autor_americanas() throws Throwable {

	}

	@Given("^validar o autor amazon$")
	public void validar_o_autor_amazon() throws Throwable {

	}

	@When("^evidencia submarino \"([^\"]*)\"$")
	public void evidencia_submarino(String evidencia) throws Throwable {
		Metodos.screnShoot("./Evidencias/" + evidencia + ".png");
		Metodos.fechar();
	}

	@When("^Pesquisando livro$")
	public void pesquisando_livro() throws Throwable {
		Metodos.preencher(el.getCampodebuscaame(), "Coleção Especial Anne de Green Gables");
		Metodos.clicar(el.getBtnPesquisarAme());
		Metodos.pausa(5000);
		Metodos.clicar(el.getSelecionarlivroameri());
		Metodos.pausa(5000);
		Metodos.clicar(el.getAutorame());
	}

	@When("^Validando autor Americanas$")
	public void validando_autor() throws Throwable {
		String autor;
		autor = Metodos.obterText(el.getAutoramericanas(), "pegando autor");
		Metodos.validartexto(autor, Autor, "validando autor do livro");
	}

	@When("^Evidencia Americanas \"([^\"]*)\"$")
	public void evidencia_Americanas(String evidencia) throws Throwable {
		Metodos.screnShoot("./Evidencias/" + evidencia + ".png");
		Metodos.fechar();

	}

	@When("^Pesquisando livro Amazon$")
	public void pesquisando_livro_Amazon() throws Throwable {

	}

	@When("^Validando autor Amazon$")
	public void validando_autor_Amazon() throws Throwable {
		String autorAma;
		autorAma = Metodos.obterText(el.getAutoramaz(), "pegando autor");
		Metodos.validartexto(autorAma, Autor, "validadno autor");
	}

	@Then("^Evidencia Amazon \"([^\"]*)\"$")
	public void evidencia_Amazon(String evidencia) throws Throwable {
		Metodos.screnShoot("./Evidencias/" + evidencia + ".png");
		Metodos.fechar();
	}

	@When("^Pesquisando livro pelo ISBN \"([^\"]*)\"$")
	public void pesquisando_livro_pelo_ISBN(String ISBN) throws Throwable {
		Metodos.preencher(el.getCampodebuscaame(), ISBN);
		Metodos.clicar(el.getBtnPesquisarAme());
		Metodos.pausa(10000);
		Metodos.clicar(el.getSelecionarlivroameri());
		Metodos.pausa(5000);
		Metodos.clicar(el.getAutorame());
	}

	@When("^Pesquisando livro Amazon pelo ISBN \"([^\"]*)\"$")
	public void pesquisando_livro_Amazon_pelo_ISBN(String ISBN) throws Throwable {
		Metodos.preencher(el.getCampodebuscaamaz(), ISBN);
		Metodos.clicar(el.getBtnPesquisarAmaz());
	}
}
