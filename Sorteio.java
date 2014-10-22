import java.util.Scanner;

/**
 * Created by alunos4 on 21/10/14.
 */
public class Sorteio {

    private int numeroSorteado;
    private int numero;
    private int tentativas = 10;

    public Sorteio(){
        numeroSorteado = (int) (1 + (Math.random()*30));
    }

    public void tentar(){
       Scanner scan = new Scanner(System.in);
       while (tentativas > 0){
           System.out.println("Voce ainda tem " + tentativas + " tentativas:");
           System.out.print("Digite um numero de 1 a 30:");
           numero = scan.nextInt();
           if (numero == numeroSorteado){
               System.out.println("Parabens o numero sorteado foi " + numeroSorteado);
               return;
           }
           else if (numero > numeroSorteado)
               System.out.println("O numero sorteado é menor que o numero digitado");
           else
               System.out.println("O numero sorteado é maior que o numero digitado");
           tentativas--;
        }
        System.out.println("Voce não acertou o numero. O numero sorteado foi: " + numeroSorteado);
    }
}
