package chap10_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener_02 extends JFrame {
    InnerClassListener_02() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener_02());
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    //내부 클래스
    private class MyActionListener_02 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");

            // InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
            InnerClassListener_02.this.setTitle(b.getText()); // 프레임 타이틀에 버튼 문자열을 출력한다.
        }
    }

    public static void main(String [] args) {
        new InnerClassListener_02();
    }
}
