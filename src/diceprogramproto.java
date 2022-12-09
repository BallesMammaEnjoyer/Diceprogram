import java.awt.event.*;
import javax.swing.*;
public class diceprogramproto {
    public static void main(String[] args) {
        final double[] roll = new double[1];
        double sides;
        double p = 1;



            sides = Double.parseDouble(JOptionPane.showInputDialog("How many sides do you want your dice to have?"));
            if (sides < 0) {
                sides = (-sides);
            }


            JFrame f = new JFrame("Dice Roller");
            final JTextField tf = new JTextField();
            tf.setBounds(50, 50, 150, 20);
            JButton b = new JButton("D" + sides);
            b.setBounds(50, 100, 95, 30);
            double finalSides = sides;
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    roll[0] = Math.floor(Math.random() * (finalSides - 1 + 1) + 1);
                    tf.setText("You rolled a " + roll[0]);


                }
            });

        JButton v = new JButton("D" + sides);
        v.setBounds(150,250,70,50);
        v.setVisible(true);
        v.setText("hej");
        f.add(v);
        v.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}

