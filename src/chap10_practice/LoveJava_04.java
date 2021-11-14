package chap10_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoveJava_04 extends JFrame {
    private JLabel la = new JLabel("Love Java");
    private String text= "Love Java";

    public LoveJava_04() {
        setTitle("Left키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300,150);
        setVisible(true);

        //키 입력을 받을 수 있도록 포커스를 준다.
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                la.setText(text.substring(1)+text.charAt(0));
                text= text.substring(1)+text.charAt(0);
            }
        }
    }

    public static void main(String [] args) {
        new LoveJava_04();
    }
}
