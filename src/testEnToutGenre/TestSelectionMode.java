package testEnToutGenre;

import java.util.Scanner;

public class TestSelectionMode {
	public static void main(String[] args) {
		String Choix;
		boolean Condition = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*************** Bienvenue *************** \n \n Veuillez sélectionner un mode de jeu : "
				+ "\n \n 1 - Défenseur\n 2 - Challenger\n 3 - Duel ");
		Choix = sc.nextLine();
		
		System.out.println(Choix);
		
		while (Condition == false) {
			
			if (Choix.contains("1") || Choix.contains("Défenseur") || Choix.contains("défenseur") || Choix.contains("Defenseur")
					|| Choix.contains("defenseur")) {
				System.out.println("Mode sélectionné : Défenseur.");
				Condition = true;
				
				
			} else if (Choix.contains("2")|| Choix.contains("Challenger") || Choix.contains("challenger")) {
				System.out.println("Mode sélectionné : Challenger.");
				Condition = true;
				
				
			} else if (Choix.contains("3") || Choix.contains("Duel") || Choix.contains("duel")) {
				System.out.println("Mode sélectionné : Duel. Préparez-vous.");
				Condition = true;
				
				
				
			} else {
				System.out.println("Veuillez réitérer votre saisie. \nVeuillez sélectionner un mode de jeu : "
						+ "\n \n 1 - Défenseur\n 2 - Challenger\n 3 - Duel ");
				Choix = sc.nextLine();
			}
		}

	}

}
