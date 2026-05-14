import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main() {
        Scanner leitura = new Scanner(System.in);
        Random rand = new Random();

        int aleatorio = rand.nextInt(100);
        System.out.println("Resposta: " + aleatorio);

        int tentativas = 0;
        System.out.println("Será sorteado um número, tente adivinhar, terá 5 tentativas: ");

        while (tentativas < 5) {
            System.out.println("Digite o valor sorteado: ");
            int valorAdivinhado = leitura.nextInt();
            tentativas++;

            if(valorAdivinhado == aleatorio) {
                System.out.println("Acertou!");
                break;
            }else{
                System.out.println("Errou, restam " + (5-tentativas) + " tentativas!");
                if (tentativas == 5){
                    System.out.println("Não acertou, tente na próxima vez.");
                }
            }
        }
    }
}
