import java.util.ArrayList;

public class Ticketautomat 
{
    private Ticket aktTicket; // Der Preis eines Tickets dieses Automaten.
    private double bisherGezahlt; // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
    private double gesamtsumme; // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
    ArrayList<Ticket> warenkorb = new ArrayList<Ticket>(); //Warenkorb
    
    public Ticketautomat() //Preis in Euro ausgeben
    {
        bisherGezahlt = 0.00;
        gesamtsumme = 0.00;
        aktTicket = new Ticket ("Einzelticket", Preisstufe.KINDER, 3.00);
    }
    
    public void Ticketauswahl(String name, Preisstufe p, double preis)
    {
        aktTicket = new Ticket(name, p, preis);
        bisherGezahlt = 0.00;
        gesamtsumme = 0.00;
    }
    
    public double gibPreis()
    {
        return aktTicket.getPreis();
    }

    public double gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }

    public void geldEinwerfen(double betrag)
    {
        if (betrag >= 0.0)
        {
            bisherGezahlt = bisherGezahlt + betrag;
        }
    }

    public void ticketDrucken()
    {
        if (bisherGezahlt >= aktTicket.getPreis())
        {
            // Den Ausdruck eines Tickets simulieren.
            System.out.println("##################");
            System.out.println("# Die BlueJ-Linie");
            System.out.println("# Ticket :" + aktTicket.getName());
            System.out.println("# Preisstufe :" + aktTicket.getPreisstufe());
            System.out.println("# " + aktTicket.getPreis() + " Euro.");
            System.out.println("##################");
            System.out.println();

            // Die Gesamtsumme mit dem eingezahlten Betrag aktualisieren.
            gesamtsumme = gesamtsumme + bisherGezahlt;
            // Die bisherige Bezahlung zuruecksetzen.
            String tmp = (bisherGezahlt-aktTicket.getPreis())> 0.0 ? "Rueckgeld : " + (bisherGezahlt-aktTicket.getPreis()): "";
            System.out.println (tmp);
            bisherGezahlt = 0.00;
        }
        else
        {
            double nochZuZahlen = aktTicket.getPreis() - bisherGezahlt;   
            System.out.println("Noch zu zahlen : " + nochZuZahlen);
        }
    }
    
    public void vorgangAbbrechen()
    {
            String tmp = (bisherGezahlt)> 0.0 ? "Rueckgeld : " + String.format("%.2f",bisherGezahlt): "";
            System.out.println (tmp);
            bisherGezahlt = 0.00;
    }
}
