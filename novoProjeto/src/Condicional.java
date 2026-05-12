public class Condicional {
    static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô!");
        }

        if(incluindoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado!");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
