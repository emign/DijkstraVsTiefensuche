package Model.Dijkstra;


/**
 * Sucht im Graph nach dem Alorithmus von Dijkstra.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12 
 * @version 1.0
 */
public class DIJKSTRA
{
    /* Adjazenzmatrix des Graphen */
    private int [] [] matrix;
    /* Liste der abgearbeiteten Knoten */
    private LISTE fertig;
    /* Liste der unbearbeiteten Knoten */
    private LISTE rest;
    /* Liste der erreichten Knoten */
    private LISTE inarbeit;
    /* Anzahl der Knotenbesuche / Vergleiche */
    private static int anzahl;

    /**
     * Legt die Hilfsdaten an.
     * @param m Adjazenzmatrix 
     */
    public DIJKSTRA (int [] [] m)
    {
        matrix = m;
        fertig = new LISTE ();
        rest = new LISTE ();
        inarbeit = new LISTE ();
    }

    /**
     * F&uuml;hr die Suche aus.
     * @param von Startknoten
     * @param nach Zielknoten
     * @return Wegl&auml;nge
     */
    public int WegSuchen (int von, int nach)
    {
        int akt;
        int laenge;
        KNOTENINFO info;
        for (int i = 0; i < matrix. length; i++)
        {
            if (i == von)
            {
                fertig. Einfuegen (new KNOTENINFO (i));
            }
            else
            {
                rest. Einfuegen (new KNOTENINFO (i));
            }
        }
        akt = von;
        laenge = 0;
        info = null;
        anzahl = 0;
        while (akt != nach)
        {
            anzahl += 1;
            for (int i = 0; i < matrix. length; i++)
            {
                if (matrix [akt] [i] > 0)
                {
                    info = rest. KnotenSuchen (i);
                    if (info != null)
                    {
                        info. LaengeSetzen (laenge + matrix [akt] [i]);
                        rest. KnotenEntfernen (info);
                        inarbeit. Einfuegen (info);
                    }
                    else
                    {
                        info = inarbeit. KnotenSuchen (i);
                        if (info != null)
                        {
                            if (laenge + matrix [akt] [i] < info. LaengeGeben ())
                            {
                                info. LaengeSetzen (laenge + matrix [akt] [i]);
                            }
                        }
                    }
                }
            }
            info = inarbeit. MinimumSuchen ();
            inarbeit. KnotenEntfernen (info);
            fertig. Einfuegen (info);
            laenge = info. LaengeGeben ();
            akt = info. NummerGeben ();
        }
        return anzahl;
    }
    
    /**
     * Erh&ouml;ht den Z&auml;hler
     */
    static void ZaehlerErhoehen ()
    {
        anzahl += 1;
    }
}
