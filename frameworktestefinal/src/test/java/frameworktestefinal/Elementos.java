package frameworktestefinal;

import org.openqa.selenium.By;

public class Elementos {

    // Submarino
	private By btnlivrosub = By.xpath(
			"/html/body/div[4]/div/div/div/div[1]/div/div[4]/div/div/div/div/div/div/div/div/div[6]/div/div/div/a/div[2]/span");
	private By livrosub = By.xpath(
			"/html/body/div[1]/div/div/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div/section/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/a/section/div[2]/div[1]/h2");
	private By autorsub = By.xpath(
			"/html/body/div[4]/div/div/div[2]/div/section/div/div[2]/div[1]/div[2]/div[1]/div[3]/span/span/a/span");
	
	// Americanas
	private By campodebuscaame = By.name("conteudo");
	private By autorame = By.xpath("/html/body/div[4]/div/div/div[2]/div/section/div/div[2]/div[1]/div[2]/div[2]/a");
	private By BtnPesquisarAme = By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[2]/form/div/button[2]");
	private By livroAme = By.xpath("/html/body/div/div/div/div[3]/div[2]/div[1]/div/a/span[1]");
	private By autoramericanas = By.xpath("/html/body/div[4]/div/div/div[5]/div[2]/section/div/div[3]/table/tbody/tr[12]/td[2]/span");
	private By selecionarlivroameri= By.xpath("/html/body/div/div/div/div[3]/div[3]/div[2]/div/a/span[1]");
	
	
	// Amazon
	private By campodebuscaamaz = By.id("twotabsearchtextbox");
	private By autoramaz = By.xpath(
			"/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div/span[2]");
   private By BtnPesquisarAmaz = By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input");
	
	
	
	
	
	
	public By getBtnPesquisarAmaz() {
	return BtnPesquisarAmaz;
}

	public By getSelecionarlivroameri() {
		return selecionarlivroameri;
	}

	public By getAutoramericanas() {
		return autoramericanas;
	}

	public By getLivroAme() {
		return livroAme;
	}

	public By getBtnPesquisarAme() {
	return BtnPesquisarAme;
}

	public void setAutorsub(By autorsub) {
		this.autorsub = autorsub;
	}

	public By getBtnlivrosub() {
		return btnlivrosub;
	}

	public By getLivrosub() {
		return livrosub;
	}

	public By getAutorsub() {
		return autorsub;
	}

	public By getCampodebuscaame() {
		return campodebuscaame;
	}

	public By getAutorame() {
		return autorame;
	}

	public By getCampodebuscaamaz() {
		return campodebuscaamaz;
	}

	public By getAutoramaz() {
		return autoramaz;
	}

	

}
