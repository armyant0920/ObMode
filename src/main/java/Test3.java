import javax.swing.*;
import javax.swing.plaf.ComponentInputMapUIResource;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        final TestBean bean = new TestBean();
        final ArrayList<JButton> btnList = new ArrayList<>();

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton){

                JButton btn=(JButton)e.getSource();
                btn.setText(JOptionPane.showInputDialog("輸入文字"));
            }
            }
        };

        Container c = frame.getContentPane();
        c.setLayout(new BorderLayout());

        JButton Button1 = new JButton("n");
        JButton Button2 = new JButton("w");
        JButton Button3 = new JButton("e");
        JButton Button4 = new JButton("s");
        JButton Button5 = new JButton("c");
        btnList.add(Button1);
        btnList.add(Button2);
        btnList.add(Button3);
        btnList.add(Button4);
        btnList.add(Button5);
        for(JButton btn:btnList){
            btn.addActionListener(listener);
        }
        c.add(Button1, BorderLayout.NORTH);
        c.add(Button2, BorderLayout.WEST);
        c.add(Button3, BorderLayout.EAST);
        c.add(Button4, BorderLayout.SOUTH);
        c.add(Button5, BorderLayout.CENTER);


        frame.setSize(500, 500);


        frame.setVisible(true);
        bean.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                for (JButton btn : btnList) {
                    btn.setText(bean.getStr());
                }
            }
        });

    }
}
