/**
 * Created by juan on 28/09/15.
 */
public class Main {

        public static void main(String[] args) {


            Shape[] shapes = new Shape[2];
            shapes[0] = new Circulo(2.5);
            shapes[1] = new Rectangulo(3,4);

            for(Shape shape : shapes){

                System.out.println(shape + " with area = " + shape.area());

            }
    }
}
