package courses;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerMnogo extends Thread {
    Socket socket;
    int num;

    public ServerMnogo(int num, Socket socket) {
        this.socket = socket;
        this.num = num;
        setDaemon(true);
        start();
    }

    public static void main(String[] args) {
        try {
            int connections = 0;
            ServerSocket sockets = new ServerSocket(3134, 0, InetAddress.getByName("172.17.13.215"));
            System.out.println("Started");

            while (true) {
                new ServerMnogo(++connections, sockets.accept());
            }
        } catch (IOException e) {

        }
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            byte[] buf = new byte[64 * 1024];
            int r = is.read(buf);
            String data = new String(buf, 0, r);
            System.out.println("Accepted " + data);
            data = "Hello from server";
            os.write(data.getBytes());
        } catch (IOException e) {

        }
    }
}
