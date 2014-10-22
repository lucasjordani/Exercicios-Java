/**
 * Created by alunos4 on 17/10/14.
 */
public class Televisor{

    private int volume;
    private int canal;

    public Televisor(){
        canal = 1;
        volume = 1;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        if (volume > 0)
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        if (canal > 1)
        canal--;
    }

    public void trocarCanal(int numero){
        if (numero > 0)
            canal = numero;
    }

    public int getCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }
}
