import java.util.Scanner;

public class Desafios {
    public static void main() {
        Scanner leitura = new Scanner(System.in);

        // Desafios 1 e 2
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
//        System.out.println("Digite se quer calcular a área de círculo ou de quadrado: ");
//        String areaEscolhida = leitura.nextLine();
//
//        if(areaEscolhida.equals("quadrado")){
//            System.out.println("Digite o valor de um dos lados");
//            double lado1 = leitura.nextDouble();
//            System.out.println("Digite o valor do outro lado");
//            double lado2 = leitura.nextDouble();
//            double areaQuadrado = lado1 * lado2;
//            System.out.println("A área do quadrado é: "+ areaQuadrado + "m²");
//
//        } else if(areaEscolhida.equals("circulo") || areaEscolhida.equals("círculo")){
//            System.out.println("Digite o valor do raio");
//            double raio = leitura.nextDouble();
//            double areaCirc = Math.pow(raio,2) * Math.PI;
//            System.out.println("A área do circulo é: "+ areaCirc +"m²");
//
//        } else {
//            System.out.println("Escolha inválida.");
//        }


        // Desafio 4
//        System.out.println("Digite um número para fazermos a tabuada: ");
//        double numeroEscolhido = leitura.nextDouble();
//        int contador = 1;
//        while(contador <= 10) {
//            double result = numeroEscolhido*contador;
//            System.out.printf("%.2f x %d = " + String.format("%.2f", result) + "\n",numeroEscolhido, contador);
//            contador++;
//        }

        // Desafio 5

//        System.out.println("Digite um número para verificar se é impar ou par: ");
//        int numeroSelecionado = leitura.nextInt();
//        if (numeroSelecionado % 2 == 0) {
//            System.out.println("Número par");
//        } else {
//            System.out.println("Número Impar");
//        }

        // Desafio 6
        // 5x4x3x2x1 = 120
        System.out.println("Digite um número para fazer o fatorial: ");
        int numeroFatorial = leitura.nextInt();
        int fatorial = 1;

        for(int multiplicador = 1; multiplicador <= numeroFatorial; multiplicador++) {
            fatorial *= multiplicador;
        }
        System.out.println(fatorial);
    }
}
