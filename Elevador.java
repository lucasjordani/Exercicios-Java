/**
 * Created by alunos4 on 17/10/14.
 */
public class Elevador {

    private int andar;

    public Elevador(){
        andar = 1;
    }

    public void sobe(){
        andar++;
    }

    public void desce(){
        if (andar > 1)
            andar--;
    }

    public String mostraAndar(){
        return "O elevador esta no " + andar + "º andar";
    }
}
