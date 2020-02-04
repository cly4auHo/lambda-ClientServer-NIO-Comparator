package courses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    JLabel labe = new JLabel("Text");
    JButton button = new JButton("OK");

    MyWindow() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(button);
        panel.add(labe);
        add(panel);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }

    /* private void init(){
         button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 labe.setText("NA");
             }
         });
     }*/
    private void init() {
        button.addActionListener((e) -> labe.setText("NA"));
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
