package Core;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		GetPropertiesValues values = new GetPropertiesValues();
		values.getPropertiesValues();
		System.out.println("Mode dev : " + values.getModeDev());
		System.out.println("Nombre entrée : " + values.getNombreEntree());
		System.out.println("Nombre d'essais : " + values.getNombreEssais());

//		**********************************************************************
		
	//	TableauCode code = new TableauCode();
	//	System.out.println("----------------- \nRésultat de Tableau_Code\n" + code.getCode());
		
//		**********************************************************************
		ChoixMode choice = new ChoixMode();
		if(choice.getChoix() == "1") {
			VerifCodeAuto bot = new VerifCodeAuto();
			System.out.println("----------------- \nRésultat de Verif_Code_Auto\n" + bot.getPropStr());
		}
		
		else if(choice.getChoix()=="2") {
			VerifCodeManuel player = new VerifCodeManuel();
			System.out.println("----------------- \nRésultat de Verif_Code_Manuel\n");
		}
		
		else if(choice.getChoix()=="3") {
			VerifCodeManuel player = new VerifCodeManuel();
			VerifCodeAuto bot = new VerifCodeAuto();
			//Faire une comparaison du nombre de coups nécessaire à la résolution du code pour les deux parties. Celle qui en a le moins gagne.
			System.out.println("L'ordinateur a trouvé la solution en **** coups.\nLe joueur a trouvé la solution en **** coups.");
			
		}
//		**********************************************************************
		


		
		
	}

}
