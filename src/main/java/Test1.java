import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Score score=new Score();
        JFrame frame=new JFrame("TEST1");

        JPanel panel=new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        CustomLabel label1=new CustomLabel("label",JLabel.CENTER);
        CustomLabel label2=new CustomLabel("label",JLabel.CENTER);
//        score.register(label1);
//        score.register(label2);
        label1.subscribe(score);
        label2.subscribe(score);
        label1.setOpaque(true);
        label1.setForeground(Color.RED);

        label1.setBackground(Color.yellow);
        label1.setBounds(0,0,200,200);
        label1.setText("XX");

        label2.setBounds(200,0,200,200);
        label2.setOpaque(true);
        label2.setForeground(Color.RED);
        label2.setBackground(Color.PINK);
        label2.setText("OO");
        panel.add(label1);
        panel.add(label2);



        frame.add(panel,BorderLayout.CENTER);
        frame.pack();
        frame.setSize(500,500);

        frame.setVisible(true);
        score.setTag("asdfaf");


        System.out.println("===================");

        while(true) {
            Scanner sc = new Scanner(System.in);
            score.setTag(sc.next());

        }





    }
}
