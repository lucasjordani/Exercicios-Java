/**
 * Created by alunos4 on 17/10/14.
 */
public class Atleta {
    private int[] notas;

    private double media;

    public Atleta(int n1, int n2, int n3, int n4, int n5, int n6){
        notas = new int[6];
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        notas[3] = n4;
        notas[4] = n5;
        notas[5] = n6;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double calculaMedia(){

        ordenaNotas();

        double media = (notas[1] + notas[2] + notas[3] + notas[4])/4;

        return media;
    }

    private void ordenaNotas() {

        for (int i = 0; i < notas.length - 1; i++){
            for (int j = i + 1; j < notas.length; j++){

                //testa se a nota da esquerda é maior que a da direita
                if (notas[i] > notas[j]){

                    //realiza a troca
                    int aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
    }

    public double menorNota(){
        ordenaNotas();

        return notas[0];
    }

    public double maiorNota(){
        ordenaNotas();

        return notas[5];
    }

    public int quantidadeAbaixo6(){
        int cont = 0;

        for(int i = 0; i < notas.length; i++){
            if(notas[i] <6){
                cont ++;
            }

        }

        return cont;
    }

}
