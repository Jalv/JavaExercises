/**
 * Created by juan on 1/10/15.
 */
public class MainTh {

    public static void main(String[] args) throws InterruptedException {
        ClaseTh threadClass = new ClaseTh("thread class");
        Thread thread = new Thread(new ClaseRun(), "runnable class");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Se acabó.");
    }
}
