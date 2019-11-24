package testEnToutGenre;

import java.util.Scanner;
import java.util.regex.*;
import java.io.IOException;;

public class TestVerifEntreeUtilisateur {

	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez entrer le nombre de chiffres pr�sent dans le code.");
		int nombreEntreeTab = sc.nextInt(); // Attribue � nombreEntreeTab la valeur entr�e pr�c�demment sous la forme d'un int
		int CodeInt[] = new int[nombreEntreeTab]; // Cr�e un tableau d'int
		String Prop[] = new String[CodeInt.length]; // Cr�e un tableau de String
		String Code[] = new String[CodeInt.length]; // Cr�e un tableau de String
		String Solution[] = new String[CodeInt.length]; // Cr�e un tableau de String

		for (int i = 0; i < CodeInt.length; i++) { // cr�e une boucle attribuant � Code[] une valeur al�atoire � chaque
													// entr�e
			double X = Math.round((-0.5) + Math.random() * 10);
			CodeInt[i] = (int) X;
			System.out.print(CodeInt[i] + " ");
			if (i == CodeInt.length - 1) {
				System.out.println("\n-----------------------------------------"); // permet un affichage plus propre du
																					// code
			}
		}

		boolean b = false;
		for (int i = 0; i < CodeInt.length; i++) {
			int j = 4;

			Code[i] = String.valueOf(CodeInt[i]); // convertit les entr�es de Code[i] en String pour utilisation de la
													// m�thode REGEX

			do {

				if (j == 4) {
					System.out.println("Qu'elle est la valeur du code � l'it�ration " + i + " ? Il vous reste " + j
							+ " essais . Spoiler, c'est " + Code[i]);
					j--;
				}
				Prop[i] = sc.next();
				Pattern p = Pattern.compile(Code[i]); // en utilisant la m�thode regex, demander de v�rifier si les
														// entr�es
														// de Code[i] sont compatibles avec Prop[i]
				Matcher m = p.matcher(Prop[i]); // cherche prop dans code

				// **************************************************************************************************

				int comparaison = Prop[i].compareTo(Code[i]);// donne a comparaison, sous la forme d'un integer, la
																// valeur de la comparaison des string de prop et code.

				if (comparaison < 0 && j < 5) {

					if (j > 0)
						System.out.println("Faux, qu'elle est la valeur du code � l'it�ration " + i
								+ " ? Essayez plus haut. Il vous reste " + j + " essais. Spoiler, c'est " + Code[i]);

				} else if (comparaison > 0 && j < 5) {
					if (j > 0)
						System.out.println("Faux, qu'elle est la valeur du code � l'it�ration " + i
								+ " ? Essayez plus bas. Il vous reste " + j + " essais. Spoiler, c'est " + Code[i]);

				} else if (comparaison == 0) {
					System.out.println("Correct pour l'it�ration " + i + " .");
					Solution[i] = Prop[i];
					break;
				}
				j--;
			} while (j > -1);

		}
		System.out.println("\nVoici la solution pour le code � d�chiffrer : \n");
		for (int i = 0; i < CodeInt.length; i++) {
			System.out.print(Solution[i] + " ");
		}

	}

}
