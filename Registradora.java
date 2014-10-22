/**
 * Created by alunos4 on 17/10/14.
 */
public class Registradora {
    private double valorTotal;

    public Registradora(){
        valorTotal = 0;
    }

    public void registraParcela(double parcela){
        valorTotal += parcela;
    }

    public String mostraTotal(){
        return "Valor Total sem 10%: " + valorTotal +
                "\nValor Total com 10%: " + valorTotal * 1.1;
    }

    public double calculaTroco(boolean taxa, double dinheiro){
        if (taxa)
        return dinheiro - (valorTotal * 1.1);
        return dinheiro - valorTotal;
    }
}