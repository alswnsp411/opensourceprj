package chap10_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx_07 extends JFrame {
    private JLabel la = new JLabel();

    public KeyCodeEx_07() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

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
            la.setText(e.getKeyText(e.getKeyCode()));

            if(e.getKeyChar() == '%') {
                Component c = (Component) e.getSource();
                c.setBackground(Color.YELLOW);
            }
            else if(e.getKeyCode() == KeyEvent.VK_F1){
                Component c = (Component) e.getSource();
                c.setBackground(Color.GREEN);
            }
        }
    }

    public static void main(String [] args) {
        new KeyCodeEx_07();
    }
}
