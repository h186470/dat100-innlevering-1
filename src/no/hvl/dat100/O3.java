package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		// Leser inn et heltall n > 0 ved hjelp av en dialogboks
        String input = showInputDialog("Skriv inn et heltall n (n > 0):");

        // Sjekker om input er et gyldig heltall
        if (input != null && input.matches("\\d+")) {
            int n = Integer.parseInt(input);

            if (n <= 0) {
                showMessageDialog(null, "Vennligst skriv inn et heltall større enn 0.");
            } else {
                // Beregner verdien av n!
                int denFaktorielle = 1;
                for (int i = 1; i <= n; i++) {
                    denFaktorielle *= i;
                }

                // Viser verdien av n! i en dialogboks
                showMessageDialog(null, "Verdien av " + n + "! er: " + denFaktorielle);
            }
        } else {
            // Viser en feilmelding hvis input ikke er et gyldig heltall
            showMessageDialog(null, "Ugyldig input. Vennligst skriv inn et positivt heltall.");
        }

	}

}
