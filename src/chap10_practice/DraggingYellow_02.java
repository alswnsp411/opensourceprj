package chap10_practice;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DraggingYellow_02 extends JFrame {
    private JLabel la = new JLabel("");

    public DraggingYellow_02() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.add(la);

        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la.setText("");
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
        public void mouseReleased(MouseEvent e) {
            la.setText("");
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

        public void mouseDragged(MouseEvent e) {
            la.setText("드래깅 중");
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }
        public void mouseMoved(MouseEvent e) {}
    }

    public static void main(String [] args) {
        new DraggingYellow_02();
    }
}
