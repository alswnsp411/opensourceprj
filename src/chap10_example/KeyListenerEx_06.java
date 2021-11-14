package chap10_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx_06 extends JFrame {
    private JLabel [] keyMessage;

    public KeyListenerEx_06() {
        setTitle("keyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new MyKeyListener());

        keyMessage = new JLabel [3];
        keyMessage[0] = new JLabel(" getKeyCode() ");
        keyMessage[1] = new JLabel(" getKeyChar() ");
        keyMessage[2] = new JLabel(" getKeyText() ");

        for(int i=0; i<keyMessage.length; i++) {
            c.add(keyMessage[i]);
            //컴포넌트의 바탕색이 보이도록 하기 위해서 컴포넌트가 불투명하게 지정될 필요가 있다.
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.YELLOW);
        }

        setSize(300,150);
        setVisible(true);  //스윙 프레임 출력

        //이후에 포커스를 주어야 함.
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(e.getKeyText(keyCode));
        }
    }

    public static void main(String [] args) {
        new KeyListenerEx_06();
    }
}
