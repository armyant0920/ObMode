import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        final TestBean bean = new TestBean();
        final ArrayList<JButton> btnList = new ArrayList<>();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        frame.setLocationRelativeTo(null);


        Container c = frame.getContentPane();
        c.setLayout(new BorderLayout());



        frame.setSize(500, 500);
        /*KeyListener keyListener=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println("key");
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    bean.setStr(JOptionPane.showInputDialog("輸入文字"));
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        frame.addKeyListener(keyListener);*/
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    bean.setStr(JOptionPane.showInputDialog("輸入文字"));
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        frame.setVisible(true);


    }
}

