package Core;

import java.util.Scanner;

public class ChoixMode {
	private String Choix;
	private boolean Condition = false;
	public ChoixMode()  {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("*************** Bienvenue *************** \n \n Veuillez s�lectionner un mode de jeu : "
				+ "\n \n 1 - D�fenseur\n 2 - Challenger\n 3 - Duel ");
		Choix = sc.nextLine();

		System.out.println(Choix);

		while (Condition == false) {

			if (Choix.contains("1") || Choix.contains("D�fenseur") || Choix.contains("d�fenseur")
					|| Choix.contains("Defenseur") || Choix.contains("defenseur")) {
				System.out.println("Mode s�lectionn� : D�fenseur.");
				Condition = true;
				Choix = "1";

			} else if (Choix.contains("2") || Choix.contains("Challenger") || Choix.contains("challenger")) {
				System.out.println("Mode s�lectionn� : Challenger.");
				Condition = true;
				Choix = "2";
				
			} else if (Choix.contains("3") || Choix.contains("Duel") || Choix.contains("duel")) {
				System.out.println("Mode s�lectionn� : Duel. Pr�parez-vous.");
				Condition = true;
				Choix = "3";
				
			} else {
				System.out.println("Veuillez r�it�rer votre saisie. \nVeuillez s�lectionner un mode de jeu : "
						+ "\n \n 1 - D�fenseur\n 2 - Challenger\n 3 - Duel ");
				Choix = sc.nextLine();
			}
		}
	}
	
//	********************** Getter **********************	
	
	public String getChoix() {
		return Choix;
	}


}
