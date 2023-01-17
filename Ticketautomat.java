public class Ticketautomat 
{
    // Der Preis eines Tickets dieses Automaten.
    private Ticket aktTicket;
    // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
    private double bisherGezahlt;
    // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
    private double gesamtsumme;

    /**
     * Erzeuge eine Maschine, die TickEts zum angegebenen Preis
     * (in Euro) ausgibt.
     * Zu beachten: Der Preis muss gr��er als null sein,
     * der Automat �berpr�ft dies jedoch nicht.
     */
    public Ticketautomat()
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
    
    /**
     * Liefere den Preis eines Tickets dieses Automaten (in Cent).
     */
    public double gibPreis()
    {
        return aktTicket.getPreis();
    }

    /**
     * Liefere die H�he des Betrags, der f�r das n�chste Ticket bereits
     * eingeworfen wurde.
     */
    public double gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }

    /**
     * Nimm den angegebenen Betrag als Anzahlung f�r das
     * n�chste Ticket.
     */
    public void geldEinwerfen(double betrag)
    {
        if (betrag >= 0.0)
        {
            bisherGezahlt = bisherGezahlt + betrag;
        }
    }

    /**
     * Drucke ein Ticket.
     * Aktualisiere die eingenommene Gesamtsumme und setze den gezahlten
     * Betrag auf null.
     */
    public void ticketDrucken()
    {
        if (bisherGezahlt >= aktTicket.getPreis())
        {
            // Den Ausdruck eines Tickets simulieren.
            System.out.println("##################");
            System.out.println("# Die BlueJ-Linie");
            System.out.println("# Ticket :" + aktTicket.getName());
            System.out.println("# Preisstufe :" + aktTicket.getPreisstufe());
            System.out.println("# " + aktTicket.getPreis() + " �.");
            System.out.println("##################");
            System.out.println();

            // Die Gesamtsumme mit dem eingezahlten Betrag aktualisieren.
            gesamtsumme = gesamtsumme + bisherGezahlt;
            // Die bisherige Bezahlung zur�cksetzen.
            String tmp = (bisherGezahlt-aktTicket.getPreis())> 0.0 ? "R�ckgeld : " + (bisherGezahlt-aktTicket.getPreis()): "";
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
            String tmp = (bisherGezahlt)> 0.0 ? "R�ckgeld : " + String.format("%.2f",bisherGezahlt): "";
            System.out.println (tmp);
            bisherGezahlt = 0.00;
    }
}
