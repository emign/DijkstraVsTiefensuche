package Model.Dijkstra;


/**
 * Beschreibt das Abschlusselement der Liste.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */
class ABSCHLUSS extends LISTENELEMENT
{

    /**
     * Constructor for objects of class ABSCHLUSS
     */
    ABSCHLUSS ()
    {
        super ();
    }

    /**
     * Gibt die Knoteninformation des ersten Elements der Liste.
     * @return Knoteninformation
     */
    KNOTENINFO AnfangGeben ()
    {
        return null;
    }
    
    /**
     * Sucht den Knnoten mit der angegebenen Nummer.
     * @param nummer Nummer des Knotens
     * @return Konoteninformation
     */
    KNOTENINFO KnotenSuchen (int nummer)
    {
        return null;
    }
    
    /**
     * Sucht den Knnoten mit der kleinsten Wegl&auml;nge.
     * @param akt aktuelles Minimum
     * @return Konoteninformation
     */
    KNOTENINFO MinimumSuchen (KNOTENINFO akt)
    {
        return akt;
    }
        
    /**
     * L&ouml;scht den Knoten f&uuml;r das gegebene Datenelement
     * @param daten Datenelement, dess Knoten gel&ouml;scht werden soll
     * @return (neuer) Nachfolger des Vorg&auml;ngers
     */
    LISTENELEMENT KnotenEntfernen (KNOTENINFO daten)
    {
        return this;
    }
}
