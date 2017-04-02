package Model;


/**
 * F&uuml;hrt die gew&uuml;nschten Laufzeittests durch.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */

import java. util. Random;
import Model. Dijkstra. DIJKSTRA;

public class TESTSUCHEN
{
    /* Anzahl der Datenelemente im Graphen */
    private int anzahl;
    /* Die Knotenbesuchsanzahlen */
    private int anzahl1, anzahl2;
    /* Die Adjazenzmatrix */
    private int [] [] matrix;
    /* Startort */
    private int start;
    /* Zielort */
    private int ziel;

    /**
     * Legt die ben&ouml;tigten Objekte an und besetzt die Attributwerte.
     * @param anzahl Anzahl der zu sortierenden Datenelemente
     */
    public TESTSUCHEN (int anzahl)
    {
        this. anzahl = anzahl;
        matrix = new GENERIEREN (anzahl). AdjazenzmatrixGenerieren ((anzahl - 1) * 2);
    }
    
    /**
     * Bestimmt die durschnittlichen Knotenbesuche.
     * @param tiefe gibt an, ob mit Tiefensuche gesucht werden soll
     * @param dijkstra gibt an, ob nach Dikstra gesucht werden soll
     */
    public void DurchschnittsTest (boolean tiefe, boolean dijkstra)
    {
        Random zufall;
        zufall = new Random ();
        anzahl1 = 0;
        anzahl2 = 0;
        for (int i = 0; i < 10; i++)
        {
            start = zufall. nextInt (anzahl);
            do
            {
                ziel = zufall. nextInt (anzahl);
            }
            while (start == ziel);
            if (tiefe)
            {
                TIEFENSUCHE t;
                t = new TIEFENSUCHE (matrix);
                anzahl1 += t. WegSuchen (this. start, this. ziel);
            }
            if (dijkstra)
            {
                DIJKSTRA t;
                t = new DIJKSTRA (matrix);
                anzahl2 += t. WegSuchen (this. start, this. ziel);
            }
        }
        anzahl1 /= 10;
        anzahl2 /= 10;
    }
    
    /**
     * Meldet die durchschnittliche Anzahl der Knotenbesuche f&uuml;r die Tiefensuche.
     * @return Suchzeit
     */
    public long AnzahlFuerTiefensucheGeben ()
    {
        return anzahl1;
    }
    
    /**
     * Meldet die durchschnittliche Anzahl der Knotenbesuche f&uuml;r die Suche nach Dijkstra.
     * @return Suchzeit
     */
    public long AnzahlFuerDijkstraGeben ()
    {
        return anzahl2;
    }
}
