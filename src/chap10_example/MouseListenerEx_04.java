package chap10_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx_04 extends JFrame {
    private JLabel la = new JLabel("Hello");

    public MouseListenerEx_04() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener_04());

        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);

        setSize(250, 250);
        setVisible(true);
    }

    class MyMouseListener_04 implements MouseListener {
        //마우스 버튼이 눌러진 위치를 알아내어 la("hello" 문자열)를 그 위치로 옮긴다.
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }

        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

    }

    public static void main(String[] args) {
        new MouseListenerEx_04();
    }
}