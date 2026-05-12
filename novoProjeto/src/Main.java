//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Top Gun: Maverick");

    int anoDeLancamento = 2022;
    System.out.println("Ano de Lançamento: " + anoDeLancamento);
    boolean incluindoNoPlano = true;
    double notaDoFilme = 8.1;

    // Media calculadas por aoskdaoskdaosd

    double media = (9.8 + 6.3 + 8.0) / 3;
    System.out.println(media);
    String sinopse;
    sinopse = """
            Filme de ação com Tom Cruise
            Legal demais!
            Ano de lançamento:
            """ + anoDeLancamento;
    System.out.println(sinopse);

    int classificacao;
    classificacao = (int) (media/2);
    System.out.println(classificacao);

    double celsius = 20;
    double fahrenheit = (celsius * 1.8) + 32;
    System.out.println(fahrenheit);

    int fahrenheitInteiro = (int) fahrenheit;
    System.out.println(fahrenheitInteiro);
    /*
    String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;
    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e gastei %.2f", nome, idade, valor));

    int aulas = 10;

    String mensagem = """
            Olá, %s!
            Boas vindas ao curso de Java!
            Teremos %d aulas.
            """.formatted(nome, aulas);

    System.out.println(mensagem);
    */
}
