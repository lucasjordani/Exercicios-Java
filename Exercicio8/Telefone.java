package Exercicio8;

import java.util.ArrayList;
import java.util.Collections;

public class Telefone {
    private String numero;
    private String modelo;
    private ArrayList<Contato> contatos;

    public Telefone(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
        contatos = new ArrayList<Contato>();
    }

    public void excluirContato(Contato c1){
        contatos.remove(c1);
    }

    public void adicionarContato(Contato c1){
        contatos.add(c1);
    }

    public void ordenarContatosCrescente(){
        Collections.sort(contatos);
    }

    public void ordenarContatosDecrescente(){
        Collections.sort(contatos);
        Collections.reverse(contatos);
    }
}
