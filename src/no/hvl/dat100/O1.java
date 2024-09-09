package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
        String bruttoInntektS = showInputDialog("Hva er din bruttoinntekt?");
        double bruttoinntekt = Double.parseDouble(bruttoInntektS);
        
        // Trinnskatten inntektsnivåer
        double trinn0I = 208050;
        double trinn1I = 292850;
        double trinn2I = 670000;
        double trinn3I = 937900;
        double trinn4I = 1350000;
        
        // Trinnskatten prosentsatser omgjort til desimaler
        double trinn1P = 0.017;
        double trinn2P = 0.040;
        double trinn3P = 0.136;
        double trinn4P = 0.166;
        double trinn5P = 0.176;
        
        double skatteTrekk = 0;

        if (bruttoinntekt > trinn4I) {
            skatteTrekk += (bruttoinntekt - trinn4I) * trinn5P;
            bruttoinntekt = trinn4I;
        }
        if (bruttoinntekt > trinn3I) {
            skatteTrekk += (bruttoinntekt - trinn3I) * trinn4P;
            bruttoinntekt = trinn3I;
        }
        if (bruttoinntekt > trinn2I) {
            skatteTrekk += (bruttoinntekt - trinn2I) * trinn3P;
            bruttoinntekt = trinn2I;
        }
        if (bruttoinntekt > trinn1I) {
            skatteTrekk += (bruttoinntekt - trinn1I) * trinn2P;
            bruttoinntekt = trinn1I;
        }
        if (bruttoinntekt > trinn0I) {
            skatteTrekk += (bruttoinntekt - trinn0I) * trinn1P;
        }

        showMessageDialog(null, "Ditt trinntrekk er: " + skatteTrekk);
    }

}
