package Model.Dijkstra;


/**
 * Allgemeines Element der Knoteninfoliste.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */
abstract class LISTENELEMENT
{

    /**
     * Gibt die Knoteninformation des ersten Elements der Liste.
     * @return Knoteninformation
     */
    abstract KNOTENINFO AnfangGeben ();
    
    /**
     * Sucht den Knnoten mit der angegebenen Nummer.
     * @param nummer Nummer des Knotens
     * @return Konoteninformation
     */
    abstract KNOTENINFO KnotenSuchen (int nummer);
    
    /**
     * Sucht den Knnoten mit der kleinsten Wegl&auml;nge.
     * @param akt aktuelles Minimum
     * @return Konoteninformation
     */
    abstract KNOTENINFO MinimumSuchen (KNOTENINFO akt);
    
    /**
     * L&ouml;scht den Knoten f&uuml;r das gegebene Datenelement
     * @param daten Datenelement, dess Knoten gel&ouml;scht werden soll
     * @return (neuer) Nachfolger des Vorg&auml;ngers
     */
    abstract LISTENELEMENT KnotenEntfernen (KNOTENINFO daten);
    
}
