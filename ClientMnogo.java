package courses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMnogo {

    public static void main(String[] args) {
        try {
            Socket s = new Socket(InetAddress.getByName("172.17.13.68"),3134);
            String data = "Hi,i`m in televizor";
            s.getOutputStream().write(data.getBytes());
            byte[] buf = new byte[64*1024];
            int r = s.getInputStream().read(buf);
            data = new String(buf,0,r);
            System.out.println("Answer "+data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
