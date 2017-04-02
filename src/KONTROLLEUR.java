
/**
 * Kontrolleur des Programms.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */
class KONTROLLEUR implements KONTROLLEURINTERFACE
{

    /* Die ereigniserzeugende Oberfl&auml;che */
    private OBERFLAECHENINTERFACE oberflaeche;
    
    /**
     * Besetzt das Attribut vor.
     */
    KONTROLLEUR ()
    {
        oberflaeche = null;
    }

    /**
     * Setzt die Oberfl&auml;che.
     * @param o die ereigniserzeugende Oberfl&auml;che
     */
    void OberflaecheSetzen (OBERFLAECHENINTERFACE o)
    {
        oberflaeche = o;
    }

    /**
     * Ausf&uuml;hren der Laufzeitmessungen.
     * @param anzahlElemente Anzahl der Knoten im Graphen
     * @param tiefe gibt an, ob mit Tiefensuche gesucht werden soll
     * @param dijkstra gibt an, ob nach Dijkstra gesucht werden soll
     */
    public void WegesucheAusfuehren (int anzahlElemente, boolean tiefe, boolean dijkstra)
    {
        Model. TESTSUCHEN test;
        oberflaeche. TiefenSuchanzahlSetzen ("---");
        oberflaeche. DijkstraSuchanzahlSetzen ("---");
        test = new Model. TESTSUCHEN (anzahlElemente);
        test. DurchschnittsTest (tiefe, dijkstra);
        if (tiefe)
        {
            oberflaeche. TiefenSuchanzahlSetzen ("" + test. AnzahlFuerTiefensucheGeben ());
        }
        if (dijkstra)
        {
            oberflaeche. DijkstraSuchanzahlSetzen ("" + test. AnzahlFuerDijkstraGeben ());
        }
        
    }
    
    /**
     * Beendet das Programm.
     */
    public void BeendenAusfuehren ()
    {
        System. exit (0);
    }
}
