
/**
 * Schnittstelle der Oberfl&auml;che f&uuml;r den Kontrolleur.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */

interface OBERFLAECHENINTERFACE
{

    /**
     * Tr&auml;gt die Suchzeit f&uuml;r Wegesuche durch Tiefensuche ein.
     * @param anzahl Anzahl der Knotenbesuche
     */
    void TiefenSuchanzahlSetzen (String anzahl);
    
    /**
     * Tr&auml;gt die Suchzeit f&uuml;r Wegesuche nach Dijkstra ein.
     * @param anzahl Anzahl der Knotenbesuche
     */
    void DijkstraSuchanzahlSetzen (String anzahl);
}
