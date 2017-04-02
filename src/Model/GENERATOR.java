package Model;


/**
 * Generiert zuf&auml;llige Bezeichner vom Typ String gegebener L&auml;nge.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12 
 * @version 1.0
 */

import java. util. Random;

class GENERATOR
{
    /* Der Zufallsgenerator */
    private Random zufall;
    /* Der Zeichenvorrat f&uuml;r die Bezeichner */
    private char [] zeichen = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    /* Die L&auml;nge der zu generierenden Bezeichner */
    private int laenge;

    /**
     * Initialisiert den Zufallsgenerattor.
     * @param laenge Die L&auml;nge der zu generierenden Bezeichner
     */
    GENERATOR (int laenge)
    {
        zufall = new Random ();
        this. laenge = laenge;
    }
    
    /**
     * erzeugt einen neuen Bezeichner.
     * @return der neue Bezeichner
     */
    String BezeichnerGenerieren ()
    {
        String resultat;
        resultat = "";
        for (int i = 1; i <= laenge; i++)
        {
            resultat = resultat + zeichen [zufall. nextInt (zeichen. length)];
        }
        return resultat;
    }
}
