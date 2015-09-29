/**
 * Created by juan on 28/09/15.
 */
public class Circulo extends Tipo {

    public Circulo(double radio){

        super("Circulo");
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double radio;

    @Override
    public double area(){

        return Math.PI * radio * radio;
    }



}
