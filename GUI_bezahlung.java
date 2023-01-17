import javax.swing.*;

public class GUI_bezahlung{
    public static void main (String[] args) {

        // create picture icons
        ImageIcon fuenfcentbild = new ImageIcon("5-cent.png");
        ImageIcon zehncentbild = new ImageIcon("10-cent.png");
        ImageIcon zwanzigcentbild = new ImageIcon("20-cent.png");
        ImageIcon fuenfzigcentbild = new ImageIcon("50-cent.png");
        ImageIcon eineurobild = new ImageIcon("1-euro.png");
        ImageIcon zweieurobild = new ImageIcon("2-euro.png");

        // create variablen fuer dynamische ausgabe
        double betraggezahlt=0.0;
        double betragzuzahlen=0.0;

        // create buttons
        JButton fuenfc = new JButton (fuenfcentbild);
        JButton zehnc = new JButton (zehncentbild);
        JButton zwanzigc = new JButton (zwanzigcentbild);
        JButton fuenfzig = new JButton (fuenfzigcentbild);
        JButton eins = new JButton (eineurobild);
        JButton zwei  = new JButton (zweieurobild);
        JButton fuenf = new JButton ("5,00");
        JButton zehn = new JButton ("10,00");
        JButton zwanzig = new JButton ("20,00");

        // create variable labels fuer dynamische ausgabe
        JLabel gezahlt = new JLabel();
        gezahlt.setText(String.valueOf(betraggezahlt));
        JLabel zuZahlen = new JLabel();
        zuZahlen.setText(String.valueOf(betragzuzahlen));

        // create other text labels
        JLabel bereitsGezahlt = new JLabel ("bereits gezahlt:");
        JLabel wirdGezahlt = new JLabel ("noch zu zahlen:");


        //set component bounds
        fuenfc.setBounds (290, 70, 60, 60);
        zehnc.setBounds (352, 70, 60, 60);
        zwanzigc.setBounds (414, 70, 60, 60);

        fuenfzig.setBounds (290, 132, 60, 60);
        eins.setBounds (352, 132, 60, 60);
        zwei.setBounds (414, 132, 60, 60);

        fuenf.setBounds (290, 194, 60, 60);
        zehn.setBounds (352, 194, 60, 60);
        zwanzig.setBounds (414, 194, 60, 60);

        //text
        //oben
        bereitsGezahlt.setBounds (60, 140, 100, 25);
        gezahlt.setBounds (170, 140, 70, 25); //dyn
        //unten
        wirdGezahlt.setBounds(60, 110, 100, 25); 
        zuZahlen.setBounds (170, 110, 70, 25); //dyn

        //init the frame
        JFrame frame = new JFrame ("Zahlung");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize(570, 380);
        frame.setResizable(false);
        frame.setVisible (true);

        //add components to output
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
        frame.add (bereitsGezahlt);
        frame.add (wirdGezahlt);

    }
}