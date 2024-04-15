#language:pt

Funcionalidade: Pagamento

  Contexto:
    Dado que esteja na página de login
    Quando for realizado login com os seguintes dados
      | email | teste@chronosacademy.com.br |
      | senha | 123456                      |
    Entao valido que exibe a tela de produtos

  @CompraCurso
  Cenario: Realizar compra de curso
    Quando seleciono o pacote de cursos
    E clico em ir para pagamento
    E seleciono a opcao cartao de credito
    E realizo a compra com os seguintes dados
      | numeroCartao | 5320775618951072 |
      | vencimento   | 09/2025          |
      | cvv          | 855              |
      | nomeTitular  | Chronos          |
      | cpfTitular   | 50899911030      |
    Entao valido que foi exibido a mensagem "Pagamento Realizado!"
