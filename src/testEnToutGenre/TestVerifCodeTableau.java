package testEnToutGenre;

import java.util.Scanner;

public class TestVerifCodeTableau {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Cr�er un objet permettant la lecture des entr�es clavier.

		System.out.println("Veuillez entrer le nombre de chiffres pr�sent dans le code.");
		int nombreEntreeTab = sc.nextInt(); // Attribue � nombreEntreeTab la valeur entr�e pr�c�demment sous la forme d'un int
		int Code[] = new int[nombreEntreeTab];
		int Prop[] = new int[Code.length]; // cr�e deux tableaux de longueur �gale.
		
		
		
		for (int i = 0; i < Code.length; i++) { // cr�e une boucle attribuant � Code[] une valeur al�atoire � chaque entr�e
			double X = Math.round((-0.5) + Math.random() * 10);
			Code[i] = (int) X;
			System.out.print(Code[i]+" ");
			if (i==Code.length - 1) {
				System.out.println("\n-----------------------------------------"); // permet un affichage plus propre du code
			}
		}
		
		
		
		for (int i = 0; i < Code.length; i++) { // V�rifie les conditions d'�galit� entre Prop[i] et Code [i]
			int iMin = 0;
			int iMax = 10;
			Prop[i] = (iMax - iMin) / 2 + iMin;
			System.out.println("Prop[" + i + "] : " + Prop[i] + "    iMax = " + iMax + "    iMin = " + iMin);

			do {
				if (Prop[i] < Code[i]) {
					iMin = Prop[i]++;
					Prop[i] = (iMax - iMin) / 2 + iMin;
					System.out.println(
							"Prop[" + i + "] (P<C) : " + Prop[i] + "    iMax = " + iMax + "    iMin = " + iMin);
				} else if (Prop[i] > Code[i]) {
					iMax = Prop[i]--;
					Prop[i] = (iMax - iMin) / 2 + iMin;
					System.out.println(
							"Prop[" + i + "] (P>C) : " + Prop[i] + "    iMax = " + iMax + "    iMin = " + iMin);
				}else if (Prop[i] == Code[i]) {
					System.out.println("Le code � l'it�ration " + i + " est : " + Prop[i]);
					break;
				}
				
			} while (true);
		}
		
		
		
		System.out.println("\nLe code �tait : "); // affiche le code r�solu
		for (int i = 0; i<Prop.length;i++) {
		System.out.print(Prop[i] + " ");
		}
	}
}