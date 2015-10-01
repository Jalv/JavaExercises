/**
 * Created by juan on 1/10/15.
 */
public class ThConsumidor implements Runnable {

    private Buffer buffer = null;

    public ThConsumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        char c;
        while ((c = buffer.get()) != '\n') {
            // Uncomment to log what is reading the thread
            // System.out.println(Thread.currentThread().getName() + " reads " + c);
            sb.append(c);
        }
        System.out.println(sb);
    }
}
