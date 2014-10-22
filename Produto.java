public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEstoque){
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public void setCodigo(int numero){
        if (numero == 0)
            codigo = 1;
        else if (numero < 0)
            codigo = numero * -1;
        else
            codigo = numero;
    }

    public void setPreco(double valor){
        if (valor == 0)
            preco = 1;
        else if (valor < 0)
            preco = valor * -1;
        else
            preco = valor;
    }

    public void setQuantidadeEstoque(int numero){
        if (numero < 2)
            quantidadeEstoque = 2;
        else if (numero > 30)
            quantidadeEstoque = 30;
        else
            quantidadeEstoque = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String promocao(){

        double valorP;

        switch (this.codigo){
            case 1:
            case 2:
                valorP = preco * 0.95;
                break;
            case 3:
                valorP = preco * 0.93;
                break;
            case 4:
            case 5:
                valorP = preco * 0.90;
                break;
            default:
                valorP = preco;
                break;
        }

        return "O valor do produto na promocao é " + valorP;
    }
}
