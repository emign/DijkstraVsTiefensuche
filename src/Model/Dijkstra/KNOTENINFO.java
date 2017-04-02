package Model.Dijkstra;


/**
 * Knoteninformation f&uuml;r Dijkstra-Algorithmus.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12 
 * @version 1.0
 */
class KNOTENINFO
{
    /* Knotennummer */
    int nummer;
    /* Vorg&auml;ngerknoten für Wegangabe */
    private int vorgaenger;
    /* Wegl&auml;nge bis zu diesem Knoten */
    private int laenge;

    /**
     * Belegt die Attribute vor.
     * @param n Nummer des Knotens
     */
    KNOTENINFO (int n)
    {
        nummer = n;
        vorgaenger = -1;
        laenge = 0;
    }
    
    /**
     * Meldet die Nummer des Knotens.
     * @return Knotennummer
     */
    int NummerGeben ()
    {
        return nummer;
    }
    
    /**
     * Setzt den Vorg&auml;ngerknoten.
     * @param vorgNeu neuer Vorg&auml;nger
     */
    void VorgaengerSetzen (int vorgNeu)
    {
        vorgaenger = vorgNeu;
    }
    
    /**
     * Meldet den Vorg&auml;ngerknoten.
     * @return der Vorg&auml;nger
     */
    int VorgaengerGeben ()
    {
        return vorgaenger;
    }
    
    /**
     * Setzt die Wegl&auml;nge.
     * @param laengeNeu neue Wegl&auml;nge
     */
    void LaengeSetzen (int laengeNeu)
    {
        laenge = laengeNeu;
    }
    
    /**
     * Meldet die Wegl&auml;nge.
     * @return die Wegl&auml;nge
     */
    int LaengeGeben ()
    {
        return laenge;
    }
    
    /**
     * Vergleicht die angegebene Nummer mit der Nummer des Knotens.
     * @param nummer Vergleichsnummer
     * @return true, wenn der Knoten die angegebene Nummer hat
     */
    boolean IstKnoten (int nummer)
    {
        return this. nummer == nummer;
    }
    
    /**
     * Vergleicht die L&auml;nge mit einem anderen Knoten.
     * @return true, wenn die eigene L&aumml;nge kleiner ist als die des Vergleichsknotens
     */
    boolean IstKleiner (KNOTENINFO k)
    {
        return laenge < k. laenge;
    }
}
