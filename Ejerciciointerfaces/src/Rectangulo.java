/**
 * Created by juan on 28/09/15.
 */
public class Rectangulo extends Tipo {

    private int altura;
    private int largo;

    public Rectangulo(int altura, int largo){

        super("Rectangulo");
        this.altura=altura;
        this.largo=largo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public double area(){
        return  altura * largo;

    }
}
