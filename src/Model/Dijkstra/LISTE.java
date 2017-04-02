package Model.Dijkstra;


/**
 * Liste von Knoteninformationen mit speziellen Methoden.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */
class LISTE
{
    /* der Startknoten der Liste */
    private LISTENELEMENT anfang;
    
    /**
     * Legt eine leere Liste an.
     */
    LISTE ()
    {
        anfang = new ABSCHLUSS ();
    }
    
    /**
     * F&uuml;gt ein Datenelement vorn in die Liste ein.
     * @param daten Referenz auf die Einzuf&uuml;gende Knoteninformation
     */
    void Einfuegen (KNOTENINFO daten)
    {
        anfang = new KNOTEN (daten, anfang);
    }

    /**
     * Gibt die Knoteninformation des ersten Elements der Liste.
     * @return Knoteninformation
     */
    KNOTENINFO AnfangGeben ()
    {
        return anfang. AnfangGeben ();
    }
    
    /**
     * Sucht den Knnoten mit der angegebenen Nummer.
     * @param nummer Nummer des Knotens
     * @return Konoteninformation
     */
    KNOTENINFO KnotenSuchen (int nummer)
    {
        return anfang. KnotenSuchen (nummer);
    }
    
    /**
     * Sucht den Knnoten mit der kleinsten Wegl&auml;nge.
     * @return Knoteninformation
     */
    KNOTENINFO MinimumSuchen ()
    {
        return anfang. MinimumSuchen (null);
    }
    
    /**
     * L&ouml;scht den Knoten f&uuml;r das gegebene Datenelement
     * @param daten Datenelement, dess Knoten gel&ouml;scht werden soll
     */
    void KnotenEntfernen (KNOTENINFO daten)
    {
        anfang = anfang. KnotenEntfernen (daten);
    }
}
