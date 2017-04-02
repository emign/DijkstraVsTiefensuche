package Model;


/**
 * Generiert den Graphen (Knotenfeld und Adjazenzmatrix).
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12 
 * @version 1.0
 */

import java. util. Random;

class GENERIEREN
{
    /* Maxoimale Entfernung zweier Knoten */
    private final static int maxEntfernung = 100;
    /* Adjazenzmatrix */
    private int [] [] matrix;
    /* Generator f�r die Knotenbezeichner */
    private GENERATOR gen;
    /* Zufallsgenerator f�r die Wegl�ngen */
    private Random zufall;

    /**
     * Legt die Felder an.
     * @param anzahl Anzahl der Knoten
     */
    GENERIEREN (int anzahl)
    {
        matrix = new int [anzahl] [anzahl];
        gen = new GENERATOR (10);
        zufall = new Random ();
    }
    
    /**
     * Generiert die Adjazenzmatrix.
     * Auf eine zweidimensionale Darstellbarkeit wird nicht geachtet.
     * Pre: anzahl << knotenanzahl!
     * @param anzahl Anzahl der zu generierenden Kanten;
     * @return Adjazenzmatrix
     */
    int [] [] AdjazenzmatrixGenerieren (int anzahl)
    {
        int von, nach, weg;
        for (int i = 0; i < matrix. length; i++)
        {
            for (int j = 0; j < matrix [i]. length; j++)
            {
                if (i == j)
                {
                    matrix [i] [j] = 0;
                }
                else
                {
                    matrix [i] [j] = -1;
                }
            }
            
        }
        for (int i = 0; i < anzahl; i++)
        {
            do
            {
                von = zufall. nextInt (matrix. length);
                nach = zufall. nextInt (matrix [0]. length);
            }
            while (matrix [von] [nach] >= 0);
            weg = zufall. nextInt (maxEntfernung);
            matrix [von] [nach] = weg;
            matrix [nach] [von] = weg;
        }
        return matrix;
    }
}
