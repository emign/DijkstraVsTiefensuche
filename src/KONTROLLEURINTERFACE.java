
/**
 * Schnittstelle des Kontrolleurs f&uuml;r die Oberfl&auml;che.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */

interface KONTROLLEURINTERFACE
{

    /**
     * Ausf&uuml;hren der Laufzeitmessungen.
     * @param anzahlElemente Anzahl der Knoten im Graphen
     * @param tiefe gibt an, ob mit Tiefensuche gesucht werden soll
     * @param dijkstra gibt an, ob nach Dijkstra gesucht werden soll
     */
    void WegesucheAusfuehren (int anzahlElement, boolean tiefe, boolean dijkstra);
    
    /**
     * Beendet das Programm.
     */
    void BeendenAusfuehren ();

}
