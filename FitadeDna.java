
import java.util.Scanner;

/**
 *
 * @author Pamella
 *
 *
 * Se uma fita de DNA contendo a sequência TACGCATCGAGTTTCGGCACT for transcrita,
 * teremos qual das seguintes sequências?
 *
 *
 *
 * U com A (Uracila-RNA e Adenina-DNA), A com T (Adenina-RNA e Timina-DNA), C
 * com G (Citosina-RNA e Guanina-DNA) e G com C (Guanina-RNA e Citosina-DNA).
 *
 *
 */
public class FitadeDna {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        //declaração de variavel
        String U = "U = Uracila-RNA";
        String A = "A = Adenina-RNA";
        String C = "C = Citosina-RNA";
        String G = "G = Guanina-RNA";
        String T = "A = Adenina-RNA";
        String fita = "TACGCATCGAGTTTCGGCACT";

        //impressão da fita e os dna
        System.out.println("Sínteses protéicas: ");
        System.out.println("\nby " + U + "\nby " + A + "\nby " + C + "\nby " + G + "\nby " + T);

        System.out.println("Fita de DNA contendo a sequência TACGCATCGAGTTTCGGCACT");

        String dna[] = new String[21];
        for (int i = 0; i < 21; i++) {
            dna[i] = LER.next();

            if ("U".equals(dna[i])) {
                dna[i] = "A";
            } else if ("A".equals(dna[i])) {
                dna[i] = "T";
            } else if ("T".equals(dna[i])) {
                dna[i] = "A";
            } else if ("C".equals(dna[i])) {
                dna[i] = "G";

            } else if ("G".equals(dna[i])) {
                dna[i] = "C";
            }

        }
        for (int j = 0; j < 21; j++) {
            System.out.println(dna[j]);
        }
    }
}
