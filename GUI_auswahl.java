
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI_auswahl implements ActionListener {

    public int tmpzaehler;

    JFrame frame = new JFrame ("Ticketwahl");
    
    public JButton studi = new JButton ("Studierende");
    public JButton erw = new JButton ("Erwachsene");
    public JButton kind = new JButton ("Kind");
    public JButton senior = new JButton ("Senior:innen");
    public JLabel stufetext = new JLabel ("Bitte waehlen Sie eine Preisstufe:");

    GUI_auswahl(){
        
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible (true);
        frame.setSize (750, 290);
        frame.setLayout (null);

        //set component bounds + action listeners
        kind.setBounds (10, 75, 170, 135);
        kind.addActionListener(this);
        
        studi.setBounds (190, 75, 170, 135);
        studi.addActionListener(this);

        erw.setBounds (370, 75, 170, 135);
        erw.addActionListener(this);

        senior.setBounds (550, 75, 170, 135);
        senior.addActionListener(this);
        
        stufetext.setBounds (275, 40, 250, 20);

        //add components
        frame.add(kind);
        frame.add(studi);
        frame.add(erw);
        frame.add(senior);
        frame.add(stufetext);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==kind){
            GUI_bezahlung gui_bezahlung = new GUI_bezahlung();
            tmpzaehler = 0;
            frame.dispose();
        } 
        if (e.getSource()==erw){
            GUI_bezahlung gui_bezahlung = new GUI_bezahlung();
            tmpzaehler = 1;
            frame.dispose();
        } 
        if (e.getSource()==studi){
            GUI_bezahlung gui_bezahlung = new GUI_bezahlung();
            tmpzaehler = 2;
            frame.dispose();
        } 
        if (e.getSource()==senior){
            GUI_bezahlung gui_bezahlung = new GUI_bezahlung();
            tmpzaehler = 3;
            frame.dispose();
        } 
    }

}
