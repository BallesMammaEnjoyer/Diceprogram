package proto;

import java.awt.event.*;
import javax.swing.*;
public class diceprogram {
    public static void main(String[] args) {
        final double[] roll = new double[1];
        JFrame f=new JFrame("Dice Roller");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("D4");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                roll[0] = Math.floor(Math.random()*(4-1+1)+1);
                tf.setText("You rolled a " + roll[0]);


            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
