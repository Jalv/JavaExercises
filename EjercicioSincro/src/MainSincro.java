/**
 * Created by juan on 1/10/15.
 */
public class MainSincro {

    public static void main(String[] args) {
        String line = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.\n";
        Buffer buffer = new Buffer();
        Thread productor = new Thread(new ThProductor(buffer, line), "producer");
        Thread consumidor = new Thread(new ThConsumidor(buffer), "consumer");

        consumidor.start();
        productor.start();
    }


}
