package SockettThreadtask2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SecondPage extends JPanel {
    private MainFrame parent;
    private JTextField textField;
    private JButton button;
    private JTextField name;

    public SecondPage(MainFrame parent) {

            this.parent = parent;
            setSize(500, 500);
            setLayout(null);

            textField = new JTextField("");
            textField.setToolTipText("Message");
            textField.setSize(300, 30);
            textField.setLocation(130, 150);
            add(textField);

            name = new JTextField("");
            name.setToolTipText("Name");
            name.setSize(300,30);
            name.setLocation(130,100);
            add(name);

            button = new JButton("SEND");
            button.setSize(150, 30);
            button.setLocation(50, 300);
            add(button);
            button.addActionListener(e -> {
                try{
                    Socket socket = new Socket("localhost", 5879);
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                        String message = textField.getText();
                        String namee = name.getText();
                        PackageData p = new PackageData(namee,message);
                        outputStream.writeObject(p);
                        textField.setText("");
                }catch (Exception ee){
                    ee.printStackTrace();
                }
            });
    }
}