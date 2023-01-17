//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import javax.swing.*;

public class GUI_auswahl extends JPanel {
    private JButton studi;
    private JButton erw;
    private JButton kind;
    private JButton senior;
    private JLabel stufetext;

    public GUI_auswahl() {
        studi = new JButton ("Studierende");
        erw = new JButton ("Erwachsene");
        kind = new JButton ("Kind");
        senior = new JButton ("Senior:innen");
        stufetext = new JLabel ("Bitte waehlen Sie eine Preisstufe:");

        //adjust size and set layout
        setPreferredSize (new Dimension (750, 290));
        setLayout (null);

        //add components
        add (studi);
        add (erw);
        add (kind);
        add (senior);
        add (stufetext);

        //set component bounds (only needed by Absolute Positioning)
        studi.setBounds (190, 75, 170, 135);
        erw.setBounds (370, 75, 170, 135);
        kind.setBounds (10, 75, 170, 135);
        senior.setBounds (550, 75, 170, 135);
        stufetext.setBounds (275, 40, 250, 20);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Ticketwahl");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI_auswahl());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible (true);
    }
}
