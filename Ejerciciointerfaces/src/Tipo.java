/**
 * Created by juan on 28/09/15.
 */
public abstract class Tipo implements Shape {

    private String type;

    public Tipo(String type){

        this.type = type;
    }

    @Override
    public String toString(){

        return "Soy un "+type;
    }
}
