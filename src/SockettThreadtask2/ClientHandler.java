package SockettThreadtask2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData pd;
            while ((pd = (PackageData) inputStream.readObject()) != null) {
                System.out.println(pd.getTextField() + ": " + pd.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
