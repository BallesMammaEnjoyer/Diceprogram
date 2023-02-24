package proto;

import javax.swing.*;
class main {
    public static void main(String[] args) {
        final int[] roll = new int[1];
        final int[] slot = new int[1];
        final int[] k1 = new int[1];
        final int[] k2= new int[1];
        final int[] k3 = new int[1];
        final int[] k4 = new int[1];
        final int[] k5 = new int[1];
        final int[] k6 = new int[1];
        final int[] k7 = new int[1];
        final int[] k8 = new int[1];
        final int[] F = new int[1];
        final int[] F1 = new int[1];
        final int[] F2 = new int[1];
        final int[] F3 = new int[1];
        final int[] F4 = new int[1];
        final int[] F5 = new int[1];
        final int[] F6 = new int[1];
        final int[] F7 = new int[1];
        final int[] F8 = new int[1];



        JFrame f = new JFrame("Dice Roller");
        final JTextField tf = new JTextField();
        tf.setBounds(100, 50, 200, 40);
        JButton b = new JButton("D4");
        b.setBounds(140, 100, 60, 20);

        b.addActionListener(e -> {
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
            slot[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("What slot do you want to change?(1-8)"));
            if (slot[0] == 1){
                k1[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 2){
                k2[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 3){
                k3[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 4){
                k4[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 5){
                k5[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 6){
                k6[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 7){
                k7[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }
            if (slot[0] == 8){
                k8[0] = (int) Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How many sides on your dice?")));
            }



        });
        JButton slot1 = new JButton("slot2");
        slot1.setBounds(80,200,70,20);
        slot1.setVisible(true);
        slot1.setText("Slot 1");
        f.add(slot1);
        slot1.addActionListener(e -> {
            if (k1[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k1[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot2 = new JButton("slot2");
        slot2.setBounds(140,200,70,20);
        slot2.setVisible(true);
        slot2.setText("Slot 2");
        f.add(slot2);
        slot2.addActionListener(e -> {
            if (k2[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k2[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot3 = new JButton("slot3");
        slot3.setBounds(200,200,70,20);
        slot3.setVisible(true);
        slot3.setText("Slot 3");
        f.add(slot3);
        slot3.addActionListener(e -> {
            if (k3[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k3[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot4 = new JButton("slot4");
        slot4.setBounds(260,200,70,20);
        slot4.setVisible(true);
        slot4.setText("Slot 4");
        f.add(slot4);
        slot4.addActionListener(e -> {
            if (k4[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k4[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot5 = new JButton("slot6");
        slot5.setBounds(80,250,70,20);
        slot5.setVisible(true);
        slot5.setText("Slot 5");
        f.add(slot5);
        slot5.addActionListener(e -> {
            if (k5[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k5[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slot6 = new JButton("slot6");
        slot6.setBounds(140,250,70,20);
        slot6.setVisible(true);
        slot6.setText("Slot 6");
        f.add(slot6);
        slot6.addActionListener(e -> {
            if (k6[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k6[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }
        });
        JButton slot7 = new JButton("slot7");
        slot7.setBounds(200,250,70,20);
        slot7.setVisible(true);
        if (k7[0] == 0){
            slot7.setText("Slot 7");}
        f.add(slot7);
        slot7.addActionListener(e -> {
            if (k7[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k7[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }
        });
        JButton slot8 = new JButton("Slot8");
        slot8.setBounds(260,250,70,20);
        slot8.setVisible(true);
        slot8.setText("Slot 8");
        f.add(slot8);
        slot8.addActionListener(e -> {
            if (k8[0]==0){
                tf.setText("This slot is empty");
            }
            else {
                roll[0] = (int) Math.floor(Math.random() * (k8[0] - 1 + 1) + 1);
                tf.setText("You rolled a " + roll[0]);
            }

        });
        JButton slotcheck = new JButton("slotcheck");
        slotcheck.setBounds(80,300,110,20);
        slotcheck.setVisible(true);
        slotcheck.setText("Slot checker");
        f.add(slotcheck);
        slotcheck.addActionListener(e -> {

            slot[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("What slot do you want to check?(1-8)"));

            if (slot[0] == 1){
                if (k1[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k1[0]);
                }
            }
            if (slot[0] == 2){
                if (k2[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k2[0]);
                }
            }
            if (slot[0] == 3){
                if (k3[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k3[0]);
                }
            }
            if (slot[0] == 4){
                if (k4[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k4[0]);
                }
            }
            if (slot[0] == 5){
                if (k5[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k5[0]);
                }
            }
            if (slot[0] == 6){
                if (k6[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k6[0]);
                }
            }
            if (slot[0] == 7){
                if (k7[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k7[0]);
                }
            }
            if (slot[0] == 8){
                if (k8[0]==0){
                    tf.setText("This slot is empty");
                }
                else {
                    tf.setText("This slot is a D" + k8[0]);
                }
            }



        });
        JButton DnDSpells = new JButton("DNDSPELLS");
        DnDSpells.setBounds(180,350,130,20);
        DnDSpells.setVisible(true);
        DnDSpells.setText("DnD Spells");
        f.add(DnDSpells);
        DnDSpells.addActionListener(e -> {
            JFrame d = new JFrame("DnD Spells");
            final JTextField df = new JTextField();
            df.setBounds(100, 50, 200, 40);
            JButton m = new JButton("D4");
            m.setBounds(140, 100, 60, 20);

            m.addActionListener(o -> {
                roll[0] = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
                df.setText("You rolled a " + roll[0]);


            });
            JButton Fireball = new JButton("Fireball");
            Fireball.setBounds(80,350,100,20);
            Fireball.setVisible(true);
            Fireball.setText("Fireball");
            d.add(Fireball);
            Fireball.addActionListener(o -> {
                F1[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F2[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F3[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F4[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F5[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F6[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F7[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F8[0] = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                F[0] = (F1[0] + F2[0] + F3[0] + F4[0] + F5[0] + F6[0] + F7[0] + F8[0]);

                df.setText("Damage is " + F[0]);
            });
            d.add(m);d.add(df);
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
