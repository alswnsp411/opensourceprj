package chap10_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickRandom_06 extends JFrame {
    private JLabel la = new JLabel("C");

    public ClickRandom_06() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseAdapter());

        c.setLayout(null);
        la.setSize(10, 10);
        la.setLocation(100, 100);
        c.add(la);

        setSize(250, 250);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new ClickRandom_06();
    }
}
