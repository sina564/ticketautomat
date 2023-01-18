import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI_bezahlung implements ActionListener {

    float i;

    //init the frame
    JFrame frame = new JFrame ("Zahlung");

    // create picture icons
    ImageIcon fuenfcentbild = new ImageIcon("5-cent.png");
    ImageIcon zehncentbild = new ImageIcon("10-cent.png");
    ImageIcon zwanzigcentbild = new ImageIcon("20-cent.png");
    ImageIcon fuenfzigcentbild = new ImageIcon("50-cent.png");
    ImageIcon eineurobild = new ImageIcon("1-euro.png");
    ImageIcon zweieurobild = new ImageIcon("2-euro.png");
    ImageIcon fuenfeurobild = new ImageIcon("5-euro.jpg");
    ImageIcon zehneurobild = new ImageIcon("10-euro.jpg");
    ImageIcon zwanzigeurobild = new ImageIcon("20-euro.jpg");

    // create variablen fuer dynamische ausgabe
    float betraggezahlt=0.00f;
    float betragzuzahlen=0.00f;

    // create buttons
    JButton fuenfc = new JButton (fuenfcentbild);
    JButton zehnc = new JButton (zehncentbild);
    JButton zwanzigc = new JButton (zwanzigcentbild);
    JButton fuenfzig = new JButton (fuenfzigcentbild);
    JButton eins = new JButton (eineurobild);
    JButton zwei  = new JButton (zweieurobild);
    JButton fuenf = new JButton (fuenfeurobild);
    JButton zehn = new JButton (zehneurobild);
    JButton zwanzig = new JButton (zwanzigeurobild);
    JLabel gezahlt = new JLabel();
    JLabel zuZahlen = new JLabel();
    JLabel bereitsGezahlt = new JLabel ("bereits gezahlt:");
    JLabel wirdGezahlt = new JLabel ("noch zu zahlen:");

    
    GUI_bezahlung(){

        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize(570, 380);
        frame.setResizable(true);
        frame.setVisible (true);
        frame.setLayout (null);
    
        //add components to output
        frame.add (bereitsGezahlt);
        frame.add (wirdGezahlt);
        frame.add (fuenfc);
        frame.add (zehnc);
        frame.add (zwanzigc);
        frame.add (fuenfzig);
        frame.add (eins);
        frame.add (zwei);
        frame.add (fuenf);
        frame.add (zehn);
        frame.add (zwanzig);
        frame.add (gezahlt);
        frame.add (zuZahlen);
        
        gezahlt.setText("0.00 €");
        zuZahlen.setText("0.00 €");

        //set component bounds
        bereitsGezahlt.setBounds (60, 140, 100, 25);
        gezahlt.setBounds (170, 140, 55, 25); //dyn
        wirdGezahlt.setBounds(60, 110, 100, 25); 
        zuZahlen.setBounds (170, 110, 55, 25); //dyn

        fuenfc.setBounds (290, 70, 60, 60);
        fuenfc.addActionListener(this);
        zehnc.setBounds (352, 70, 60, 60);
        zehnc.addActionListener(this);
        zwanzigc.setBounds (414, 70, 60, 60);
        zwanzigc.addActionListener(this);

        fuenfzig.setBounds (290, 132, 60, 60);
        fuenfzig.addActionListener(this);
        eins.setBounds (352, 132, 60, 60);
        eins.addActionListener(this);
        zwei.setBounds (414, 132, 60, 60);
        zwei.addActionListener(this);

        fuenf.setBounds (290, 194, 60, 60);
        fuenf.addActionListener(this);
        zehn.setBounds (352, 194, 60, 60);
        zehn.addActionListener(this);
        zwanzig.setBounds (414, 194, 60, 60);
        zwanzig.addActionListener(this);
    }

    
    /* 
    // switch tmpzaehler !!!!
    switch (tmpzaehler){
    case 1: betragzuzahlen=3f;
        break;
    case 1, 3:
        betragzuzahlen=4f;
        break;
    case 2:
        betragzuzahlen=5f;
        break;
    default:
        System.out.println("Error: Kein Zaehler!");
        frame.dispose();
        break;
    } */

    // Zahlsystem
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==fuenfc){
        i=0.05f;
            
        } 
        if (e.getSource()==zehnc){
            i=0.10f;
        }
        if (e.getSource()==zwanzigc){
            i=0.20f;
        } 
        if (e.getSource()==fuenfzig){
            i=0.50f;
        } 
        if (e.getSource()==eins){
            i=1f;
        } 
        if (e.getSource()==zwei){
            i=2f;
        } 
        if (e.getSource()==fuenf){
            i=5f;
        } 
        if (e.getSource()==zehn){
            i=10f;
        }
        if (e.getSource()==zwanzig){
            i=20f;
        }

        betraggezahlt=betraggezahlt+i;
        betragzuzahlen=betragzuzahlen-i;
        gezahlt.setText(String.valueOf(String.format("%.2f", betraggezahlt))+" €");
        zuZahlen.setText(String.valueOf(String.format("%.2f", betragzuzahlen))+" €");

    }

}