package Model;


/**
 * Sucht im gegeben Graph mittels wiederholter Tiefensuche nach dem k&uuml;rzersten Weg..
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */
class TIEFENSUCHE
{
    /* Adjazenzmatrix des Graphen */
    int [] [] matrix;
    /* Merker f&uuml;r die besuchten Knoten */
    boolean [] besucht;
    /* L&auml;nge des (bisher gefundenen) k&uuml;rzesten Wegs */
    int laenge;
    /* Anzahl der Knotenbesuche */
    int anzahl;
    
    /**
     * Legt die Hilfsdaten an.
     * @param m Adjazenzmatrix 
     */
    TIEFENSUCHE (int [] [] m)
    {
        matrix = m;
        besucht = new boolean [m. length];
        for (int i = 0; i < besucht. length; i++)
        {
            besucht [i] = false;
        }
        laenge = Integer. MAX_VALUE;
    }
    
    /**
     * F&uuml;hr die Suche aus.
     * @param von Startknoten
     * @param nach Zielknoten
     * @return Wegl&auml;nge
     */
    int WegSuchen (int von, int nach)
    {
        anzahl = 0;
        Suchen (von, nach, 0);
        return anzahl;
    }
    
    /**
     * Rekursive Durchf&uuml;hrung der Suche.
     * @param akt aktueller Knoten
     * @param nach Zielknoten
     * @param laenge L&auml;nge des aktuellen Wegs
     */
    private void Suchen (int akt, int nach, int laenge)
    {
        anzahl += 1;
        besucht [akt] = true;
        if (akt == nach)
        {
            if (laenge < this. laenge)
            {
                this. laenge = laenge;
            }
        }
        else
        {
            for (int i = 0; i < matrix. length; i++)
            {
                if ((i != akt) && (matrix [akt] [i] > 0) && (! besucht [i]))
                {
                    Suchen (i, nach, laenge + matrix [akt] [i]);
                }
            }
        }
        besucht [akt] = false;
    }
}
