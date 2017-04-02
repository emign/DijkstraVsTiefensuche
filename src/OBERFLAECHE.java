
/**
 * Die Bedienoberfl&auml;che f&uuml;r den Laufzeittest.
 * 
 * @author ISB-Arbeitskreis, Umsetzungshilfen Informatik 12 
 * @version 1.0
 */

import java. awt. *;
import java. awt. event. *;
import javax. swing. *;

class OBERFLAECHE implements OBERFLAECHENINTERFACE
{

    private JFrame fenster;
    private JTextField datenAnzahl;
    private JLabel anzahlTiefe;
    private JLabel anzahlDijkstra;
    private JCheckBox tiefeSuchen;
    private JCheckBox dijkstraSuchen;
    private JButton testen;
    private JButton beenden;
    private KONTROLLEURINTERFACE kontrolleur;
    
    /**
     * Legt die Oberfl&auml;chenelemente an und setzt den Kontrolleur.
     * @param kontrolleur der verwaltende Kontrolleur
     */
    OBERFLAECHE (KONTROLLEURINTERFACE kontrolleur)
    {
        this. kontrolleur = kontrolleur;
        FensterAufbauen ();
    }
    
    /**
     * F&uuml;hrt den Aufbau der Oberfl&auml;chenelemente durch.
     */
    private void FensterAufbauen ()
    {
        JPanel content;
        JPanel p;
        JLabel l;
        fenster = new JFrame ("Wegesuche in Graphen testen");
        content = (JPanel) fenster. getContentPane ();
        content. setLayout (new BorderLayout ());
        p = new JPanel ();
        content. add (p, BorderLayout. NORTH);
        p. setLayout (new GridLayout (4, 2));
        l = new JLabel ("Anzahl der Knoten im Graph");
        p. add (l);
        datenAnzahl = new JTextField ();
        p. add (datenAnzahl);
        l = new JLabel (" ");
        p. add (l);
        l = new JLabel (" ");
        p. add (l);
        l = new JLabel ("Knotenbesuchsanzahl f\u00FCr die Wegesuche durch Tiefensuche");
        p. add (l);
        anzahlTiefe = new JLabel ("---");
        p. add (anzahlTiefe);
        l = new JLabel ("Knotenbesuchsanzahl f\u00FCr Wegesuche nach Dijkstra");
        p. add (l);
        anzahlDijkstra = new JLabel ("---");
        p. add (anzahlDijkstra);
        
        p = new JPanel ();
        content. add (p, BorderLayout. SOUTH);
        p. setLayout (new FlowLayout ());
        tiefeSuchen = new JCheckBox ("Wegesuche mit Tiefensuche testen", true);
        p. add (tiefeSuchen);
        dijkstraSuchen = new JCheckBox ("Wegesuche nach Dijkstra testen", true);
        p. add (dijkstraSuchen);
        testen = new JButton ("Test ausf\u00FChren");
        p. add (testen);
        testen. addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e)
            {
                if (tiefeSuchen. isSelected () || dijkstraSuchen. isSelected ())
                {
                    try
                    {
                        kontrolleur. WegesucheAusfuehren (Integer. parseInt (datenAnzahl. getText ()), tiefeSuchen. isSelected (), dijkstraSuchen. isSelected ());
                    }
                    catch (Exception ex)
                    {
                        JOptionPane. showMessageDialog (fenster, "Bitte korrekte Zahlenwerte angeben.", "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane. showMessageDialog (fenster, "'Wegesuche mit Tiefensuche' oder 'Wegesuche nach Dijkstra testen' muss aktiviert sein.", "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        beenden = new JButton ("Beenden");
        p. add (beenden);
        beenden. addActionListener (new ActionListener ()
        {
            public void actionPerformed (ActionEvent e)
            {
                kontrolleur. BeendenAusfuehren ();
            }
        });
        
        fenster. setSize (new Dimension (800, 200));
        fenster. setMinimumSize (new Dimension (300, 200));
        fenster. setPreferredSize (new Dimension (800, 200));
        fenster. setVisible (true);        
    }
    
    /**
     * Tr&auml;gt die Suchzeit f&uuml;r Wegesuche durch Tiefensuche ein.
     * @param anzahl Anzahl der Knotenbesuche
     */
    public void TiefenSuchanzahlSetzen (String anzahl)
    {
        anzahlTiefe. setText (anzahl);
    }
    
    /**
     * Tr&auml;gt die Suchzeit f&uuml;r Wegesuche nach Dijkstra ein.
     * @param anzahl Anzahl der Knotenbesuche
     */
    public void DijkstraSuchanzahlSetzen (String anzahl)
    {
        anzahlDijkstra. setText (anzahl);
    }
}
