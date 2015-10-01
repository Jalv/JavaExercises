/**
 * Created by juan on 1/10/15.
 */
public class ThProductor implements Runnable {

    private Buffer buffer = null;
    private String line = null;

    public ThProductor(Buffer buffer, String line) {
        this.buffer = buffer;
        this.line = line;
    }

    @Override
    public void run() {
        char chars[] = line.toCharArray();
        for (char c : chars) {
            buffer.put(c);

        }
    }
}


