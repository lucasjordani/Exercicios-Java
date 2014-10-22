import Exercicio8.*;
import com.sun.corba.se.impl.orbutil.ORBUtility;

import java.util.Scanner;

/**
 * Created by alunos4 on 17/10/14.
 */
public class Main {

    public static void main(String args[]){

        //exe1();
        //exe2();
        //exe3();
        //exe4();
        //exe5();
        //exe6();
        //exe7();
        exe8();
    }

    private static void exe8() {
        Telefone tel = new Telefone("8080808080", "4S");
        tel.adicionarContato(new Contato("William"));
        tel.adicionarContato(new Contato("Pedro"));
        tel.adicionarContato(new Contato("João"));
        tel.adicionarContato(new Contato("Lucas"));
        tel.adicionarContato(new Contato("Alexandre"));

        tel.ordenarContatosCrescente();
    }


    private static void exe7() {
        Sorteio s1 = new Sorteio();
        s1.tentar();
    }

    private static void exe6() {
        Atleta at1 = new Atleta(8, 7, 6, 6, 5, 4);
        System.out.println("Maior nota: " + at1.maiorNota());
        System.out.println("Menor nota: " + at1.menorNota());
        System.out.println("Media: " + at1.calculaMedia());
        System.out.println("Notas abaixo de 6: " + at1.quantidadeAbaixo6());
    }

    private static void exe5() {
        Produto p1 = new Produto(1, "coca", 4.75, 8);
        Produto p2 = new Produto(4, "pepsi", 3.69, 1);
        Produto p3 = new Produto(3, "dolly", 1.15, 33);

        System.out.println(p1.promocao());
        System.out.println(p2.promocao());
        System.out.println(p3.promocao());
    }

    private static void exe4() {
        Registradora registradora = new Registradora();
        Scanner sc = new Scanner(System.in);
        double aux = 1;
        double dinheiro;

        do{
            System.out.println("Digite o valor da parcela");
            aux = sc.nextDouble();
            registradora.registraParcela(aux);
        }while(aux != 0);

        System.out.println(registradora.mostraTotal());

        System.out.println("Digite 1 para valor com taxa e 2 para sem taxa");
        aux = sc.nextInt();

        System.out.println("Informe o valor dado");
        dinheiro = sc.nextDouble();

        if (aux == 1)
            System.out.println("Valor do troco " + registradora.calculaTroco(true, dinheiro));
        else
            System.out.println("Valor do troco " + registradora.calculaTroco(false, dinheiro));
    }

    private static void exe3() {
        // Exercicio 3
        Aluno aluno1 = new Aluno("joao", 7, 5, 9, 4);
        Aluno aluno2 = new Aluno("paulo", 6, 7, 8, 9);
        Aluno aluno3 = new Aluno("ana", 8, 7, 5, 0);

        System.out.println(aluno1.calculaMedia());
        System.out.println(aluno2.calculaMedia());
        System.out.println(aluno3.calculaMedia());
    }

    private static void exe2() {
        // Exercicio 2
        Televisor meuTelevisor = new Televisor();

        System.out.println("Canal: " + meuTelevisor.getCanal());
        System.out.println("Volume: " + meuTelevisor.getVolume());
        meuTelevisor.aumentarVolume();
        meuTelevisor.aumentarVolume();
        meuTelevisor.aumentarVolume();
        meuTelevisor.aumentarVolume();
        meuTelevisor.aumentarVolume();
        meuTelevisor.aumentarVolume();
        meuTelevisor.diminuirVolume();
        meuTelevisor.aumentarCanal();
        meuTelevisor.aumentarCanal();
        meuTelevisor.aumentarCanal();
        System.out.println("Canal: " + meuTelevisor.getCanal());
        System.out.println("Volume: " + meuTelevisor.getVolume());
        meuTelevisor.trocarCanal(12);
        meuTelevisor.aumentarVolume();
        meuTelevisor.aumentarVolume();
        meuTelevisor.diminuirVolume();
        meuTelevisor.diminuirCanal();
        System.out.println("Canal: " + meuTelevisor.getCanal());
        System.out.println("Volume: " + meuTelevisor.getVolume());
    }

    private static void exe1() {
        // Exercicio 1
        Elevador meuElevador = new Elevador();

        System.out.println(meuElevador.mostraAndar());
        meuElevador.sobe();
        meuElevador.sobe();
        meuElevador.desce();
        meuElevador.sobe();
        meuElevador.sobe();
        meuElevador.sobe();
        meuElevador.desce();
        System.out.println(meuElevador.mostraAndar());
    }

}
