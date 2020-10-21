#Author: neivaxxavier@gmail.com
@tag
Feature: pesquisar
  Eu como usuario quero pesquisar livros  e  validar em outros  dois sites diferentes.

  @tag1
  Scenario: pesquisando Livros e validando Autor
    Given que eu acesse o site "https://www.submarino.com.br"
    And clicar no link do livro
    When verificando o autor do livro
    And evidencia submarino "submarino"
    And que eu acesse o site "https://www.americanas.com.br"
    And Pesquisando livro pelo ISBN "7908312102029"
    And Validando autor Americanas
    And Evidencia Americanas "Americanas"
    And que eu acesse o site "https://www.amazon.com.br"
    And Pesquisando livro Amazon pelo ISBN "7908312102029"
    And Validando autor Amazon
    Then Evidencia Amazon "Amazon"
