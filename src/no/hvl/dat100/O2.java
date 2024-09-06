package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
		String antallEleverS = showInputDialog("Hvor mange elever skal graderes?");
		int antallElever = Integer.parseInt(antallEleverS);

		for (int i = 0; i < antallElever; i++) {
			String innlestSumS = showInputDialog("Hvor mange poeng fikk eleven?");
			int innlestSum = Integer.parseInt(innlestSumS);
			int h = 100;
			int l = 0;

			if (innlestSum < l || innlestSum > h) {
				showMessageDialog(null, "Ugyldig verdi, poengsum er mellom 0 og 100.");
				i--;
				innlestSum = -1;
			}
			String karakter;

			if (innlestSum <= 39 && innlestSum > l) {
				karakter = "F";
				showMessageDialog(null, "Eleven har fått karakteren " + karakter + " med " + innlestSum + " poeng.");
			} else if (innlestSum <= 49 && innlestSum > 39) {
				karakter = "E";
				showMessageDialog(null, "Eleven har fått karakteren " + karakter + " med " + innlestSum + " poeng.");
			} else if (innlestSum <= 59 && innlestSum > 49) {
				karakter = "D";
				showMessageDialog(null, "Eleven har fått karakteren " + karakter + " med " + innlestSum + " poeng.");
			} else if (innlestSum <= 79 && innlestSum > 59) {
				karakter = "C";
				showMessageDialog(null, "Eleven har fått karakteren " + karakter + " med " + innlestSum + " poeng.");
			} else if (innlestSum <= 80 && innlestSum > 79) {
				karakter = "B";
				showMessageDialog(null, "Eleven har fått karakteren " + karakter + " med " + innlestSum + " poeng.");
			} else if (innlestSum <= h && innlestSum > 89) {
				karakter = "A";
				showMessageDialog(null, "Eleven har fått karakteren " + karakter + " med " + innlestSum + " poeng.");
			} else if (innlestSum == -1) {
				showMessageDialog(null, "Tast inn poengsum på nytt");
			}
		}

	}

}
