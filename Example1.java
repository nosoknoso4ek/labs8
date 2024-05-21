package laba8;

import java.io.IOException;
import java.io.InputStream;

public class Example1 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte !=-1){
                System.out.print((char)oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }

    }
}
