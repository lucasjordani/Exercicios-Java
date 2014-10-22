/**
 * Created by alunos4 on 17/10/14.
 */
public class Aluno {

    private double p1;
    private double p2;
    private double p3;
    private double p4;
    private String nome;
    private double media;


    public Aluno(String nome, double p1, double p2, double p3, double p4){
        this.nome = nome;

        if (p1 > 10) this.p1 = 10;
        if (p1 < 0) this.p1 = 0;
        else this.p1 = p1;

        if (p1 > 10) this.p2 = 10;
        if (p1 < 0) this.p2 = 0;
        else this.p2 = p2;

        if (p1 > 10) this.p3 = 10;
        if (p1 < 0) this.p3 = 0;
        else this.p3 = p3;

        if (p1 > 10) this.p4 = 10;
        if (p1 < 0) this.p4 = 0;
        else this.p4 = p4;
    }

    public String calculaMedia(){
        return "A média do aluno " + this.nome + " é " + (p1 + p2 + p3 + p4)/4;
    }
}
