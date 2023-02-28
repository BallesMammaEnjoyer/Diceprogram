import javax.swing.*;
import java.awt.*;
import static java.lang.Double.parseDouble;
import static java.lang.Double.sum;
import static javax.swing.JOptionPane.showInputDialog;

public class Uppgift {

    public static void main(String[] args) {
        final int[] roll = new int[1];
        final int[] slots = new int[1];
        int[] k = new int[8];





        JFrame f = new JFrame("Dice Roller");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 300, 40);
        JButton b = new JButton("D4");
        b.setBounds(140, 100, 60, 20);

        b.addActionListener(e -> {
            Graphics g = null;
            roll[0] = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);



        });

        JButton v = new JButton("D6");
        v.setBounds(200,100,60,20);
        v.setVisible(true);
        v.setText("d6");
        f.add(v);
        v.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (6- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });
        JButton d8 = new JButton("D8");
        d8.setBounds(260,100,60,20);
        d8.setVisible(true);
        d8.setText("d8");
        f.add(d8);
        d8.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (8- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });

        JButton d2 = new JButton("D2");
        d2.setBounds(80,100,60,20);
        d2.setVisible(true);
        d2.setText("d2");
        f.add(d2);
        d2.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (2- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });
        JButton d10 = new JButton("D10");
        d10.setBounds(80,150,60,20);
        d10.setVisible(true);
        d10.setText("d10");
        f.add(d10);
        d10.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (10- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });
        JButton d12 = new JButton("D12");
        d12.setBounds(140,150,60,20);
        d12.setVisible(true);
        d12.setText("d12");
        f.add(d12);
        d12.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (12- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });
        JButton d20 = new JButton("D20");
        d20.setBounds(200,150,60,20);
        d20.setVisible(true);
        d20.setText("D20");
        f.add(d20);
        d20.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (20- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });

        JButton d100 = new JButton("D20");
        d100.setBounds(260,150,65,20);
        d100.setVisible(true);
        d100.setText("D100");
        f.add(d100);
        d100.addActionListener(e -> {
            roll[0] = (int) Math.floor(Math.random() * (100- 1 + 1) + 1);
            tf.setText("You rolled a " + roll[0]);

        });

        JButton Create = new JButton("Create");
        Create.setBounds(190,300,130,20);
        Create.setVisible(true);
        Create.setText("Create Custom");
        f.add(Create);
        Create.addActionListener(e -> {
            slots[0] = (int) parseDouble(showInputDialog("What slot do you want to change?(1-8)"));
            slots[0] = (slots[0] - 1);
            for (int i = 0 ; i< 8 ; i++) {
                if (i == slots[0]){
                    k[i] = (int) Math.abs(parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
                }


            }



        });
        JButton slot1 = new JButton("slot1");
        slot1.setBounds(80,200,70,20);
        slot1.setVisible(true);
        slot1.setText("Slot 1");
        f.add(slot1);
        slot1.addActionListener(e -> {

            if (k[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }





        });
        JButton slot2 = new JButton("slot2");
        slot2.setBounds(140,200,70,20);
        slot2.setVisible(true);
        slot2.setText("Slot 2");
        f.add(slot2);
        slot2.addActionListener(e -> {
            if (k[1]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[1] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot3 = new JButton("slot3");
        slot3.setBounds(200,200,70,20);
        slot3.setVisible(true);
        slot3.setText("Slot 3");
        f.add(slot3);
        slot3.addActionListener(e -> {
            if (k[2]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[2] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot4 = new JButton("slot4");
        slot4.setBounds(260,200,70,20);
        slot4.setVisible(true);
        slot4.setText("Slot 4");
        f.add(slot4);
        slot4.addActionListener(e -> {
            if (k[3]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[3] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot5 = new JButton("slot5");
        slot5.setBounds(80,250,70,20);
        slot5.setVisible(true);
        slot5.setText("Slot 5");
        f.add(slot5);
        slot5.addActionListener(e -> {
            if (k[4]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[4] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });

        JButton slot6 = new JButton("slot6");
        slot6.setBounds(140,250,70,20);
        slot6.setVisible(true);
        slot6.setText("Slot 6");
        f.add(slot6);
        slot6.addActionListener(e -> {
            if (k[5]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[5] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);

            }
        });
        JButton slot7 = new JButton("slot7");
        slot7.setBounds(200,250,70,20);
        slot7.setVisible(true);
        if (k[7] == 0){
            slot7.setText("Slot 7");}
        f.add(slot7);
        slot7.addActionListener(e -> {
            if (k[6]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[6] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }
        });
        JButton slot8 = new JButton("Slot8");
        slot8.setBounds(260,250,70,20);
        slot8.setVisible(true);
        slot8.setText("Slot 8");
        f.add(slot8);
        slot8.addActionListener(e -> {
            if (k[7]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k[7] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slotcheck = new JButton("slotcheck");
        slotcheck.setBounds(80,300,110,20);
        slotcheck.setVisible(true);
        slotcheck.setText("Slot checker");
        f.add(slotcheck);
        slotcheck.addActionListener(e -> {

            slots[0] = (int) parseDouble(showInputDialog("What slot do you want to check?(1-8)"));

            if (slots[0] == 1){
                if (k[0]==0){
                    tf.setText("This slot is empty");
                }
                else tf.setText("This slot is a D" + k[0]);
            }



        });
        JButton DnDSpells = new JButton("DNDSPELLS");
        DnDSpells.setBounds(180,350,130,20);
        DnDSpells.setVisible(true);
        DnDSpells.setText("DnD Spells");
        f.add(DnDSpells);
        DnDSpells.addActionListener(e -> {
            double mod;
            final String[] n = new String[8];
            final double[] l = {0};
            int[] s = new int[8];
            int[] dice = new int[8];
            int[] u = new int[8];
            int[] w = new int[8];
            int[] summa = new int[8];
            for (int i = 0 ; i< 8 ; i++) {
                n[i] = ("Slot " + (i+1));

            }

            mod = Double.parseDouble(JOptionPane.showInputDialog("What is your Spellcasting Ability Modifier?"));

            JFrame d = new JFrame("DnD Spells");
            final JTextField df = new JTextField();
            df.setBounds(50, 50, 300, 40);


            final JButton dndslot1 = new JButton();
            JButton Fireball = new JButton("fireball");
            Fireball.setBounds(50,100,80,20);
            Fireball.setVisible(true);
            Fireball.setText("Fireball");
            d.add(Fireball);
            Fireball.addActionListener(o -> {
                int[] F = new int[8];
                int sum = 0;
                for (int i = 0 ; i< F.length ; i++) {
                    F[i] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                    sum = sum + F[i];

                }
                df.setText("Damage is " + sum);
            });
            JButton Cure = new JButton("Cure");
            Cure.setBounds(130,100,115,20);
            Cure.setVisible(true);
            Cure.setText("Cure Wounds");
            d.add(Cure);
            Cure.addActionListener(o -> {
                int sum = 0;
                int C = (int) Math.floor(Math.random() * (8 - 1 + 1) + 1);
                sum = (C + (int)mod);

                df.setText("Healing is " + sum);
            });

            JButton HW = new JButton("HW");
            HW.setBounds(245,100,115,20);
            HW.setVisible(true);
            HW.setText("Healing Word");
            d.add(HW);
            HW.addActionListener(o -> {
                int sum = 0;
                int C = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
                sum = (C + (int)mod);

                df.setText("Healing is " + sum);
            });

            JButton FB = new JButton("FB");
            FB.setBounds(50,150,100,20);
            FB.setVisible(true);
            FB.setText("Firebolt");
            d.add(FB);
            FB.addActionListener(o -> {
                if (l[0] == 0) {
                    l[0] = Double.parseDouble(JOptionPane.showInputDialog("What is your level?"));
                }
                int sum = 0;
                int[] C = new int[4];



                if (11 > l[0]){
                    if (l[0] <5){
                        C[0] = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
                        sum = C[0];
                    }
                    else {
                        for (int i = 0 ; i< 2 ; i++) {
                            C[i] = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
                            sum = (C[i] + sum);
                        }
                    }
                }
                if (17> l[0]){
                    if (l[0] >11) {
                        for (int i = 0; i < 3; i++) {
                            C[i] = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
                            sum = (C[i] + sum);
                        }
                    }
                }
                else {
                    for (int i = 0 ; i < 4 ; i++) {
                        C[i] = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
                        sum = (C[i] + sum);
                    }
                }
                df.setText("Damage is " + sum);

            });
            JButton MM = new JButton("MM");
            MM.setBounds(150,150,115,20);
            MM.setVisible(true);
            MM.setText("Magic Missile");
            d.add(MM);
            MM.addActionListener(o -> {
                int[] sum = new int[3];
                int[] C = new int[3];
                int t;
                t = (int)Double.parseDouble(JOptionPane.showInputDialog("How many targets?"));
                if (t == 1) {
                    int i;
                    for (i = 0; i < 3; i++) {
                        C[i] = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
                        sum[0] = sum[0] + C[i] + 1;
                    }
                    df.setText("Your damage is " + sum[0]);
                }
                if (t == 2) {
                    int i;
                    for (i = 0; i < 2; i++) {
                        C[i] = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
                        sum[i] = sum[i] + C[i] + 1;
                    }
                    sum[1] = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
                    sum[1] = sum[1] + 1;
                    df.setText("Your damage is " + sum[0] + " and " + sum[1]);


                }
                if (t == 3) {
                    int i;
                    for (i = 0; i < 3; i++) {
                        C[i] = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
                        sum[i] = sum[i] + C[i] + 1;
                    }
                    df.setText("Your damage is " + sum[0] + " and " + sum[1] + " and " + sum[2]);

                }




            });
            JButton TW = new JButton("TW");
            TW.setBounds(265,150,115,20);
            TW.setVisible(true);
            TW.setText("Thunderwave");
            d.add(TW);
            TW.addActionListener(o -> {
                int sum = 0;
                int C = (int) Math.floor(Math.random() * (8 - 1 + 1) + 1);
                int r = (int) Math.floor(Math.random() * (8 - 1 + 1) + 1);
                sum = (C + r);

                df.setText("Damage is " + sum + " on a fail, " + sum/2 + " on a succeed");
            });
            JButton custom = new JButton("custom");
            custom.setBounds(30,200,115,20);
            custom.setVisible(true);
            custom.setText("Custom Spell");
            d.add(custom);
            custom.addActionListener(o -> {

                int p = (int) Double.parseDouble(JOptionPane.showInputDialog("What slot do you want to change?"));
                p = p - 1;
                dice[p] = (int) Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?"));
                u[p] = (int) Double.parseDouble(JOptionPane.showInputDialog("How many dice to roll?"));
                n[p] = (String) JOptionPane.showInputDialog("What is the name of the spell?");
                dndslot1.setText(n[0]);


            });
            //dndslot1 = new JButton("dndslot1");
            dndslot1.setBounds(200,200,70,20);
            dndslot1.setVisible(true);
            dndslot1.setText(n[0]);
            d.add(dndslot1);
            dndslot1.addActionListener(o -> {
                summa[0] = 0;
                if (dice[0] == 0){
                    df.setText("This slot is empty.");
                }
                else {
                    for (int i = 0; i < u[0]; i++) {
                        w[0] = (int) Math.floor(Math.random() * (dice[0] - 1 + 1) + 1);
                        summa[0] = w[0] + summa[0];
                    }
                    df.setText("Sum is " + summa[0]);
                }
            });






            d.add(df);
            d.setSize(400,450);
            d.setLayout(null);
            d.setVisible(true);
            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        });



        f.add(b);f.add(tf);
        f.setSize(400,450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
