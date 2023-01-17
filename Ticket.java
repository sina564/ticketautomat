
/**
 * Beschreiben Sie hier die Klasse Ticket.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ticket
{
    private String name;
    private Preisstufe zone;
    private double preis;
    
    public Ticket (String name, Preisstufe zone, double preis)
    {
        this.name = name;
        this.zone = zone;
        this.preis = preis;
    }
    
    //get
    public String getName()
    {
        return name;
    }
    
    public Preisstufe getPreisstufe()
    {
        return zone;
    }
    
    public double getPreis()
    {
        return preis;
    }
    
    //set
    public void setName(String neuerName)
    {
        name = neuerName;
    }
    
    public void setPreisstufe(Preisstufe p)
    {
        zone = p;
    }
    
    public void setPreis(double neuerPreis)
    {
        preis=neuerPreis;
    }
}
