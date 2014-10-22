package Exercicio8;

import java.util.ArrayList;

/**
 * Created by alunos4 on 22/10/14.
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String RG;
    private ArrayList <Telefone> telefones;

    public Pessoa (String nome, String dataNascimento, String RG){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        telefones = new ArrayList<Telefone>();
    }

    public void novoTelefone(String numero, String modelo){
        telefones.add(new Telefone(numero, modelo));
    }
}
