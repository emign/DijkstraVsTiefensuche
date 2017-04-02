
/**
 * Hauptklasse des Programms.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12
 * @version 1.0
 */
class WEGESUCHETESTEN
{

    /**
     * Legt die Ausgangsobjekte an.
     * Kann nur &uuml;ber die Startmethode verwendet werden.
     */
    private WEGESUCHETESTEN ()
    {
        KONTROLLEUR k;
        OBERFLAECHE o;
        k = new KONTROLLEUR ();
        o = new OBERFLAECHE (k);
        k. OberflaecheSetzen (o);
    }
    
    /**
     * Startmethode, erzeugt ein Objekt dieser Klasse.
     * @param args eventuelle Kommandozeilenargumente (nicht ben&ouml;tigt)
     */
    public static void main (String [] args)
    {
        new WEGESUCHETESTEN ();
    }
}
