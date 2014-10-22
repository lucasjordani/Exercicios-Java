package Exercicio8;

import java.lang.Comparable;

/**
 * Created by alunos4 on 22/10/14.
 */
public class Contato implements Comparable {
    private String nome;
    private int idade;
    private String email;

    public Contato(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Object o) {
        Contato e = (Contato) o;
        return this.nome.compareToIgnoreCase(e.getNome());
    }
}