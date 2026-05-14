import java.util.Scanner;

public class Desafios {
    public static void main() {
        Scanner leitura = new Scanner(System.in);

        //Desafios 1 e 2
//        System.out.println("Fale um número: ");
//        double numeroGerado = leitura.nextDouble();
//        System.out.println("Fale o segundo número: ");
//        double numeroGerado2 = leitura.nextDouble();

//        if (numeroGerado > 0){
//            System.out.println("Número Positivo");
//        } else {
//            System.out.println("Número Negativo");
//        }

//        if (numeroGerado > numeroGerado2) {
//            System.out.println("O primeiro é maior que o segundo!");
//        }
//        else if(numeroGerado == numeroGerado2) {
//            System.out.println("Os números são iguais!");
//        }
//        else {
//            System.out.println("O segundo número é maior!");
//        }

        // Desafio 3
        System.out.println("Digite se quer calcular a área de círculo ou de quadrado: ");
        String areaEscolhida = leitura.nextLine();

        if(areaEscolhida.equals("quadrado")){
            System.out.println("Digite o valor de um dos lados");
            double lado1 = leitura.nextDouble();
            System.out.println("Digite o valor do outro lado");
            double lado2 = leitura.nextDouble();
            double areaQuadrado = lado1 * lado2;
            System.out.println("A área do quadrado é: "+ areaQuadrado + "m²");

        } else if(areaEscolhida.equals("circulo")){
            System.out.println("Digite o valor do raio");
            double raio = leitura.nextDouble();
            double areaCirc = Math.pow(raio,2) * Math.PI;
            System.out.println("A área do circulo é: "+ areaCirc +"m²");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}
